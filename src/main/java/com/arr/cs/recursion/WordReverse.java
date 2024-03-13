package com.arr.cs.recursion;

import java.util.Arrays;

public class WordReverse {
    public String reverse(String s) {

        String[] split = s.split(" ");

        String[] resultArray = reverseArray(split, 0, split.length -1);

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < resultArray.length; i++) {
            result.append(resultArray[i]);

            if (i != resultArray.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    private String[] reverseArray(String[] arr, int i, int j) {

        if (i < j) {
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            return reverseArray(arr, ++i, --j);
        }

        return arr;

    }
}
