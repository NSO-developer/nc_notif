/*
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 * This file has been auto-generated by the confdc compiler.
 * Source: ../load-dir/openconfig-isis.fxs
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 */

package com.example.ocall.namespaces;

import com.tailf.conf.ConfNamespace;

/** Autogenerated namespace class for YANG module openconfig-isis.yang */
public class openconfigIsis extends ConfNamespace {
    public static final int hash = 1332960605;
    public int hash() {
        return openconfigIsis.hash;
    }

    public static final String id = "_oc-all-nc-1.0:oc-all-nc-1.0#http://openconfig.net/yang/openconfig-isis";
    public String id() {
        return openconfigIsis.id;
    }

    public static final String uri = "_oc-all-nc-1.0:oc-all-nc-1.0#http://openconfig.net/yang/openconfig-isis";
    public String uri() {
        return openconfigIsis.uri;
    }

    public String xmlUri() {
        return ConfNamespace.truncateToXMLUri(openconfigIsis.uri);
    }

    public static final String prefix = "oc-isis";
    public String prefix() {
        return openconfigIsis.prefix;
    }

    public openconfigIsis() {}

    public static int stringToHash(String str) {
        return ConfNamespace.stringToHash(str);
    }

    public static String hashToString(int hash) {
        return ConfNamespace.hashToString(hash);
    }

}