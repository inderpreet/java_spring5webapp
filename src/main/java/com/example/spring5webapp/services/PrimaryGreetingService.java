package com.example.spring5webapp.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en", "default"})
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String getGreeting() {
        return "Primary Greeting Service was started and this string was returned";
    }
}
