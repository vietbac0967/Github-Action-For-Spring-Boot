package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
public class HelloController {
    @GetMapping
    public String hello(){
        return "Hello world " + LocalDate.now();
    }
    @GetMapping("/bye")
    public String bye(){
        return "Goodbye see you later " + LocalDate.now();
    }
}
