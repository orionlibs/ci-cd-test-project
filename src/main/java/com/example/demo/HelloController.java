package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/hello5")
    public Map<String, String> hello() {
        return Map.of("greeting5", "Hello, World!");
    }
}