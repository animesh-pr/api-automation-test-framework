package com.animesh.api.tests;

import java.util.List;
import java.util.Map;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.animesh.api.core.BaseTest;
import com.animesh.api.retry.RetryAnalyzer;
import com.animesh.api.services.UserService;
import com.animesh.api.utils.JsonUtils;

import io.restassured.response.Response;

public class UserTests extends BaseTest {

    UserService userService = new UserService();

    @DataProvider(name = "userData")
    public Object[][] getUserData() {

        List<Map<String, Object>> data =
                JsonUtils.readJson("user-data.json");

        Object[][] testData = new Object[data.size()][1];

        for (int i = 0; i < data.size(); i++) {
            testData[i][0] = data.get(i);
        }

        return testData;
    }

    @Test(dataProvider = "userData",
          retryAnalyzer = RetryAnalyzer.class,
          groups = {"smoke"})
    public void createUserTest(Map<String, Object> body) {

        Response response = userService.createUser(body);

        response.then()
                .statusCode(201)
                .body("name", equalTo(body.get("name")))
                .time(lessThan(5000L));
    }

    @Test(groups = {"regression"})
    public void getUserTest() {

        userService.getUser(1)
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .body("email", containsString("@"));
    }
}