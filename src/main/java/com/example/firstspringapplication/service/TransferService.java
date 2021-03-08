package com.example.firstspringapplication.service;

import com.example.firstspringapplication.entity.Account;
import com.example.firstspringapplication.entity.Bill;
import com.example.firstspringapplication.exceptions.NotDefaultBillException;
import com.example.firstspringapplication.utils.AccountUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class TransferService {

    private final AccountService accountService;


    @Autowired
    public TransferService(AccountService accountService) {
        this.accountService = accountService;
    }

    public Object transfer(Long accountIdFrom, Long accountIdTo, BigDecimal amount) {

        Account accountFrom = accountService.getById(accountIdFrom);
        Account accountTo = accountService.getById(accountIdTo);

        Bill billFrom = AccountUtils.findDefultBill(accountFrom);
        Bill billTo = AccountUtils.findDefultBill(accountTo);
        billFrom.setAmount(billFrom.getAmount().subtract(amount));
        billTo.setAmount(billTo.getAmount().add(amount));
        accountService.update(accountFrom);
        accountService.update(accountTo);
        return "luck!";
    }


}
