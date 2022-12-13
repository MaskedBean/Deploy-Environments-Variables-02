package com.example.Deploy.Environments.Variables2.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @Value("${myWelcomeMessageTree.welcomeMessage}")
    String welcomeMessage;

    @GetMapping("/")
    public String getWelcomeMessage(){
        return welcomeMessage;
    }
}
