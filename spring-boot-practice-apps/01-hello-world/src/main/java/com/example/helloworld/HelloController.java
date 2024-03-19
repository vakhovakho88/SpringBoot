package com.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String sayHelloToWorld(){
        return  "Hello World";
    }

    @GetMapping("/u")
    public String sayHelloToMe(){
        return  "Hello U";
    }

}
