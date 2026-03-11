package com.example.restservice;

import java.util.concurrent.atomic.AtomicLong;

public class GreetingController {
    public static final String template = "Hello, %s!";

    private final AtomicLong counter = new AtomicLong();

    public Greeting greeting(String name) {
        return new Greeting(counter.incrementAndGet(), template.formatted(name));
    }
}
