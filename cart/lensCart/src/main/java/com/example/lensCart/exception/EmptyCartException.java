package com.example.cart.exception;

public class EmptyCartException extends Exception{
    public EmptyCartException(String message){
        super(message);
    }
}
