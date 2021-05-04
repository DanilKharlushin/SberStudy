package com.zoo.exception;

import com.zoo.animal.Animal;

public class DifferentAnimalException extends Exception {

    public DifferentAnimalException(Animal animal) {
        super(animal.getClass().getSimpleName() + " can't be place in this aviary");
    }
}
