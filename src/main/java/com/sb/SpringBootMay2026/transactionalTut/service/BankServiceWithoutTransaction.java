package com.sb.SpringBootMay2026.transactionalTut.service;

import com.sb.SpringBootMay2026.transactionalTut.ex.AccountNotFoundException;
import com.sb.SpringBootMay2026.transactionalTut.model.Account;
import com.sb.SpringBootMay2026.transactionalTut.repository.AccountRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.function.Supplier;

@Service
public class BankServiceWithoutTransaction {

    private final AccountRepository accountRepository;

    public BankServiceWithoutTransaction(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Transactional
    public void transfer(Long fromId, Long toId, Double amount) {

        Supplier<AccountNotFoundException> accountNotFoundExceptionSupplier = new Supplier<>() {
            @Override
            public AccountNotFoundException get() {
                return new AccountNotFoundException("Account not found");
            }
        };

        Account sender = accountRepository.findById(fromId).orElseThrow(accountNotFoundExceptionSupplier);

        sender.setBalance(sender.getBalance() - amount);

        accountRepository.save(sender);

        // Simulating system crash
        // int result = 10 / 0;

        Account receiver = accountRepository.findById(toId).orElseThrow();

        receiver.setBalance(receiver.getBalance() + amount);

        accountRepository.save(receiver);
    }
}