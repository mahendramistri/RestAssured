package com.rest;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.Filter;
import io.restassured.filter.FilterContext;
import io.restassured.filter.cookie.CookieFilter;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.*;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.mapper.ObjectMapper;
import io.restassured.mapper.ObjectMapperType;
import io.restassured.response.Response;
import io.restassured.specification.*;
import org.apache.groovy.json.internal.Exceptions;
import org.hamcrest.Matcher;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.URI;
import java.net.URL;
import java.security.KeyStore;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AutomateGet {
    RequestSpecification requestSpecification;
    ResponseSpecification responseSpecification;

    @BeforeClass
    public void beforeFilter() throws FileNotFoundException {
        System.out.println("-----------Before class-----------------");
        PrintStream printStream = new PrintStream(new File("/home/dell/Documents/Projects/RestAssured/src/test/resources/logdetail.log"));
        RequestSpecBuilder requestSpecBuilder = new RequestSpecBuilder().addFilter(new RequestLoggingFilter(LogDetail.METHOD,printStream))
                .addFilter(new ResponseLoggingFilter(LogDetail.STATUS,printStream));
        requestSpecification =  requestSpecBuilder.build();

        ResponseSpecBuilder  responseSpecBuilder = new ResponseSpecBuilder();
        responseSpecification = responseSpecBuilder.build();
    }

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
    @Test
    public void hamcreastAssertTest() throws FileNotFoundException {
        given(requestSpecification).baseUri("https://reqres.in/").when().get("/api/users?page=2").then().spec(responseSpecification).log().status().assertThat().statusCode(200);
    }
}
