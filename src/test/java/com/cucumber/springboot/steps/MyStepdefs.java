package com.cucumber.springboot.steps;

import com.cucumber.springboot.context.ApiContext;
import com.cucumber.springboot.context.AppContext;
import com.cucumber.springboot.response.error.BoltErrorResponse;
import com.cucumber.springboot.utils.RestUtils;
import com.cucumber.springboot.utils.URLClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyStepdefs {

    @Given("^Check for simple get api for (.*)$")
    public void getContext(URLClass.apiURL apiURL) {
        System.out.println("Inside get context");
        AppContext.apiHttp = ApiContext.getDefaultTestApiHttpDetails();
        AppContext.apiHttp.actualURL = apiURL.getPathName();
    }

    @When("^Hit the get api$")
    public void hitAPI() {
        System.out.println("Inside hit api");
        AppContext.response = RestUtils.getCallGeneric(AppContext.apiHttp);
        System.out.println("exit hit api");
    }

    @Then("^validate response$")
    public void validate() {
        System.out.println("Inside validate response");
//        AppContext.response.getBody().prettyPrint();
        BoltErrorResponse boltErrorResponse = AppContext.response.as(BoltErrorResponse.class);
        System.out.println(boltErrorResponse.getError().getCode());
    }
}
