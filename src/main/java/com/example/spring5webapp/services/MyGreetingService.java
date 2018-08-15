package com.example.spring5webapp.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// Implementation of the Service... This is a depency for a Controller
// My Greeting Service Bean

@Service
@Profile("sec")
public class MyGreetingService implements GreetingService{
    @Override
    public String getGreeting() {
            return "Secondary: My Greeting Service Started and this string was returned";
    }
}
