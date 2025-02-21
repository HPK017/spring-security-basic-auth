package com.example.spring_security_auth.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class StudentController {
    
    public String greeting(Authentication authentication){

        String userName = authentication.getName();

        return "Spring security In-memory Authentication Example - Welcome" + userName;
    }
}
