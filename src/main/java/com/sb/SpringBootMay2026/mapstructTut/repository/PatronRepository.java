package com.sb.SpringBootMay2026.mapstructTut.repository;


import com.sb.SpringBootMay2026.mapstructTut.model.Patron;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatronRepository extends JpaRepository<Patron, Long> {
}