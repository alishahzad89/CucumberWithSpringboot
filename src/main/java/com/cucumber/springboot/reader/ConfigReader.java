package com.cucumber.springboot.reader;

import com.cucumber.springboot.context.AppContext;

import java.util.Properties;

public class ConfigReader {

    private static Boolean firstExecution = true;
    private static ConfigReader config = null;
    public final Properties projectConfig = new Properties();
    public final Properties dbConfig = new Properties();

    private ConfigReader() {
    }

    public void getProjectConfiguration(String projectName) {
        if (firstExecution) {
            System.out.println("read property of project " + projectName);
            populateDBConfig(projectName);
            populateEnvironmentConfig(projectName);
            if (projectName.equalsIgnoreCase("API")) {
                AppContext.hostname = projectConfig.getProperty("base.url");
                System.out.println(AppContext.hostname);
            }
            firstExecution = false;
        }
    }

    public static ConfigReader getInstance() {
        if (config == null) {
            config = new ConfigReader();
        }
        return config;
    }

    private void populateDBConfig(String projectName) throws RuntimeException {
        try {
            System.out.println(" calling set db config " +projectName);
            dbConfig.load(getClass().getClassLoader().getResourceAsStream("db/" + projectName + ".properties"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void populateEnvironmentConfig(String projectName) throws RuntimeException {
        try {
            System.out.println(" calling set user config");
            projectConfig.load(getClass().getClassLoader().getResourceAsStream("project/" + projectName + ".properties"));
        } catch (Exception e) {
            throw new RuntimeException("Unable to populate project configuration", e);
        }
    }

    private Properties populateConfig(String resourcePath) throws RuntimeException {
        Properties config = new Properties();
        try {
            config.load(getClass().getClassLoader().getResourceAsStream(resourcePath));
        } catch (Exception e) {
            throw new RuntimeException("Unable to populate project configuration", e);
        }
        return config;
    }

}
