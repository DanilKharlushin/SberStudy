package com.zoo;

import com.zoo.animal.Animal;
import com.zoo.exception.DifferentAnimalException;
import com.zoo.exception.OverflowAviaryException;

import java.util.ArrayList;

public class Aviary {

    private int allowableAmount;
    private ArrayList<Animal> spot;

    public Aviary(int numOfAnimals) {
        this.allowableAmount = numOfAnimals;
        spot = new ArrayList<>();
    }

    public void place(Animal animal) throws DifferentAnimalException, OverflowAviaryException {
        if (spot.isEmpty()) {
            spot.add(animal);
            System.out.println(animal.getName() + " was successfully added in aviary");
        }
        else {
            if (!spot.get(0).getClass().equals(animal.getClass())) {
                throw new DifferentAnimalException(animal);
            }
            else if (spot.size() == allowableAmount) {
                throw new OverflowAviaryException();
            }
            else if (spot.contains(animal)) {
                System.out.println(animal.getName() + " is already in this aviary");
            }
            else {
                spot.add(animal);
                System.out.println(animal.getName() + " was successfully added in aviary");
            }

        }
    }
}
