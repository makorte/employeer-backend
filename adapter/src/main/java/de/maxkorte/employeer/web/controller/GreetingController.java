package de.maxkorte.employeer.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    @GetMapping("/greeting/{name}")
    public String getGreeting(@PathVariable String name) {
        return "Hello " + name;
    }
}
