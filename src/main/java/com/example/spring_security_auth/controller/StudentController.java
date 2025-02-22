package com.example.spring_security_auth.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class StudentController {
    
    @GetMapping("/greeting")
    public String greeting(Authentication authentication){

        String userName = authentication.getName();

        return "Spring security In-memory Authentication Example - Welcome " + userName;
    }

    @GetMapping("/")
    public String greet(){
        return "welcome to the spring security";
    }
}
