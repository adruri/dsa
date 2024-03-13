package com.arr.cs.sorting;

import static org.assertj.core.api.Assertions.assertThat;

import com.arr.cs.util.ArrayUtil;
import java.util.Arrays;
import org.junit.jupiter.api.Test;

class InsertionSortTest {

    @Test
    void sort() {
        int[] array = ArrayUtil.generateRandomArray();

        int[] copy = Arrays.copyOf(array, array.length);
        Arrays.sort(copy);

        InsertionSort.sort(array);

        assertThat(array).isEqualTo(copy);
    }
}