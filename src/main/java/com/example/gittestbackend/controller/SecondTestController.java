package com.example.gittestbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondTestController {

    @GetMapping("/hello")
    public void hello() {
        System.out.println("HELLO WORLD");
    }

}
