package com.arr.cs.sorting;

import com.arr.cs.util.ArrayUtil;
import lombok.extern.slf4j.Slf4j;
import java.util.Arrays;

@Slf4j
class InsertionSort {

    public static void main(String[] args) {

        log.info("Insertion Sort");

        int[] array = ArrayUtil.generateRandomArray();

        log.info("Unsorted array");
        log.info(Arrays.toString(array));

        sort(array);

        log.info("Sorted array");
        log.info(Arrays.toString(array));
    }

    static void sort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int j = i;

            while ((j > 0) && (array[j] < array[j - 1])) {
                ArrayUtil.swap(array, j, j - 1);
                j--;
            }
        }
    }
}
