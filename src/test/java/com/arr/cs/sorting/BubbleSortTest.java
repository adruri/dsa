package com.arr.cs.sorting;

import static org.assertj.core.api.Assertions.assertThat;

import com.arr.cs.util.ArrayUtil;
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
}