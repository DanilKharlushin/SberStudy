package com.lambdas;

import java.lang.ref.PhantomReference;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambdas {

    public static void main(String[] args) {
        List<Double> origin = new ArrayList<>(Arrays.asList(2.2, 15.7, 456.23, 12.98, 1231.567));
        List<Long> res = map(origin, Math::round);
        for (Long l : res) {
            System.out.println(l);
        }
        System.out.println();

        forEach(origin, System.out::println);
        System.out.println();

        filter(origin, x -> x > 13);
        for (Double d : origin) {
            System.out.println(d);
        }
        System.out.println();

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(count(list, x -> x % 2 == 0));
        System.out.println();

        System.out.println(foldLeft(list, (x, y) -> x - y));
        System.out.println();

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(foldRight(list1, (x, y) -> x - y));

    }

    public static <T, R> List<R> map(List<T> origin, Function<T, R> mapper) {
        List<R> result = new ArrayList<>();
        for (T i : origin) {
            result.add(mapper.apply(i));
        }

        return result;
    }

    public static <T> void forEach(List<T> origin, Consumer<T> consumer) {
        for (T i : origin) {
            consumer.accept(i);
        }
    }

    public static <T> List<T> filter(List<T> origin, Predicate<T> predicate) {
        Iterator<T> iterator = origin.iterator();
        while (iterator.hasNext()) {
            T i = iterator.next();
            if (!predicate.test(i)) {
                iterator.remove();
            }
        }

        return origin;
    }

    public static <T> Integer count(List<T> origin, Predicate<T> predicate) {
        Integer count = 0;
        for (T i : origin) {
            if (predicate.test(i)) {
                count++;
            }
        }

        return count;
    }

    public static <T> T foldLeft(List<T> origin, BinaryOperator<T> binaryOperator) {
        Iterator<T> iterator = origin.iterator();
        T result = iterator.next();
        while (iterator.hasNext()) {
            T i = iterator.next();
            result = binaryOperator.apply(result, i);
            iterator.remove();
        }

        return result;
    }

    public static <T> T foldRight(List<T> origin, BinaryOperator<T> binaryOperator) {
       Collections.reverse(origin);
       Iterator<T> iterator = origin.iterator();
       T result = iterator.next();
       while (iterator.hasNext()) {
           T i = iterator.next();
           result = binaryOperator.apply(result, i);
           iterator.remove();
       }

       return result;
    }
}
