package com.vijay.streams.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysPrograms1 {

    public static void main(String[] args) {

        int[] numbersArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Write a program to sort an array of integers in ascending order using Arrays Class.
        Arrays.sort(numbersArray);
        System.out.println("Sorted array in ascending order: " + Arrays.toString(numbersArray));

        //Write a program to sort an array of integers in ascending order using Arrays Class.
        Arrays.sort(numbersArray, Comparator.naturalOrder());
        System.out.println("Sorted array in ascending order: " + Arrays.toString(numbersArray));

    }
}
