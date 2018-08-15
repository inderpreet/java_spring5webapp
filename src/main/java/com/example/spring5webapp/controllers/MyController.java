package com.example.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// Code for testing out Spring Context

@Controller
public class MyController {

    public String hello(){
        System.out.println("MyController Invoked!");
        return "test_template";
    }

    // invoke on webpage request
    @RequestMapping("/test")
    public String getTest(){
        return "test_template";
    }

}
