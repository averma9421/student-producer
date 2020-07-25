package com.stackdev.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.stackdev.model.Student;

@RestController
public class TestController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public Student firstPage() {

        Student s = new Student();
        s.setName("Anshu");
        s.setClass(12);
        s.setsId("1");

        return s;
    }

}