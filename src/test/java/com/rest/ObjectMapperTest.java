package com.rest;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class ObjectMapperTest {
    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
       City city =  objectMapper.readValue(new File("/home/dell/Documents/Projects/RestAssured/src/test/resources/foo.json"),City.class);
        String cityid = city.getLocation();
        String country = city.getCountry();
        System.out.println(cityid +" "+country) ;

        //Serialization of a Hasmap through ObjectMapper
        HashMap<String,String > hashMap1 = new HashMap<>();
        hashMap1.put("name","Mahendra");
        hashMap1.put("designation","QA");
        // Using objectmapper obj create node and get string
        ObjectMapper objectMapper1 = new ObjectMapper();
        String str = objectMapper1.writeValueAsString(hashMap1);
        System.out.println(str.toString());
        ObjectNode objectNode = objectMapper1.createObjectNode();
       String s = objectMapper1.writeValueAsString(objectNode);
    }
}
