package com.streams;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        Set<Integer> set = Stream.generate(() -> (int) (Math.random() * 200 - 100)).filter(x -> (x > 0) && (x % 2 == 1)).limit(15).map(x -> x * 2).peek(System.out::println).collect(Collectors.toSet());
        Optional<Integer> sum = set.stream().reduce(Integer::sum);
        sum.ifPresent(System.out::println);
    }
}
