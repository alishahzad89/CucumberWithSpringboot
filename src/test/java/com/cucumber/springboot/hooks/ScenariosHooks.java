package com.cucumber.springboot.hooks;

import com.cucumber.springboot.reader.ConfigReader;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ScenariosHooks {

//    @Autowired
    public ConfigReader readConfig;

   @Before
    public void beforeScenarios(Scenario scn){
       System.out.println("Before scenarios----------" + scn.getId());
       readConfig = ConfigReader.getInstance();
       readConfig.getProjectConfiguration("api");
       System.out.println(readConfig.dbConfig.getProperty("server_url"));
    }
}
