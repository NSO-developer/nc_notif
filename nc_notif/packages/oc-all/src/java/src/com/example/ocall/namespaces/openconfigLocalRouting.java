/*
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 * This file has been auto-generated by the confdc compiler.
 * Source: ../load-dir/openconfig-local-routing.fxs
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 */

package com.example.ocall.namespaces;

import com.tailf.conf.ConfNamespace;

/** Autogenerated namespace class for YANG module openconfig-local-routing.yang */
public class openconfigLocalRouting extends ConfNamespace {
    public static final int hash = 2032639807;
    public int hash() {
        return openconfigLocalRouting.hash;
    }

    public static final String id = "_oc-all-nc-1.0:oc-all-nc-1.0#http://openconfig.net/yang/local-routing";
    public String id() {
        return openconfigLocalRouting.id;
    }

    public static final String uri = "_oc-all-nc-1.0:oc-all-nc-1.0#http://openconfig.net/yang/local-routing";
    public String uri() {
        return openconfigLocalRouting.uri;
    }

    public String xmlUri() {
        return ConfNamespace.truncateToXMLUri(openconfigLocalRouting.uri);
    }

    public static final String prefix = "oc-loc-rt";
    public String prefix() {
        return openconfigLocalRouting.prefix;
    }

    public openconfigLocalRouting() {}

    public static int stringToHash(String str) {
        return ConfNamespace.stringToHash(str);
    }

    public static String hashToString(int hash) {
        return ConfNamespace.hashToString(hash);
    }

    public static final int    _LOCAL_LINK = 297129746;
    public static final String _LOCAL_LINK_ = "LOCAL_LINK";
    public static final int    _LOCAL_DEFINED_NEXT_HOP = 1252477086;
    public static final String _LOCAL_DEFINED_NEXT_HOP_ = "LOCAL_DEFINED_NEXT_HOP";
    public static final int    _DROP = 1226140191;
    public static final String _DROP_ = "DROP";
}
