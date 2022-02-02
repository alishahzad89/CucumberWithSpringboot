package com.cucumber.springboot.utils;
import com.cucumber.springboot.context.ApiContext;
import io.restassured.RestAssured;
import io.restassured.config.DecoderConfig;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestUtils {
    static Response response = null;
    static RequestSpecification requestSpecification;

    public static Response getCallGeneric(ApiContext api) {
        System.out.println("Start of get call generic");
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.config = RestAssured.config.decoderConfig(DecoderConfig.decoderConfig().noContentDecoders());
        requestSpecification = RestAssured.given().log().all();
        setQueryParamHeaderAndPayloadMaps(api);
        response= requestSpecification.get(api.host + api.actualURL);
        response.then().log().all();
        return response;
    }

    public static void setQueryParamHeaderAndPayloadMaps(ApiContext api)
    {
        if (api.headerMap != null) {
            requestSpecification.headers(api.headerMap);
        }
        if (api.queryMap != null) {
            requestSpecification.queryParams(api.queryMap);
        }
        if (api.requestPayload != null) {
            requestSpecification.body(api.requestPayload);
        }
    }
}
