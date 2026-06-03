package com.sb.SpringBootMay2026.dtomapperTut.service;

import com.sb.SpringBootMay2026.dtomapperTut.dto.UserRequest;
import com.sb.SpringBootMay2026.dtomapperTut.dto.UserResponse;
import com.sb.SpringBootMay2026.dtomapperTut.mapper.UserMapper;
import com.sb.SpringBootMay2026.dtomapperTut.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public UserResponse createUser(UserRequest request) {

        // Step 1: convert Request → Entity
        User user = userMapper.toEntity(request);

        // Step 2: (no DB here) simulate ID generation
        user.setId(1L);

        // Step 3: convert Entity → Response
        return userMapper.toResponse(user);
    }

}