package com.example.warming_up_and_training.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //expose "/" that return "Hello World"
    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    // expose a new endpoint for "Workout"
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }

    //expose a new endpoint for "Fortune"
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day";
    }
}
