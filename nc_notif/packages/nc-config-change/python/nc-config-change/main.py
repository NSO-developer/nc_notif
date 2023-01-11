# -*- mode: python; python-indent: 4 -*-
import ncs
import _ncs
from ncs.application import Service
from ncs.dp import Action
from ncs.maapi import Maapi


_ncs = __import__('_ncs') # pylint: disable=invalid-name

class HandleNCConfigNotification(Action):
    @Action.action
    def cb_action(self, uinfo, name, kp, input, output, trans):
        device_name = kp[1][0]
        self.log.info("action(uinfo={0}, name={1}, dev={2})".format(uinfo.usid, name, device_name))
        self.log.info("input.path: %s" % input.path)

        if input.tid is not None:
            with Maapi() as m:
                th = m.attach(input.tid)
                try:
                    notification = ncs.maagic.get_node(th, input.path)
                    cb = notification.changed_by
                    self.log.info("notif(username={0}, session_id={1}, source_host={2})".format(cb.username, cb.session_id, cb.source_host))

                    for edit in notification.edit:
                        self.log.info("edit(operation={0}, target={1})".format(edit.operation, edit.target))

                    root = ncs.maagic.get_root(m)
                    device = root.devices.device[device_name]
                    output = device.compare_config()
                    if output.diff is not None:
                        self.log.info("Detected out of band change on device: %s" % device_name)
                        self.log.info("Compare_Config Diff: %s" % output.diff)
                        if output.info is not None:
                            self.log.info("Compare_Config Info: %s" % output.info)
                        self.log.info("Syncing configuration...")
                        output = device.sync_from()
                        self.log.info("Sync_from Result: %s" % output.result)
                        if not output.result:
                            self.log.info("Sync_from Error: %s" % output.info)
                    else:
                        self.log.info("Device is in sync")
                finally:
                    m.detach(input.tid)
                    
# ---------------------------------------------
# COMPONENT THREAD THAT WILL BE STARTED BY NCS.
# ---------------------------------------------
class Main(ncs.application.Application):

    #pylint: disable=attribute-defined-outside-init
    def setup(self):
        # The application class sets up logging for us. It is accessible
        # through 'self.log' and is a ncs.log.Log instance.
        self.log.info('nc-config-change RUNNING')

        self.register_action('handle-nc-config-notification', HandleNCConfigNotification)

    def teardown(self):
        # When the application is finished (which would happen if NCS went
        # down, packages were reloaded or some error occurred) this teardown
        # method will be called.

        self.log.info('nc-config-change FINISHED')
