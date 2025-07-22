package com.sardor.enumeration.headers;

public enum EntityHeader implements EnumUtils {
    ALLOW("Allow"),
    CONTENT_ENCODING("Content-Encoding"),
    CONTENT_LANGUAGE("Content-Language"),
    CONTENT_LOCATION("Content-Location"),
    CONTENT_MD5("Content-MD5"),
    CONTENT_RANGE("Content-Range"),
    EXPIRES("Expires"),
    LAST_MODIFIED("Last-Modified");

    private final String headerName;

    EntityHeader(String headerName) {
        this.headerName = headerName;
    }
}
