package com.cucumber.springboot.datasets;

import lombok.Data;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@Component
public class RunConfiguration {

    @Value("${browser:default}")
    public String browser;

    @Value("${testType}")
    public String testType;

}
