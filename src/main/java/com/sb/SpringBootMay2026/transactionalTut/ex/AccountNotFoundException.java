package com.sb.SpringBootMay2026.transactionalTut.ex;

public class AccountNotFoundException extends RuntimeException {
    public AccountNotFoundException(String message) {
        super(message);
    }
}
