package com.comparators;

import java.util.Comparator;
import java.util.HashSet;

public class DifferentDigitComparator implements Comparator<MyInteger> {

    @Override
    public int compare(MyInteger o1, MyInteger o2) {

        if (o1.equals(o2)) {
            return 0;
        } else {
            return numOfDifferentChars(o1.getNum()) > numOfDifferentChars(o2.getNum()) ? 1 : -1;
        }
    }

    public static int numOfDifferentChars(Integer num) {
        HashSet<Integer> differentChars = new HashSet<>();
        while (num > 1) {
            differentChars.add(num % 10);
            num /= 10;
        }

        return differentChars.size();
    }
}
