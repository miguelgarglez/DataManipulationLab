package com.data;

import java.util.List;

public class DataManipulationLab {
    public static int findMaximum(Integer[] numbers) {
        int max = 0;
        for (int i : numbers) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int countOcurrences(List<String> words, String word) {
        int count = 0;
        
        for (String w : words) {
            if(w.equals(word)) {
                count += 1;
            }
        }

        return count;
    }

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
