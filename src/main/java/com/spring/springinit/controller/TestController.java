package com.spring.springinit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @Value("${admin.name}")
    private String name;
    @GetMapping("/name")
    public String name(){
        return "I am "+ name;
    }


    @GetMapping("/number")
    public String number(){
        return "70 ";
    }
}



