package com.arr.cs.util;

import java.security.SecureRandom;
import java.util.stream.IntStream;

public class ArrayUtil {

    public static int[] generateRandomArray(int arraySize, int minInt, int maxInt) {

        SecureRandom random = new SecureRandom();

        int[] result = new int[arraySize];

        IntStream.range(0, arraySize)
            .parallel()
            .forEach(i -> result[i] = random.nextInt(maxInt - minInt + 1) + minInt);

        return result;
    }

}
