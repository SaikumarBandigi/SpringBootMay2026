package com.sb.SpringBootMay2026.exceptionhandlingTut.exception;

public class WorkerNotFoundException extends RuntimeException {
    public WorkerNotFoundException(String message) {
        super(message);
    }
}