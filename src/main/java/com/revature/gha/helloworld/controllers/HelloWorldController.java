package com.revature.gha.helloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable("name") String name){
        return "Hello "+name.toUpperCase();
    }
}
