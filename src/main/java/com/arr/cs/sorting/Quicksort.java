package com.arr.cs.sorting;

import com.arr.cs.util.ArrayUtil;
import lombok.extern.slf4j.Slf4j;
import java.util.Arrays;

@Slf4j
class Quicksort {

    public static void main(String[] args) {

        log.info("Quicksort");

        int[] array = ArrayUtil.generateRandomArray();

        log.info("Unsorted array");
        log.info(Arrays.toString(array));

        Quicksort.sort(array, 0, array.length - 1);

        log.info("Sorted array");
        log.info(Arrays.toString(array));
    }

    /**
     * Single-pivot quicksort implementation
     *
     * @param arr the array to sort
     * @param start start index
     * @param end end index
     */
    static void sort(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }

        int partitionIndex = partition(arr, start, end);

        sort(arr, start, partitionIndex - 1);
        sort(arr, partitionIndex + 1, end);
    }

    private static int partition(int[] arr, int start, int end) {

        int pivot = arr[end];
        int partitionIndex = start;

        for (int i = start; i < end; i++) {
            if (arr[i] <= pivot) {
                ArrayUtil.swap(arr, i, partitionIndex);
                partitionIndex++;
            }
        }

        ArrayUtil.swap(arr, partitionIndex, end);

        return partitionIndex;
    }
}
