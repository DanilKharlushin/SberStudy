package com.zoo.exception;

public class EmptyNameException extends Exception {

    public EmptyNameException() {
        super("Empty name string");
    }
}
