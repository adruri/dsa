package com.adruri.cs.sorting;

import static org.assertj.core.api.Assertions.assertThat;

import com.adruri.cs.util.ArrayUtil;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    @Test
    void sort() {
        int[] array = ArrayUtil.generateRandomArray();

        int[] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(copy);

        BubbleSort.sort(array);

        assertThat(array).isEqualTo(copy);
    }

    @Test
    void test() {
        int flagA = Integer.parseInt("10000", 2);
        int flagB = Integer.parseInt("01000", 2);

        int withFlagA = 0 | flagA;
        System.out.println("With flag A: " + withFlagA);

        int withFlagB = 0 | flagB;
        System.out.println("With flag B: " + withFlagB);

        int withFlagAAndB = (0 | flagA) | flagB;
        System.out.println("With flag A and B: " + withFlagAAndB);

        System.out.println("Hex 16: " + Integer.toHexString(16));

    }
}