package com.example.warmingupandtraining;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // This annotation marks the class as a controller where every method returns a domain object instead of a view.
public class MessageController {

    @GetMapping("/message") // This annotation ensures that HTTP GET requests to /message are mapped to the showMessage() method.
    public String showMessage() {
        // This method returns a simple custom message.
        return "Welcome to Spring Boot!";
    }
}