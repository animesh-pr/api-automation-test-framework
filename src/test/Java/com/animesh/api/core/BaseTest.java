package com.animesh.api.core;

import com.animesh.api.config.ConfigManager;
import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    @BeforeSuite
    public void setup() {
        RestAssured.baseURI = ConfigManager.get("base.url");
    }
}