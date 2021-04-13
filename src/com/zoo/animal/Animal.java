package com.zoo.animal;

public abstract class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(double age, String name) {
        this.age = (int) Math.floor(age);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void setName(String name);

    public abstract void say();

    public abstract void eat();

    public abstract void sleep();

}
