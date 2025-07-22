package com.sardor.enumeration.headers;

public enum ResponseHeader implements EnumUtils {
    SERVER("Server"),
    SET_COOKIE("Set-Cookie"),
    WWW_AUTHENTICATE("WWW-Authenticate"),
    CONTENT_TYPE("Content-Type"),
    CONTENT_LENGTH("Content-Length"),
    LOCATION("Location"),
    RETRY_AFTER("Retry-After"),
    CONTENT_DISPOSITION("Content-Disposition"),
    ACCESS_CONTROL_ALLOW_ORIGIN("Access-Control-Allow-Origin");

    private final String headerName;

    ResponseHeader(String headerName) {
        this.headerName = headerName;
    }


    @Override
    public String secondName() {
        return headerName;
    }
}
