package com.zoo.animal;

import com.zoo.exception.EmptyNameException;
import com.zoo.exception.IncorrectAgeException;

public class Lion extends Animal implements Wash, Fightable {

    public Lion(String name, int age) {
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
        System.out.println("Lion " + this.name + " says: Arrr");
    }

    @Override
    public void eat() {
        System.out.println("Lion " + this.name + " eats");
    }

    @Override
    public void sleep() {
        System.out.println("Lion " + this.name + " sleeps");
    }

    @Override
    public void fight() {
        System.out.println("Lion " + this.name + " fights");
    }

    @Override
    public void wash() {
        System.out.println("Lion " + this.name + " is washing up");
    }
}
