package com.arr.cs;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * Given an array of integers, find two numbers that sum to the target
     * e.g. array -> {2, 7, 11, 15}, target -> 9 return indices
     * [0, 1] since array[0] + array[1] = 2 + 7 = 9
     *
     * @param array  the array of integers
     * @param target the target number to sum two values from the array
     * @return an array of two positions indicating the indices that will sum the target value
     */
    public int[] find(int[] array, int target) {

        Map<Integer, Integer> complementMap = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int complement = target - current;

            if (complementMap.containsKey(complement)) {

                int[] result = new int[2];

                result[0] = complementMap.get(complement);
                result[1] = i;

                return result;
            }

            complementMap.putIfAbsent(current, i);
        }

        return null;
    }
}
