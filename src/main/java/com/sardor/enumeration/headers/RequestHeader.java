package com.sardor.enumeration.headers;

import com.sardor.enumeration.EnumUtils;

public enum RequestHeader implements EnumUtils {
    ACCEPT("Accept"),
    ACCEPT_ENCODING("Accept-Encoding"),
    ACCEPT_LANGUAGE("Accept-Language"),
    AUTHORIZATION("Authorization"),
    COOKIE("Cookie"),
    HOST("Host"),
    USER_AGENT("User-Agent"),
    REFERER("Referer"),
    CONTENT_TYPE("Content-Type"),
    CONTENT_LENGTH("Content-Length");

    private final String headerName;

    RequestHeader(String headerName) {
        this.headerName = headerName;
    }
}
