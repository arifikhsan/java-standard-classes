package org.example;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {1, 4, 5, 10, 2, 3};

        Arrays.sort(numbers); // no return

        System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 4, 5, 10]
        System.out.println(Arrays.binarySearch(numbers, 4)); // 3

        int[] copiedNumbers = Arrays.copyOf(numbers, 4); // [1, 2, 3, 4]
        System.out.println(Arrays.toString(copiedNumbers));

        int[] copiedNumbers2 = Arrays.copyOfRange(numbers, 1, 3); // [2, 3]
        System.out.println(Arrays.toString(copiedNumbers2));
    }
}
