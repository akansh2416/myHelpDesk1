package com.mahaveer.myHelpDesk.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String health() {
        return "OK";
    }

    @GetMapping("/health")
    public String actuatorHealth() {
        return "{\"status\":\"UP\"}";
    }
}
