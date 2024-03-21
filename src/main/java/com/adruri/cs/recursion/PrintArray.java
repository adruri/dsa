package com.adruri.cs.recursion;

import com.adruri.cs.util.ArrayUtil;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrintArray {

    public static void main(String[] args) {
        log.info("Print elements in array");

        int[] arr = ArrayUtil.generateRandomArray();
        log.info("Array: {}", arr);
        print(arr, arr.length);
    }

    static void print(int[] arr, int n) {
        if (n == 0) {
            return;
        }

        print(arr, n - 1);
        log.info("n {}, value {}", n, arr[n - 1]);
    }

}
