package com.animesh.api.core;

import com.animesh.api.config.ConfigManager;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpecUtil {

    public static RequestSpecification getRequestSpec() {

        // 🔥 Set Base URI from config file
        RestAssured.baseURI = ConfigManager.get("base.url");

        System.out.println("Using Base URL: " + RestAssured.baseURI);

        return new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .addHeader("User-Agent", "Mozilla/5.0")
                .addHeader("Accept", "application/json")
                .log(io.restassured.filter.log.LogDetail.ALL)
                .build();
    }
}