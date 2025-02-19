package com.myproject.springboot.demo.myapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

    // and properties for instrucutr name, and student class
    @Value("${instructor.name}")
    private  String instructorName;

    @Value("${student.class}")
    private String studentClass;

    @GetMapping("classinfo")
    public String getClassInfo() {
        return "Instructor: " + instructorName + ", Class: " + studentClass;
    }

    // My Application

    @GetMapping("/")
    public String app() {
        return "My Application";
    }

    // expose new endpoint for "learning"
    @GetMapping("/learning")
    public String getLearningGoals() {
        return "java module";
    }

    // expose new endpoint for "gaming"
    @GetMapping("/gaming")
    public String getDailyLevel() {
        return "complate is level gaming day";
    }

}
