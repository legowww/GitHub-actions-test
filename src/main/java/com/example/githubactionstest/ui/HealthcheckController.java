package com.example.githubactionstest.ui;


import jakarta.annotation.PostConstruct;
import org.apache.catalina.Server;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HealthcheckController {

    @Value("${message:defaultMessage}")
    private String message;

    @PostConstruct
    public void init() {
        System.out.println("init: " + message);
    }

    @GetMapping("/hk")
    public String healthCheck() {
        return "SERVER IS ALIVE: " + message;
    }
}
