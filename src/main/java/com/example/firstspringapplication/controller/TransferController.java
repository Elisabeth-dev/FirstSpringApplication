package com.example.firstspringapplication.controller;

import com.example.firstspringapplication.controller.DTO.TransferRequestDTO;
import com.example.firstspringapplication.service.TransferService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransferController {
    private final TransferService transferService;

    public TransferController(TransferService transferService) {
        this.transferService = transferService;
    }

    @PostMapping("/transfers")
    public Object transfer(@RequestBody TransferRequestDTO transferRequestDTO){


        return transferService.transfer(transferRequestDTO.accountIdFrom,
                transferRequestDTO.getAccountIdTo(),
                transferRequestDTO.getAmount());
    }
}
