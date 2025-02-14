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

}
