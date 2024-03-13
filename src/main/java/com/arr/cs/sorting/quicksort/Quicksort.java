package com.arr.cs.sorting.quicksort;

class Quicksort {

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
                swap(arr, i, partitionIndex);
                partitionIndex++;
            }
        }

        swap(arr, partitionIndex, end);

        return partitionIndex;
    }

    private static void swap(int[] arr, int index, int partitionIndex) {
        int indexValue = arr[index];
        int pivotIndexValue = arr[partitionIndex];

        arr[index] = pivotIndexValue;
        arr[partitionIndex] = indexValue;
    }
}
