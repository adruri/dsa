package com.arr.cs.sorting.quicksort;

import com.arr.cs.util.ArrayUtil;
import lombok.extern.slf4j.Slf4j;
import java.util.Arrays;

@Slf4j
public class QuicksortMain {

    private static final int ARRAY_SIZE = 30;
    private static final int MIN = 0;
    private static final int MAX = 99;

    public static void main(String[] args) {

        log.info("Quicksort");

        int[] array = ArrayUtil.generateRandomArray(ARRAY_SIZE, MIN, MAX);

        log.info("Unsorted array");
        log.info(Arrays.toString(array));

        Quicksort.sort(array, 0, array.length - 1);

        log.info("Sorted array");
        log.info(Arrays.toString(array));
    }
}
