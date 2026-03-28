package com.vijay.streams.numberprograms;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumberPrograms2 {

    public static void main(String[] args) {

        //Write a program to calculate the sum of all numbers in a list of integers.
        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 11, 11, 12);


        List<Integer> bigList = numbersList.stream().filter(num -> num >= 5).collect(Collectors.toList());
        System.out.println("Numbers greater than 5: " + bigList);

        List<Integer> smallList = numbersList.stream().filter(num -> num <= 5).collect(Collectors.toList());
        System.out.println("Numbers smaller than 5: " + smallList);

        //Write a program to remove the duplicates from a list using java 8 strem api.
        List<Integer> uniqueList = numbersList.stream().distinct().collect(Collectors.toList());
        System.out.println("Unique numbers: " + uniqueList);


        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = intStream.sum();
        System.out.println("Sum of the numbers: " + sum);


        IntStream intStream1 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        OptionalDouble averageValue = intStream1.average();
        if (averageValue.isPresent()) {
            System.out.println("Average value: " + averageValue.getAsDouble());
        }

        IntStream intStream2 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        OptionalInt maxNumbOptional = intStream2.max();
        if (maxNumbOptional.isPresent()) {
            System.out.println("Max Number:" + maxNumbOptional.getAsInt());
        }


        IntStream intStream3 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        OptionalInt minNumb = intStream3.max();
        if (minNumb.isPresent()) {
            System.out.println("Min Number::" + minNumb.getAsInt());
        }


        IntStream intStream4 = IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
         //List<Integer>sortedList=intStream4.sorted().collect(Collectors.toList());


    }
}
