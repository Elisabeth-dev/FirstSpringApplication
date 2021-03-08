package com.example.firstspringapplication.utils;

import com.example.firstspringapplication.entity.Account;
import com.example.firstspringapplication.entity.Bill;
import com.example.firstspringapplication.exceptions.NotDefaultBillException;

public class AccountUtils {

    public static Bill  findDefultBill(Account accountFrom) {
        return accountFrom.getBills().stream()
                .filter(Bill::getDefault)
                .findAny().orElseThrow(() -> new NotDefaultBillException("Unable to find default bill for account with id"
                        + accountFrom.getAccountId()));
    }
}
