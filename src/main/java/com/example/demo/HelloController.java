package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/hello3")
    public Map<String, String> hello() {
        return Map.of("greeting3", "Hello, World!");
    }
}