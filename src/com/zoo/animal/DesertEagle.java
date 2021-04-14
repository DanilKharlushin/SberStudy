package com.zoo.animal;


public class DesertEagle extends Animal implements Moveable, Flyable {

    public DesertEagle(String name, int age) {
        super(name, age);
    }

    @Override
    public void setName(String name) {
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
