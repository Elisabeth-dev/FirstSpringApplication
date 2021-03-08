package com.example.firstspringapplication.service;

import com.example.firstspringapplication.entity.Account;
import com.example.firstspringapplication.entity.Bill;
import com.example.firstspringapplication.utils.AccountUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PaymentService {

    private final AccountService accountService;

    @Autowired
    public PaymentService(AccountService accountService) {
        this.accountService = accountService;
    }

    public Object pay(Long accountId, BigDecimal paymentAmount){

        Account account = accountService.getById(accountId);
        Bill defaultBill = AccountUtils.findDefultBill(account);
        defaultBill.setAmount(defaultBill.getAmount().subtract(paymentAmount));
        accountService.update(account);
        return "luck!";

    }
}
