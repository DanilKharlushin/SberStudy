package com.zoo.animal;

public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    @Override
    public void setName(String name) {
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
}
