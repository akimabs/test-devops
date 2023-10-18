package com.example.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @RequestMapping("/")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/health")
    public String health() {
        return "Health check";
    }
}
