/*
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 * This file has been auto-generated by the confdc compiler.
 * Source: ../load-dir/openconfig-aaa.fxs
 * BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE BEWARE
 */

package com.example.ocall.namespaces;

import com.tailf.conf.ConfNamespace;

/** Autogenerated namespace class for YANG module openconfig-aaa.yang */
public class openconfigAaa extends ConfNamespace {
    public static final int hash = 1184007067;
    public int hash() {
        return openconfigAaa.hash;
    }

    public static final String id = "_oc-all-nc-1.0:oc-all-nc-1.0#http://openconfig.net/yang/aaa";
    public String id() {
        return openconfigAaa.id;
    }

    public static final String uri = "_oc-all-nc-1.0:oc-all-nc-1.0#http://openconfig.net/yang/aaa";
    public String uri() {
        return openconfigAaa.uri;
    }

    public String xmlUri() {
        return ConfNamespace.truncateToXMLUri(openconfigAaa.uri);
    }

    public static final String prefix = "oc-aaa";
    public String prefix() {
        return openconfigAaa.prefix;
    }

    public openconfigAaa() {}

    public static int stringToHash(String str) {
        return ConfNamespace.stringToHash(str);
    }

    public static String hashToString(int hash) {
        return ConfNamespace.hashToString(hash);
    }

    public static final int    _RADIUS = 1332360291;
    public static final String _RADIUS_ = "RADIUS";
    public static final int    _TACACS = 326249351;
    public static final String _TACACS_ = "TACACS";
}