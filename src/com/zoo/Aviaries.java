package com.zoo;

import com.zoo.exception.AddingAviaryException;

import java.util.HashMap;

public class Aviaries {

    private final int maxNumOfAviary = 5;
    private static int aviaryCounter = 1;

    private HashMap<Integer, Aviary> setOfAviaries = new HashMap<>();

    public HashMap<Integer, Aviary> getSetOfAviaries() {
        return setOfAviaries;
    }

    public void addAviary(Aviary aviary) throws AddingAviaryException {
        if (aviaryCounter >= maxNumOfAviary) {
            throw new AddingAviaryException();
        } else  {
            setOfAviaries.put(aviary.getAviaryID(), aviary);
        }
    }
}
