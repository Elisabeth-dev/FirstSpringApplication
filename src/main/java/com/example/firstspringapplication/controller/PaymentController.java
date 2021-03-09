package com.example.firstspringapplication.controller;

import com.example.firstspringapplication.controller.DTO.PaymentRequestDTO;
import com.example.firstspringapplication.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {


    private  final PaymentService paymentService;


    @Autowired
    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping("/payments")
    public Object pay(@RequestBody PaymentRequestDTO paymentRequestDTO){

        return paymentService.pay(paymentRequestDTO.getAccountId(), paymentRequestDTO.getAmount());
    }

    @PostMapping("/deposit")
    public Object deposit(@RequestBody PaymentRequestDTO paymentRequestDTO){
        return paymentService.deposit(paymentRequestDTO.getAccountId(), paymentRequestDTO.getAmount());
    }

}
