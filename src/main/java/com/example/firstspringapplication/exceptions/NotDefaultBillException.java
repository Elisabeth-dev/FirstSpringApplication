package com.example.firstspringapplication.exceptions;

public class NotDefaultBillException extends RuntimeException{
    public NotDefaultBillException(String message) {
        super(message);
    }
}
