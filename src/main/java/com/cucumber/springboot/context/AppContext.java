package com.cucumber.springboot.context;

import java.util.HashMap;

import io.restassured.response.Response;

import java.util.Map;

public class AppContext {
    public static ApiContext apiHttp;
    public static String environment = "";
    public static String hostname = "";
    public static Response response;
    public static Map<String,String> sharedDataMap = new HashMap<>();
    public static Map<String,Object> framework = new HashMap<>();
    public static Map<String,String> testexecution = new HashMap<>();
}
