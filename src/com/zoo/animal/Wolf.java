package com.zoo.animal;

public class Wolf extends Animal {

    public Wolf(String name, int age) {
        super(name, age);
    }

    @Override
    public void setName(String name) {
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
}
