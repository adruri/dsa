package com.adruri.cs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoSumTest {

    @Test
    void test1() {
        int[] array = new int[]{2, 7, 11, 15};
        int target = 9;

        int[] expected = new int[]{0, 1};

        TwoSum twoSum = new TwoSum();

        int[] result = twoSum.find(array, target);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {
        int[] array = new int[]{11, 2, 17, 7};
        int target = 9;

        int[] expected = new int[]{1, 3};

        TwoSum twoSum = new TwoSum();

        int[] result = twoSum.find(array, target);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void gpt1() {
        int[] array = new int[]{-1, -2, -3, -4, -5};
        int target = -8;

        int[] expected = new int[]{2, 4};

        TwoSum twoSum = new TwoSum();

        int[] result = twoSum.find(array, target);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void gpt2() {
        int[] array = new int[]{1, 2, 3, 4, 5};
        int target = 10;

        TwoSum twoSum = new TwoSum();

        int[] result = twoSum.find(array, target);

        assertThat(result).isNull();
    }

    @Test
    void gpt3() {
        int[] array = new int[]{5, 3, 8, 2, 9};
        int target = 7;

        int[] expected = new int[]{0, 3};

        TwoSum twoSum = new TwoSum();

        int[] result = twoSum.find(array, target);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void gpt4() {
        int[] array = new int[]{10, -2, 4, -6, 3};
        int target = 1;

        int[] expected = new int[]{1, 4};

        TwoSum twoSum = new TwoSum();

        int[] result = twoSum.find(array, target);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void gpt5() {
        int[] array = new int[]{5, 3, 5, 2, 9};
        int target = 7;

        int[] expected = new int[]{0, 3};

        TwoSum twoSum = new TwoSum();

        int[] result = twoSum.find(array, target);

        assertThat(result).isEqualTo(expected);
    }

}