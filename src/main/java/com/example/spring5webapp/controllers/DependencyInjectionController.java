package com.example.spring5webapp.controllers;

import com.example.spring5webapp.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DependencyInjectionController {

    public GreetingService greetingService;

    // This is constructor Injection. The argument in the constructor gets the object autowired by Spring and
    // hence no null pointer exception is encountered.
    @Autowired //@Qualifier("myGreetingService")
    public DependencyInjectionController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.getGreeting();
    }
}
