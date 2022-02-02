package com.cucumber.springboot.context;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class ApiContext {
    public String host;
    public String authorization;
    public String environment;
    public String environmentKey;
    public String platform;
    public String appKey;
    public String apiVersion;



    public String actualURL;
    public Map<String,String> headerMap = new HashMap<>();
    public Map<String,Object> queryMap  = new TreeMap<>();
    public String requestPayload;


    public static ApiContext getDefaultTestApiHttpDetails() {
        ApiContext apiHttp = new ApiContext();
        apiHttp.host = AppContext.hostname;
        return apiHttp;
    }
}
