package com.sb.SpringBootMay2026.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Example {

    @GetMapping("/getThatMessage")
    public ResponseEntity<String> getThatMessage() {
        return new ResponseEntity<>("Hello World", HttpStatus.OK);
    }

}
