package com.example.cart.exception;

public class ItemNotInCartException extends Exception {
    public ItemNotInCartException(String message){
        super(message);
    }
}
