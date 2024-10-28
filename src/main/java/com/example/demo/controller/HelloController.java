package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Controller
@Mapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello!";
    }
}
