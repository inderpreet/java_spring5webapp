package com.example.spring5webapp.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

// Implementation of the Service... This is a depency for a Controller
@Service
@Profile("my")
public class MyGreetingService implements GreetingService{
    @Override
    public String getGreeting() {
            return "My Greeting Service Started and this string was returned";
    }
}
