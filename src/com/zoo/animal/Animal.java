package com.zoo.animal;

import com.zoo.exception.EmptyNameException;
import com.zoo.exception.IncorrectAgeException;

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

    public abstract void setAge(int age) throws IncorrectAgeException;

    public abstract void setName(String name) throws EmptyNameException;

    public abstract void say();

    public abstract void eat();

    public abstract void sleep();

}
