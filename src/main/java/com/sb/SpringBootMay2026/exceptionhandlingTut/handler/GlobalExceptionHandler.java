package com.sb.SpringBootMay2026.exceptionhandlingTut.handler;

import com.sb.SpringBootMay2026.exceptionhandlingTut.exception.WorkerNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@Service
public class GlobalExceptionHandler {

    @ExceptionHandler(WorkerNotFoundException.class)
    public ResponseEntity<Map<String, Object>> handleWorkerNotFoundException(WorkerNotFoundException e) {

        Map<String, Object> response = new HashMap<>();

        response.put("message", e.getMessage());
        response.put("status", HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }

}