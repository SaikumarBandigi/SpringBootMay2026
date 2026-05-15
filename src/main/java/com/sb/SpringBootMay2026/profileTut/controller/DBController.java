package com.sb.SpringBootMay2026.profileTut.controller;


import com.sb.SpringBootMay2026.profileTut.service.DBService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/profileTut")
public class DBController {

    private final DBService dbService;

    public DBController(DBService dbService) {
        this.dbService = dbService;
    }

    @GetMapping("/connect")
    public String connectDB() {
        return dbService.connect();
    }

}