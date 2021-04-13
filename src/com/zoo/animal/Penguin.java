package com.zoo.animal;

public class Penguin extends Animal {

    public Penguin(String name, int age) {
        super(name, age);
    }

    @Override
    public void setName(String name) {
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
}
