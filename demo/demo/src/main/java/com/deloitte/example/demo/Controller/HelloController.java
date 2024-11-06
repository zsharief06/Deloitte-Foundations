package com.deloitte.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${user}")
    private String user;

    @GetMapping("/")
    public String helloWorld() {
        return "YOOOOO " +  user + ", Welcome to Spring sessions.";
            }
                    }

