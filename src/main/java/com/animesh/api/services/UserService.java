package com.animesh.api.services;

import com.animesh.api.core.RequestSpecUtil;

import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class UserService {

    private static final String USERS = "/users";

    public Response createUser(Object body) {
        return given()
                .spec(RequestSpecUtil.getRequestSpec())
                .body(body)
                .post(USERS);
    }

    public Response getUser(int id) {
        return given()
                .spec(RequestSpecUtil.getRequestSpec())
                .pathParam("id", id)
                .get(USERS + "/{id}");
    }

    public Response updateUser(int id, Object body) {
        return given()
                .spec(RequestSpecUtil.getRequestSpec())
                .body(body)
                .put(USERS + "/" + id);
    }

    public Response deleteUser(int id) {
        return given()
                .spec(RequestSpecUtil.getRequestSpec())
                .delete(USERS + "/" + id);
    }
}