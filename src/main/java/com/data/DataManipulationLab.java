package com.data;

import java.util.List;
/**
 * DataManipulationLab class
 * 
 * This class defines several methods that are used to manipulate and inspect arrays and lists.
 */
public class DataManipulationLab {
    /**
     * Method to find the element of maximum value
     * 
     * @param numbers
     * @return max
     */
    public static int findMaximum(Integer[] numbers) {
        int max = 0;
        for (int i : numbers) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    /**
     * Method to count ocurrences of an element
     * 
     * @param words
     * @param word
     * @return count
     */
    public static int countOcurrences(List<String> words, String word) {
        int count = 0;
        
        for (String w : words) {
            if(w.equals(word)) {
                count += 1;
            }
        }
        return count;
    }

    /**
     * Method to count ocurrences of an element
     * 
     * @param numbers
     * @param n
     * @return count
     */
    public static int countOcurrences(List<Integer> numbers, int n) {
        int count = 0;

        for (int num : numbers) {
            if(num == n) {
                count += 1;
            }
        }
        return count;
    }
}
