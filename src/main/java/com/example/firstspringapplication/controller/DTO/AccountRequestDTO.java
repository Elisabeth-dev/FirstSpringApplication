package com.example.firstspringapplication.controller.DTO;

import java.util.List;

public class AccountRequestDTO {

    private String name;

    private String email;

    private List<BillRequestDTO> bills;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<BillRequestDTO> getBills() {
        return bills;
    }

    public void setBills(List<BillRequestDTO> bills) {
        this.bills = bills;
    }
}
