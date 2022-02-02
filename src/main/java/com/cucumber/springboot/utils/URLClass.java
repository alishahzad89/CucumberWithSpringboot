package com.cucumber.springboot.utils;

public class URLClass {

    public enum apiURL {
        getChannel("/bolt/v3/webB2CGDMSTGExy0sVDlZMzNDdUyZ/channels"),
        getProductDetails("/api/v1/search/test/${product}");
        private String apiURL;
        apiURL(String apiPath) {
            this.apiURL = apiPath;
        }
        public String getPathName() {
            return apiURL;
        }
    }

    public enum productType{
        apple,mango,car,invalid
    }
}
