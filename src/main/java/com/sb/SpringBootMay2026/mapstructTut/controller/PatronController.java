package com.sb.SpringBootMay2026.mapstructTut.controller;


import com.sb.SpringBootMay2026.mapstructTut.dto.PatronRequestDto;
import com.sb.SpringBootMay2026.mapstructTut.dto.PatronResponseDto;
import com.sb.SpringBootMay2026.mapstructTut.service.PatronService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/patrons")
public class PatronController {

    private final PatronService service;

    public PatronController(PatronService service) {
        this.service = service;
    }

    @PostMapping
    public PatronResponseDto createPatron(@RequestBody PatronRequestDto dto) {
        return service.createPatron(dto);
    }

    @GetMapping("/{id}")
    public PatronResponseDto getPatron(@PathVariable Long id) {
        return service.getPatron(id);
    }

    @PutMapping("/{id}")
    public PatronResponseDto updatePatron(@PathVariable Long id, @RequestBody PatronRequestDto dto) {
        return service.updatePatron(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletePatron(@PathVariable Long id) {
        service.deletePatron(id);
    }

}