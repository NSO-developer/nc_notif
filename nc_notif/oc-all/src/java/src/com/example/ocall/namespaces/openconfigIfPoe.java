/*
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 * This file has been auto-generated by the confdc compiler.
 * Source: ../load-dir/openconfig-if-poe.fxs
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 */

package com.example.ocall.namespaces;

import com.tailf.conf.ConfNamespace;

/** Autogenerated namespace class for YANG module openconfig-if-poe.yang */
public class openconfigIfPoe extends ConfNamespace {
    public static final int hash = 433164100;
    public int hash() {
        return openconfigIfPoe.hash;
    }

    public static final String id = "_oc-all-nc-1.0:oc-all-nc-1.0#http://openconfig.net/yang/poe";
    public String id() {
        return openconfigIfPoe.id;
    }

    public static final String uri = "_oc-all-nc-1.0:oc-all-nc-1.0#http://openconfig.net/yang/poe";
    public String uri() {
        return openconfigIfPoe.uri;
    }

    public String xmlUri() {
        return ConfNamespace.truncateToXMLUri(openconfigIfPoe.uri);
    }

    public static final String prefix = "oc-poe";
    public String prefix() {
        return openconfigIfPoe.prefix;
    }

    public openconfigIfPoe() {}

    public static int stringToHash(String str) {
        return ConfNamespace.stringToHash(str);
    }

    public static String hashToString(int hash) {
        return ConfNamespace.hashToString(hash);
    }

    public static final int    _enabled = 197426095;
    public static final String _enabled_ = "enabled";
    public static final int    _state = 630973766;
    public static final String _state_ = "state";
    public static final int    _poe = 575544877;
    public static final String _poe_ = "poe";
    public static final int    _power_used = 513298623;
    public static final String _power_used_ = "power-used";
    public static final int    _power_class = 697483843;
    public static final String _power_class_ = "power-class";
    public static final int    _config = 2105663071;
    public static final String _config_ = "config";
}
