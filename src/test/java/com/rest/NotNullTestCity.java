package com.rest;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class NotNullTestCity {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        City deserialization =  objectMapper.readValue(new File("/home/dell/Documents/Projects/RestAssured/src/test/resources/foo.json"),City.class);

        System.out.println(deserialization.hashMap.toString());
    }
}
