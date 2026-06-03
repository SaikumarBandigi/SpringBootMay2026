package com.sb.SpringBootMay2026.dtomapperTut.mapper;

import com.sb.SpringBootMay2026.dtomapperTut.dto.UserRequest;
import com.sb.SpringBootMay2026.dtomapperTut.dto.UserResponse;
import com.sb.SpringBootMay2026.dtomapperTut.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toEntity(UserRequest request);

    UserResponse toResponse(User user);
}