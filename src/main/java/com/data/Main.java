package com.data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] numbers = {4, 5, 12, 567, 9, 55, 64, 1, 21, 9, 5, 1000, 5};
        System.out.println("The max number in the array is: " + DataManipulationLab.findMaximum(numbers));

        List<Integer> numberList = new ArrayList<>(Arrays.asList(numbers));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number to count how many times it appears: ");
        int input = scanner.nextInt();

        int count = DataManipulationLab.countOcurrences(numberList, input);
        if (count == 0) {
            System.out.println("The number " + input + " does not appear!");
        } else {
            System.out.println("The number " + input + " appears " + count + " times!");
        }
    }
}