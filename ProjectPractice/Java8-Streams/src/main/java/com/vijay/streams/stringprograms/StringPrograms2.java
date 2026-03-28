package com.vijay.streams.stringprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StringPrograms2 {

    public static void main(String[] args) {

        //write a program to find the length of the strings
        List<String> fruitsList = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        List<Integer> fruitLenghtList = fruitsList.stream().map(fruit -> fruit.length()).collect(Collectors.toList());
        System.out.println("Length of the fruits: " + fruitLenghtList);

        //Find the longest string in a list of strings.
        String longestFruit = fruitsList.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println("Longest fruit: " + longestFruit);

        //Find the shortest string in a list of strings.
        String shortestFruit = fruitsList.stream().min(Comparator.comparingInt(String::length)).get();
        System.out.println("Shortest fruit: " + shortestFruit);


    }
}
