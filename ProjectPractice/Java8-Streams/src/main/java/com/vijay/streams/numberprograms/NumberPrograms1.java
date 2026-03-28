package com.vijay.streams.numberprograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NumberPrograms1 {


    public static void main(String[] args) {

        //Given a list of numbers,
        List<Integer> numbersList=Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        //filter out the even numbers and collect them into a new list.
        List<Integer>evenNumbersList=numbersList.stream().filter(num->num%2==0).collect(Collectors.toList());
        System.out.println("Even numbers: "+evenNumbersList);

        //Filter odd numbers and collect them into a new list.
        List<Integer>oddNumbersList=numbersList.stream().filter(num->num%2!=0).collect(Collectors.toList());
        System.out.println("Odd numbers: "+oddNumbersList);

        //Write a program to find the max value from a list of integers.
        //Integer maxNumber1=numbersList.stream().max((numb1,numb2)->numb1.compareTo(numb2)).get();//correct way-1
        Integer maxNumber=numbersList.stream().max(Comparator.naturalOrder()).get();//correct way-1
        System.out.println("Max/big number: "+maxNumber);//correct way-2


        //Write a program to find the min value from a list of integers.
        //Integer minNumber=numbersList.stream().min((numb1,numb2)->numb1.compareTo(numb2)).get();//correct way-1
        Integer minNumber=numbersList.stream().min(Comparator.naturalOrder()).get();//correct way-1
        System.out.println("Min/Small number: "+minNumber);//correct way-2

        //Write a program to get the sorted list from a list of integers as per ascending order.
         //List<Integer>sortedNumbListAsc=numbersList.stream().sorted().collect(Collectors.toList()); //Correct way-1
        //List<Integer>sortedNumbListAsc=numbersList.stream().sorted((numb1,numb2)->numb1.compareTo(numb2)).collect(Collectors.toList());//Correct way-2
        List<Integer>sortedNumbListAsc=numbersList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());//Correct way-3
        System.out.println("Sorted number list in ascending order: "+sortedNumbListAsc);


        //Write a program to get the sorted list from a list of integers as per descending order.
        List<Integer>sortedNumbListDesc=numbersList.stream().sorted((numb1,numb2)->numb2.compareTo(numb1)).collect(Collectors.toList());
        //List<Integer>sortedNumbListDesc=numbersList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Sorted number list in descending order: "+sortedNumbListDesc);

    }


}
