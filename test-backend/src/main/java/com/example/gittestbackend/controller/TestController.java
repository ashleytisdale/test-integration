package com.example.gittestbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public void test() {
        // Test controller has been modified
    }

    @PostMapping
    public void post() {

    }

}
