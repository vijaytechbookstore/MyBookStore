package com.vijay.streams.stringprograms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringPrograms1 {
    public static void main(String[] args) {

      List<String> fruitsList=  Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
       List<String>fruitsListUpper= fruitsList.stream().map(fruit->fruit.toUpperCase()).collect(Collectors.toList());
       System.out.println("Fruits in uppercase: "+fruitsListUpper);

        //lower case list using streams.
        List<String>fruitsListLower= fruitsList.stream().map(fruit->fruit.toLowerCase()).collect(Collectors.toList());
        System.out.println("Fruits in uppercase: "+fruitsListLower);

        //Sort the list of strings in alphabetical order and collect them into a new list.
        List<String>sortedFruitsList=fruitsList.stream().sorted().collect(Collectors.toList());
        //List<String>sortedFruitsList=fruitsList.stream().sorted((fruit1,fruit2)->fruit1.compareTo(fruit2)).collect(Collectors.toList());
        //List<String>sortedFruitsList=fruitsList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        System.out.println("Sorted fruits list: "+sortedFruitsList);

       //sorted the list of strings in reverse alphabetical order and collect them into a new list.
        List<String>sortedFruitsListDesc=fruitsList.stream().sorted((fruit1,fruit2)->fruit2.compareTo(fruit1)).collect(Collectors.toList());
        //List<String>sortedFruitsListDesc=fruitsList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted fruits list in reverse order: "+sortedFruitsListDesc);



        Map<Integer,List<String>>frtuisMap= fruitsList.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("Fruits grouped by length: "+frtuisMap);



    }

}
