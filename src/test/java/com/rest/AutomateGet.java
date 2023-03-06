package com.rest;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class AutomateGet {

    @Test
    public void validate_status_code(){
        given().
                baseUri("https://api.postman.com").
                header("X-Api-Key", "PMAK-6401bb7b9860447202e15e54-a2c937fac8ca3d4d1e388fcf2c287103f4").
        when().
                get("/workspaces").
        then().
                log().all().
                assertThat().
                statusCode(200);


    }
}
