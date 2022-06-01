package com.savesh.person.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public class HelloWorld {

    @GetMapping
    public String helloWorld(){
        return "hello person";
    }
}
