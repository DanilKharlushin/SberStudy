package com.zoo.exception;

public class NonExistentAviaryException extends Exception {

    public NonExistentAviaryException() {
        super("Aviary with this ID does not exist");
    }
}
