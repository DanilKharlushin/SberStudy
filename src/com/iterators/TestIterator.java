package com.iterators;

public class TestIterator {
    public static void main(String[] args) {
        Integer[] arr = {2345, 189, 567};
        IntegerSequence sequence = new IntegerSequence(arr);

        for (Integer i : sequence) {
            System.out.println(i);
        }
    }
}
