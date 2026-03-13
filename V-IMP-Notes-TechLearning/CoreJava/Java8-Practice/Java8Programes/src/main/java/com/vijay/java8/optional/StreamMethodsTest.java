package com.vijay.java8.optional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethodsTest {

    public static void main(String[] args) {


        distinctMethod();
        limitMethod();
        peekMethod();

        nomeMatchMethod();
        allMatchMethod();
        anyMatchMethod();


    }


    public static void distinctMethod(){
        System.out.println("-----Testing distinct method in Stream API------------");
        // Stream of strings with duplicates
        Stream<String> stringStream = Stream.of("apple", "banana", "apple", "orange", "banana", "cherry");

        // Removing duplicates
        List<String> distinctFruits = stringStream.distinct().collect(Collectors.toList());
        System.out.println("Distinct fruits: " + distinctFruits);
        System.out.println("-----------------------------------------------\n\n\n");
    }

    public static void limitMethod() {
        System.out.println("-----Testing limit method in Stream API------------");
        // Stream of integers
        Stream<Integer> numberStream = Stream.iterate(1, n -> n + 1);

        // Limiting the stream to the first 5 elements
        List<Integer> limitedNumbers = numberStream.limit(5).collect(Collectors.toList());
        System.out.println("Limited numbers: " + limitedNumbers);
        System.out.println("-----------------------------------------------\n\n\n");
    }

    public static void peekMethod() {
        System.out.println("-----Testing peek method in Stream API------------");
        // Stream of strings
        Stream<String> stringStream = Stream.of("one", "two", "three", "four", "five");

        // Peeking and transforming the stream
        List<String> result = stringStream
                .peek(s -> System.out.println("Before filter: " + s))
                .filter(s -> s.length() > 3)
                .peek(s -> System.out.println("After filter: " + s))
                .map(String::toUpperCase)
                .peek(s -> System.out.println("After map: " + s))
                .collect(Collectors.toList());

        System.out.println("Final result: " + result);
        System.out.println("-----------------------------------------------\n\n\n");
    }


    public static void nomeMatchMethod() {
        System.out.println("-----Testing noneMatch method in Stream API------------");
        // Stream of integers
        Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);

        // Check if no element is greater than 10
        boolean noneAboveTen = numberStream.noneMatch(num -> num > 10);
        System.out.println("No elements greater than 10: " + noneAboveTen);

        // Stream of strings
        Stream<String> stringStream = Stream.of("apple", "banana", "cherry");

        // Check if no element contains the letter 'z'
        boolean noneContainZ = stringStream.noneMatch(str -> str.contains("z"));
        System.out.println("No elements contain 'z': " + noneContainZ);
        System.out.println("-----------------------------------------------\n\n\n");
    }


    public static void allMatchMethod() {
        System.out.println("-----Testing allMatch method in Stream API------------");
        // Stream of integers
        Stream<Integer> numberStream = Stream.of(2, 4, 6, 8, 10);

        // Check if all elements are even
        boolean allEven = numberStream.allMatch(num -> num % 2 == 0);
        System.out.println("All elements are even: " + allEven);

        // Stream of strings
        Stream<String> stringStream = Stream.of("React", "Angular", "Vue");

        // Check if all elements contain the letter 'e'
        boolean allContainE = stringStream.allMatch(str -> str.contains("e"));
        System.out.println("All elements contain 'e': " + allContainE);

        System.out.println("-----------------------------------------------\n\n\n");
    }


    public static void anyMatchMethod() {
        System.out.println("-----Testing anyMatch method in Stream API------------");
        // Stream of integers
        Stream<Integer> numberStream = Stream.of(1, 3, 5, 7, 8);

        // Check if any element is even
        boolean anyEven = numberStream.anyMatch(num -> num % 2 == 0);
        System.out.println("Any element is even: " + anyEven);

        // Stream of strings
        Stream<String> stringStream = Stream.of("Java", "Kotlin", "Scala");

        // Check if any element contains 'a'
        boolean anyContainA = stringStream.anyMatch(str -> str.contains("a"));
        System.out.println("Any element contains 'a': " + anyContainA);
        System.out.println("-----------------------------------------------\n\n\n");
    }

}
