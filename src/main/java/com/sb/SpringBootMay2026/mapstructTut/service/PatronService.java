package com.sb.SpringBootMay2026.mapstructTut.service;

import com.sb.SpringBootMay2026.mapstructTut.dto.PatronRequestDto;
import com.sb.SpringBootMay2026.mapstructTut.dto.PatronResponseDto;
import com.sb.SpringBootMay2026.mapstructTut.mapper.PatronMapper;
import com.sb.SpringBootMay2026.mapstructTut.model.Patron;
import com.sb.SpringBootMay2026.mapstructTut.repository.PatronRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PatronService {

    private final PatronRepository repository;
    private final PatronMapper mapper;

    public PatronService(PatronRepository repository, PatronMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public PatronResponseDto createPatron(PatronRequestDto dto) {
        Patron patron = mapper.toEntity(dto);
        Patron savedPatron = repository.save(patron);
        return mapper.toResponseDto(savedPatron);
    }

    public PatronResponseDto getPatron(Long id) {

        Patron patron = repository.findById(id).orElseThrow(() -> new RuntimeException("Patron not found"));
        return mapper.toResponseDto(patron);
    }

    public PatronResponseDto updatePatron(Long id, PatronRequestDto dto) {

        Patron patron = repository.findById(id).orElseThrow(() -> new RuntimeException("Patron not found"));

        mapper.updatePatronFromDto(dto, patron);

        return mapper.toResponseDto(patron);
    }

    public void deletePatron(Long id) {

        Patron patron = repository.findById(id).orElseThrow(() -> new RuntimeException("Patron not found"));
        repository.delete(patron);
    }

}