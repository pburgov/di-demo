package com.pburgov.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String SALUDO_ORIGINAL = "Saludo Original!!";

    @Override
    public String sayGreeting() {
        return SALUDO_ORIGINAL;
    }
}
