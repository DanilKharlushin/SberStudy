package com.zoo;

import com.zoo.animal.Lion;

public class Zoo {
    public static void main(String[] args) {
        Lion lion = new Lion(" ", 23);
        lion.setName("Simba");
        lion.say();
        lion.eat();
        lion.fight();
    }
}
