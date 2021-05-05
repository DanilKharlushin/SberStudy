package com.zoo;

import com.zoo.animal.Animal;
import com.zoo.exception.DifferentAnimalException;
import com.zoo.exception.NonExistentAviaryException;
import com.zoo.exception.OverflowAviaryException;

import java.util.ArrayList;

public class Aviary {

    private static int aviaryCounter = 1;

    private int allowableAmount;
    private int aviaryID;
    private ArrayList<Animal> spot;

    @Override
    public int hashCode() {
        return aviaryCounter++;
    }

    public Aviary(int numOfAnimals) {
        this.allowableAmount = numOfAnimals;
        spot = new ArrayList<>();
        aviaryID = hashCode();
    }

    public int getAviaryID() {
        return aviaryID;
    }

    public void place(Animal animal, Aviaries aviaries, int ID) throws DifferentAnimalException, OverflowAviaryException, NonExistentAviaryException {
        if (!aviaries.getSetOfAviaries().containsKey(ID)) {
            throw new NonExistentAviaryException();
        }
        else if (spot.isEmpty()) {
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
