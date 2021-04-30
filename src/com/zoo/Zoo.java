package com.zoo;

import com.zoo.animal.DesertEagle;
import com.zoo.animal.Lion;
import com.zoo.animal.Penguin;
import com.zoo.exception.*;

public class Zoo {
    public static void main(String[] args) throws NonExistentAviaryException, OverflowAviaryException, DifferentAnimalException {
        Lion lion = new Lion("Simba", 23);
        lion.say();
        lion.eat();
        lion.fight();

        var penguin = new Penguin("Ice", 12);
        penguin.swim();

        DesertEagle eagle1 = new DesertEagle("Wing", 5);
        DesertEagle eagle2 = new DesertEagle("Flight", 5);


        var aviary1 = new Aviary(1);
        var aviary2 = new Aviary(2);
        var aviary3 = new Aviary(6);
        var aviary4 = new Aviary(2);
        var aviary5 = new Aviary(12);
        var aviary6 = new Aviary(8);

        Aviaries zoo = new Aviaries();
        try {
            zoo.addAviary(aviary1);
            zoo.addAviary(aviary2);
            zoo.addAviary(aviary3);
            zoo.addAviary(aviary4);
            zoo.addAviary(aviary5);
        } catch (AddingAviaryException e) {
            e.printStackTrace();
        }

        try {
            aviary6.place(eagle1, zoo, 6);
        } catch (NonExistentAviaryException e) {
            e.printStackTrace();
        }
    }
}
