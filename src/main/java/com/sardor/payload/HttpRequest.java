package com.sardor.payload;

import java.util.Map;

public class HttpRequest {
    private String method;
    private String uri;
    private Map<String, String> headers;
    private String body;
    private Map<String, String> queryParams;
}
