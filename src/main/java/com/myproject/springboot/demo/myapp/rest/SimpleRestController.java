package com.myproject.springboot.demo.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SimpleRestController {

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
