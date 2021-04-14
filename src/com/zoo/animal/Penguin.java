package com.zoo.animal;

import com.zoo.exception.EmptyNameException;
import com.zoo.exception.IncorrectAgeException;

public class Penguin extends Animal implements Moveable, Swimmable {

    public Penguin(String name, int age) {
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
        System.out.println("Penguin " + this.name + " says: Krya");
    }

    @Override
    public void eat() {
        System.out.println("Penguin " + this.name + " eats");
    }

    @Override
    public void sleep() {
        System.out.println("Penguin " + this.name + " sleeps");
    }

    @Override
    public void move() {
        System.out.println("Penguin " + this.name + " moves");
    }

    @Override
    public void swim() {
        System.out.println("Penguin " + this.name + " swims");
    }
}
