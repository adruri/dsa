package com.arr.cs.sorting;

import com.arr.cs.util.ArrayUtil;
import lombok.extern.slf4j.Slf4j;
import java.util.Arrays;

@Slf4j
public class SelectionSort {

    public static void main(String[] args) {

        log.info("Selection Sort");

        int[] array = ArrayUtil.generateRandomArray();

        log.info("Unsorted array");
        log.info(Arrays.toString(array));

        sort(array);

        log.info("Sorted array");
        log.info(Arrays.toString(array));
    }

    static void sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            int lowestValueIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[lowestValueIndex]) {
                    lowestValueIndex = j;
                }
            }

            if (lowestValueIndex != i) {
                ArrayUtil.swap(array, lowestValueIndex, i);
            }
        }
    }
}
