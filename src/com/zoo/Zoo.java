package com.zoo;

import com.zoo.animal.DesertEagle;
import com.zoo.animal.Lion;
import com.zoo.animal.Penguin;
import com.zoo.exception.EmptyNameException;
import com.zoo.exception.IncorrectAgeException;

public class Zoo {
    public static void main(String[] args) {
        Lion lion = new Lion("Simba", 23);
        lion.say();
        lion.eat();
        lion.fight();

        var penguin = new Penguin("Ice", 12);
        penguin.swim();

        DesertEagle eagle = new DesertEagle("Wing", 5);
        try {
            eagle.setName("");
        } catch (EmptyNameException e) {
            e.printStackTrace();
        }

        try {
            eagle.setAge(-1);
        } catch (IncorrectAgeException e) {
            e.printStackTrace();
        }
    }
}
