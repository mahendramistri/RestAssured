package com.rest;

import io.restassured.path.json.JsonPath;

public class LombokStudentTest {
    public static void main(String[] args) {
        LombokStudent student = new LombokStudent();
        student.setSttudentId(001);
        student.setStudentName("Mahendra Misri");
        System.out.println(student.getSttudentId()+" "+student.getStudentName());

    }
}
