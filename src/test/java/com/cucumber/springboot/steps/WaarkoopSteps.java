package com.cucumber.springboot.steps;

import com.cucumber.springboot.context.ApiContext;
import com.cucumber.springboot.context.AppContext;
import com.cucumber.springboot.response.error.BoltErrorResponse;
import com.cucumber.springboot.response.waarkoop.ProductDetailsResponse;
import com.cucumber.springboot.utils.RestUtils;
import com.cucumber.springboot.utils.URLClass;
import com.sun.xml.bind.v2.model.core.EnumConstant;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.URL;


import static org.assertj.core.api.Assertions.assertThat;
public class WaarkoopSteps {

    @Given("^he calls endpoint (.*) for product as (.*)")
    public void getContext(URLClass.apiURL apiURL, String productName) {
        System.out.println("Inside get context");
        AppContext.apiHttp = ApiContext.getDefaultTestApiHttpDetails();
        AppContext.apiHttp.actualURL = apiURL.getPathName().replace("${product}",productName);
        AppContext.response = RestUtils.getCallGeneric(AppContext.apiHttp);
    }

    @When("^he sees the results displayed for (.*)")
    public void hitAPI(String productName) {
//        AppContext.response.getBody().prettyPrint();
        System.out.println("Validate waarkoop response here");
        ProductDetailsResponse [] productDetailsResponse = AppContext.response.as(ProductDetailsResponse[].class);
        System.out.println(productDetailsResponse.length + " size of reseponse is ");

        assertThat(productDetailsResponse.length).as("validate count").isEqualTo(62);

    }

}
