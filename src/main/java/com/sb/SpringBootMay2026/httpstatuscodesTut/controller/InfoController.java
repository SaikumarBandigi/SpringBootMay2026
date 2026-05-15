package com.sb.SpringBootMay2026.httpstatuscodesTut.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {

    @GetMapping("/info")
    public ResponseEntity<String> getInfo() {

        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Message", "Continue Processing");

        return new ResponseEntity<>("100 Continue Example", headers, HttpStatus.CONTINUE);
    }
}
