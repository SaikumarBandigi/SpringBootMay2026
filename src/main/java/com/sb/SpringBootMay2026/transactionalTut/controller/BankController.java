package com.sb.SpringBootMay2026.transactionalTut.controller;

import com.sb.SpringBootMay2026.transactionalTut.dto.TransferRequest;
import com.sb.SpringBootMay2026.transactionalTut.service.BankServiceWithoutTransaction;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bank")
public class BankController {

    private final BankServiceWithoutTransaction bankService;

    public BankController(BankServiceWithoutTransaction bankService) {
        this.bankService = bankService;
    }

    @PostMapping("/transfer")
    public String transfer(@RequestBody TransferRequest request) {

        bankService.transfer(
                request.getFromAccountId(),
                request.getToAccountId(),
                request.getAmount()
        );

        return "Transfer Successful";
    }
}