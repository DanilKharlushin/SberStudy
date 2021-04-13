package com.zoo.animal;

public class Tiger extends Animal {

    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Tiger " + this.name + " says: Mur");
    }

    @Override
    public void eat() {
        System.out.println("Desert eagle " + this.name + " eats");
    }

    @Override
    public void sleep() {
        System.out.println("Desert eagle " + this.name + " sleeps");
    }
}
