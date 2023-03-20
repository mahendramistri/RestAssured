package com.rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class PayloadTest {
    static Map<String , String> map = new HashMap<>();
    public static void main(String[] args) {
        given().
                baseUri("https://api.postman.com").header("",map).body(getData()).
                when().
                get("/workspaces").
                then().
                log().all().
                assertThat().
                statusCode(401);
    }
   public static ArrayList getData() {
        HashMap<String,String > hashMap1 = new HashMap<>();
        hashMap1.put("name","Mahendra");
        hashMap1.put("designation","QA");
        HashMap<String,String > hashMap2 = new HashMap<>();
        hashMap2.put("name","Mahendra");
        hashMap2.put("designation","QA");
        ArrayList<HashMap> arrayList = new ArrayList<>();
        arrayList.add(hashMap1);
        arrayList.add(hashMap2);
        return  arrayList;

    }
}
