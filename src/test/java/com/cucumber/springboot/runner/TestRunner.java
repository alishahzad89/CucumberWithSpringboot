package com.cucumber.springboot.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "classpath:com.cucumber.springboot",
        publish = true,
        tags = "@All"
)
public class TestRunner {
}
