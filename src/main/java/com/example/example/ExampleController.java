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

    @RequestMapping("/fibonanci")
    public String fibonacciEndpoint() {
        return fibonacci(42);
    }

    public String fibonacci(int n) {
        if (n < 0) {
            return "Invalid input. Please provide a non-negative number.";
        }

        // Generate the Fibonacci sequence iteratively
        StringBuilder result = new StringBuilder();
        int first = 0, second = 1;
        result.append("Fibonacci Sequence for n = " + n + ":\n");

        if (n >= 1) {
            result.append(first);
        }

        for (int i = 1; i < n; i++) {
            result.append(", ").append(second);
            int next = first + second;
            first = second;
            second = next;
        }

        return result.toString();
    }
}
