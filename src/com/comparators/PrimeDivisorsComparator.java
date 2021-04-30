package com.comparators;

import java.util.Comparator;

public class PrimeDivisorsComparator implements Comparator<MyInteger> {

    @Override
    public int compare(MyInteger o1, MyInteger o2) {
        if (o1.equals(o2)) {
            return 0;
        } else {
            return numOfPrimes(o1.getNum()) > numOfPrimes(o2.getNum()) ? 1 : -1;
        }

    }

    public static boolean isPrime(int num) {
        boolean isPrime = true;
        for (int i = 2; i <=  Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static int numOfPrimes(int num) {
        int count = 0;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (isPrime(i)) {
                double division = (double) num / i;
                if (division == (int) division) {
                    count++;
                }
            }
        }

        return count;
    }
}
