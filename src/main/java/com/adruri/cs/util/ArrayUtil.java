package com.adruri.cs.util;

import java.security.SecureRandom;
import java.util.stream.IntStream;

public class ArrayUtil {

    private static final int ARRAY_SIZE = 30;
    private static final int MIN = 0;
    private static final int MAX = 99;

    public static <T> int[] generateRandomArray() {
        return generateRandomArray(ARRAY_SIZE, MIN, MAX);
    }

    public static int[] generateRandomArray(int arraySize, int minInt, int maxInt) {

        SecureRandom random = new SecureRandom();

        int[] result = new int[arraySize];

        IntStream.range(0, arraySize)
            .parallel()
            .forEach(i -> result[i] = random.nextInt(maxInt - minInt + 1) + minInt);

        return result;
    }

    public static <T> void swap(int[] array, int a, int b) {
        int aValue = array[a];
        int bValue = array[b];

        array[a] = bValue;
        array[b] = aValue;
    }

}
