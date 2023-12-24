package com.example.githubactionstest.ui;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthcheckController {

    @GetMapping("/hk")
    public String healthCheck() {
        return "SERVER IS ALIVE 12/24:18:00";
    }
}
