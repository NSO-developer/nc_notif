/*
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 * This file has been auto-generated by the confdc compiler.
 * Source: ../load-dir/openconfig-bgp.fxs
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 */

package com.example.ocall.namespaces;

import com.tailf.conf.ConfNamespace;

/** Autogenerated namespace class for YANG module openconfig-bgp.yang */
public class openconfigBgp extends ConfNamespace {
    public static final int hash = 211080827;
    public int hash() {
        return openconfigBgp.hash;
    }

    public static final String id = "_oc-all-nc-1.0:oc-all-nc-1.0#http://openconfig.net/yang/bgp";
    public String id() {
        return openconfigBgp.id;
    }

    public static final String uri = "_oc-all-nc-1.0:oc-all-nc-1.0#http://openconfig.net/yang/bgp";
    public String uri() {
        return openconfigBgp.uri;
    }

    public String xmlUri() {
        return ConfNamespace.truncateToXMLUri(openconfigBgp.uri);
    }

    public static final String prefix = "oc-bgp";
    public String prefix() {
        return openconfigBgp.prefix;
    }

    public openconfigBgp() {}

    public static int stringToHash(String str) {
        return ConfNamespace.stringToHash(str);
    }

    public static String hashToString(int hash) {
        return ConfNamespace.hashToString(hash);
    }

}
