package com.zoo.exception;

public class OverflowAviaryException extends Exception {

    public OverflowAviaryException() {
        super("This aviary is full");
    }
}
