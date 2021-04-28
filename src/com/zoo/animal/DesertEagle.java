package com.zoo.animal;


import com.zoo.exception.EmptyNameException;
import com.zoo.exception.IncorrectAgeException;

public class DesertEagle extends Animal implements Moveable, Flyable {

    public DesertEagle(String name, int age) {
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
        System.out.println("Desert eagle " + this.name + " says: Kaar");
    }

    @Override
    public void eat() {
        System.out.println("Desert eagle " + this.name + " eats");
    }

    @Override
    public void sleep() {
        System.out.println("Desert eagle " + this.name + " sleeps");
    }

    @Override
    public void fly() {
        System.out.println("Desert eagle " + this.name + " flies");
    }

    @Override
    public void move() {
        System.out.println("Desert eagle " + this.name + " moves");
    }
}
