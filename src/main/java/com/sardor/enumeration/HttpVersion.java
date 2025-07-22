package com.sardor.enumeration;

import com.sardor.enumeration.headers.EnumUtils;

public enum HttpVersion implements EnumUtils {
    HTTP_1_0("HTTP/1.0"),
    HTTP_1_1("HTTP/1.1"),
    HTTP_2_0("HTTP/2.0"),
    HTTP_3_0("HTTP/3.0");

    private final String versionString;

    HttpVersion(String versionString) {
        this.versionString = versionString;
    }
}
