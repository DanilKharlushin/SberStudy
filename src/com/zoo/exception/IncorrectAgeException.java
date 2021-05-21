package com.zoo.exception;

public class IncorrectAgeException extends Exception {

    public IncorrectAgeException() {
        super("Incorrect animal's age");
    }
}
