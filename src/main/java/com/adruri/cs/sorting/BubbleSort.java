package com.adruri.cs.sorting;

import com.adruri.cs.util.ArrayUtil;
import lombok.extern.slf4j.Slf4j;
import java.util.Arrays;

@Slf4j
public class BubbleSort {

    public static void main(String[] args) {

        log.info("Bubble Sort");

        int[] array = ArrayUtil.generateRandomArray();

        log.info("Unsorted array");
        log.info(Arrays.toString(array));

        sort(array);

        log.info("Sorted array");
        log.info(Arrays.toString(array));
    }

    static void sort(int[] array) {

        boolean sorted = false;

        while (!sorted) {

            sorted = true;

            for (int i = 0; i < array.length - 1; i++) {
                int curr = array[i];
                int next = array[i + 1];

                if (curr > next) {
                    sorted = false;
                    ArrayUtil.swap(array, i, i + 1);
                }
            }
        }
    }

}
