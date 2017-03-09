package com.vakhnenko.test.services;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Greeting, user!";
    }
}
