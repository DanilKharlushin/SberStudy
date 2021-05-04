package com.comparators;

import java.util.TreeSet;

public class Test {

    public static void main(String[] args) {
        MyInteger a1 = new MyInteger(123);
        MyInteger a2 = new MyInteger(132);
        MyInteger a3 = new MyInteger(2456624);
        MyInteger a4 = new MyInteger(100000);
        MyInteger a5 = new MyInteger(1);

        TreeSet<MyInteger> set = new TreeSet<>(new DifferentDigitComparator());
        set.add(a1);
        set.add(a2);
        set.add(a3);
        set.add(a4);
        set.add(a5);

        System.out.println("Соритровка по количеству различных цифр:");
        for (MyInteger i : set) {
            System.out.println(i);
        }

        MyInteger b1 = new MyInteger(6);
        MyInteger b2 = new MyInteger(12);
        MyInteger b3 = new MyInteger(30);
        MyInteger b4 = new MyInteger(23);
        MyInteger b5 = new MyInteger(17);

        TreeSet<MyInteger> set2 = new TreeSet<>(new PrimeDivisorsComparator());
        set2.add(b1);
        set2.add(b2);
        set2.add(b3);
        set2.add(b4);
        set2.add(b5);

        System.out.println("Соритровка по количеству простых делителей:");
        for (MyInteger i : set2) {
            System.out.println(i);
        }


    }
}
