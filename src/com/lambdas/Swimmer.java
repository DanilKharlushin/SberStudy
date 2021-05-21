package com.lambdas;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Swimmer {

    private String name;
    private Integer age;

    public Swimmer(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void swim(Consumer<String> c) {
        c.accept(this.name);
    }

    public static void main(String[] args) {
        Swimmer swimmer = new Swimmer("Bob", 23);
        swimmer.swim((x) -> System.out.println(x));

        Supplier<String> namer = () -> swimmer.getName();
        System.out.println(namer.get());

        BiConsumer<String, Integer> func = (s, i) -> { swimmer.setName(s); swimmer.setAge(i); };
        func.accept("John", 11);
        System.out.println(swimmer.getName());
        System.out.println(swimmer.getAge());
    }
}
