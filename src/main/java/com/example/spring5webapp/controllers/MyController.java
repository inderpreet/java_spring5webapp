package com.example.spring5webapp.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String hello(){
        System.out.println("MyController Invoked!");
        return "Hello Returned from MyController";
    }
}
