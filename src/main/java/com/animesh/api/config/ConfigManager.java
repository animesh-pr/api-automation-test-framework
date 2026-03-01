package com.animesh.api.config;

import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {

    private static Properties properties = new Properties();

    static {
        try {
            String env = System.getProperty("env", "qa");

            InputStream input = ConfigManager.class
                    .getClassLoader()
                    .getResourceAsStream("config-" + env + ".properties");

            properties.load(input);

        } catch (Exception e) {
            throw new RuntimeException("Failed to load config file");
        }
    }

    public static String get(String key) {
        return properties.getProperty(key);
    }
}