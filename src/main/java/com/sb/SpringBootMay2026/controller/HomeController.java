package com.sb.SpringBootMay2026.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {


    @GetMapping("/get")
    public String home(String name, int age) {
        return name + " " + age;
    }

}
