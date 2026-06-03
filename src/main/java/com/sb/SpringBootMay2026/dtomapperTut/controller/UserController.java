package com.sb.SpringBootMay2026.dtomapperTut.controller;


import com.sb.SpringBootMay2026.dtomapperTut.dto.UserRequest;
import com.sb.SpringBootMay2026.dtomapperTut.dto.UserResponse;
import com.sb.SpringBootMay2026.dtomapperTut.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public UserResponse createUser(@RequestBody UserRequest request) {
        return service.createUser(request);
    }

}