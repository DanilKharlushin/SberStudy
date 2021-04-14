package com.zoo.animal;

import com.zoo.exception.EmptyNameException;
import com.zoo.exception.IncorrectAgeException;

public class Wolf extends Animal implements Moveable, Fightable {

    public Wolf(String name, int age) {
        super(name, age);
    }

    @Override
    public void setAge(int age) throws IncorrectAgeException {
        if (age <= 0) {
            throw new IncorrectAgeException();
        } else
            this.age = age;
    }

    @Override
    public void setName(String name) throws EmptyNameException {
        if (name.equals("")) {
            throw new EmptyNameException();
        } else
            this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Wolf " + this.name + " says: Auuuu");
    }

    @Override
    public void eat() {
        System.out.println("Wolf " + this.name + " eats");
    }

    @Override
    public void sleep() {
        System.out.println("Wolf " + this.name + " sleeps");
    }

    @Override
    public void fight() {
        System.out.println("Wolf " + this.name + " fights");
    }

    @Override
    public void move() {
        System.out.println("Wolf " + this.name + " moves");
    }
}
