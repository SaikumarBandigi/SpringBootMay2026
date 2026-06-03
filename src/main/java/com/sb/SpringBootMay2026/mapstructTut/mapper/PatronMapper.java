package com.sb.SpringBootMay2026.mapstructTut.mapper;

import com.sb.SpringBootMay2026.mapstructTut.dto.PatronRequestDto;
import com.sb.SpringBootMay2026.mapstructTut.dto.PatronResponseDto;
import com.sb.SpringBootMay2026.mapstructTut.model.Patron;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PatronMapper {

    Patron toEntity(PatronRequestDto dto);

    PatronResponseDto toResponseDto(Patron patron);

    void updatePatronFromDto(PatronRequestDto dto, @MappingTarget Patron patron);

}