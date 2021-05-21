package com.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Toby", "Won", "Chon", "John");
        List<String> list2 = Arrays.asList("Toby", "Mike", "Chon", "Jack");
        List<String> list3 = Arrays.asList("Mike", "Ron", "Won", "Bob");
        List<String> list4 = Arrays.asList("Tom", "Won", "Howard", "John");

        List<String> result =  Stream.of(list1, list2, list3, list4).flatMap(Collection::stream).distinct().collect(Collectors.toList());
        Stream.of(result).forEach(System.out::println);

        Map<String, Double> map = new HashMap<>();
        map.put("Tom", 70.2);
        map.put("Won", 81.8);
        map.put("Ron", 67.4);
        map.put("John", 90.1);
        map.put("Chon", 72.5);


        OptionalDouble avgWeight = map.values().stream().mapToDouble(x -> x).average();
        avgWeight.ifPresent(System.out::println);

        List<Long> nums1 = Arrays.asList(12L, 13L, 14L, 123123L, 3453445L, 1232L);
        List<Long> nums2 = Arrays.asList(12L, 13L, 14L, 23L, 34545L, 4562L);
        Stream.of(nums1, nums2).flatMap(Collection::stream).filter(x -> nums1.contains(x) && nums2.contains(x)).distinct().forEach(System.out::println);
    }
}
