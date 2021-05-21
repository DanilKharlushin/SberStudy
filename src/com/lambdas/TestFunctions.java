package com.lambdas;

import java.util.function.Function;

public class TestFunctions {

    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Double> trifunc = (i1, i2, i3) -> i1 * i2 / (double) i3;
        System.out.println(trifunc.apply(2, 3, 4));

        QuadFunction<Character, Character, Character, Character, String> quadfunc = (c1, c2, c3, c4) -> String.valueOf(c1) + String.valueOf(c2) + String.valueOf(c3) + String.valueOf(c4);
        System.out.println(quadfunc.apply('a', 'b', 'c', 'd'));

    }
}
