package com.arr.cs.recursion;

import com.arr.cs.util.ArrayUtil;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GreatestElement {

    public static void main(String[] args) {
        int[] arr = ArrayUtil.generateRandomArray();
        log.info("Array: {}", arr);
        log.info("Greatest element: {}", greatestElement(arr, arr.length - 1));
    }

    static int greatestElement(int[] arr, int index) {
        if (index == 0) {
            return arr[index];
        }

        return Math.max(greatestElement(arr, index - 1), arr[index]);
    }

}
