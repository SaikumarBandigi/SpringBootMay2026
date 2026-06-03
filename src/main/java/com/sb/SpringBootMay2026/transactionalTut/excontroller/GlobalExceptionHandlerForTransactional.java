package com.sb.SpringBootMay2026.transactionalTut.excontroller;


import com.sb.SpringBootMay2026.transactionalTut.ex.AccountNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandlerForTransactional {


    @ExceptionHandler(value = AccountNotFoundException.class)
    public ResponseEntity<String> accountNotFoundExceptionHandler(AccountNotFoundException e) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
    }

}
