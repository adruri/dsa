package com.arr.cs.sorting.quicksort;

import static org.assertj.core.api.Assertions.assertThat;

import com.arr.cs.util.ArrayUtil;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class QuicksortTest {

    private static final int ARRAY_SIZE = 30;
    private static final int MIN = 0;
    private static final int MAX = 99;

    @Test
    void sort() {
        int[] array = ArrayUtil.generateRandomArray(ARRAY_SIZE, MIN, MAX);

        int[] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(copy);

        Quicksort.sort(array, 0, array.length - 1);

        assertThat(array).isEqualTo(copy);
    }
}