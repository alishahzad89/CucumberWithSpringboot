package com.cucumber.springboot.steps;

import com.cucumber.springboot.datasets.RunConfiguration;
import io.cucumber.java.en.Given;
import io.cucumber.junit.Cucumber;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Calendar;

public class DummySteps {

    @Autowired
    RunConfiguration runConfiguration;

    @Given("^lets have a common call$")
    public void testSteps(){
        System.out.println("Inside the dummy steps");
        System.out.println("Run " +runConfiguration.browser);
        System.out.println("Run " +runConfiguration.testType);
        System.out.println(" " + Thread.currentThread().getId());
    }
}
