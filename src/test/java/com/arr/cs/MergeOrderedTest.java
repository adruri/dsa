package com.arr.cs;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MergeOrderedTest {

    @Test
    void sameSizeArrays_shouldOrder() {
        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> b = Arrays.asList(2, 3, 4, 4, 5);

        List<Integer> expected = Arrays.asList(1, 2, 2, 3, 3, 4, 4, 4, 5, 5);

        MergeOrdered merge = new MergeOrdered();

        List<Integer> result = merge.mergeArrays(a, b);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void aIsBigger_shouldOrder() {
        List<Integer> a = Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5);
        List<Integer> b = Arrays.asList(2, 2, 4);

        List<Integer> expected = Arrays.asList(1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5);

        MergeOrdered merge = new MergeOrdered();

        List<Integer> result = merge.mergeArrays(a, b);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void bIsBigger_shouldOrder() {
        List<Integer> a = Arrays.asList(1, 2, 3, 3);
        List<Integer> b = Arrays.asList(2, 3, 4, 4, 5, 6);

        List<Integer> expected = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 5, 6);

        MergeOrdered merge = new MergeOrdered();

        List<Integer> result = merge.mergeArrays(a, b);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void other_shouldOrder() {
        List<Integer> a = Arrays.asList(1, 1, 2, 5, 8);
        List<Integer> b = Arrays.asList(3, 4, 6);

        List<Integer> expected = Arrays.asList(1, 1, 2, 3, 4, 5, 6, 8);

        MergeOrdered merge = new MergeOrdered();

        List<Integer> result = merge.mergeArrays(a, b);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void gpt1_shouldOrder() {
        List<Integer> a = Arrays.asList(1, 3, 5, 7);
        List<Integer> b = Arrays.asList(2, 4, 6, 8);

        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        MergeOrdered merge = new MergeOrdered();

        List<Integer> result = merge.mergeArrays(a, b);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void gpt2_shouldOrder() {
        List<Integer> a = Arrays.asList(1, 2, 3, 4);
        List<Integer> b = Arrays.asList(5, 6, 7, 8);

        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        MergeOrdered merge = new MergeOrdered();

        List<Integer> result = merge.mergeArrays(a, b);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void gpt3_shouldOrder() {
        List<Integer> a = Arrays.asList(1, 1, 2, 3);
        List<Integer> b = Arrays.asList(1, 2, 2, 3);

        List<Integer> expected = Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3);

        MergeOrdered merge = new MergeOrdered();

        List<Integer> result = merge.mergeArrays(a, b);

        assertThat(result).isEqualTo(expected);
    }
    @Test
    void gpt4_shouldOrder() {
        List<Integer> a = Arrays.asList(1, 3, 5, 7);
        List<Integer> b = Arrays.asList(2, 4, 6);

        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        MergeOrdered merge = new MergeOrdered();

        List<Integer> result = merge.mergeArrays(a, b);

        assertThat(result).isEqualTo(expected);
    }
    @Test
    void gpt5_shouldOrder() {
        List<Integer> a = Arrays.asList(10, 20, 30);
        List<Integer> b = Arrays.asList(5, 15, 25, 35);

        List<Integer> expected = Arrays.asList(5, 10, 15, 20, 25, 30, 35);

        MergeOrdered merge = new MergeOrdered();

        List<Integer> result = merge.mergeArrays(a, b);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void gpt6_shouldGetEmptyList() {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();

        MergeOrdered merge = new MergeOrdered();

        List<Integer> result = merge.mergeArrays(a, b);

        assertThat(result).isEmpty();
    }

    @Test
    void gpt7_shouldOrder() {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = Arrays.asList(1, 2, 3);

        List<Integer> expected = Arrays.asList(1, 2, 3);

        MergeOrdered merge = new MergeOrdered();

        List<Integer> result = merge.mergeArrays(a, b);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void gpt8_shouldOrder() {
        List<Integer> a = Collections.singletonList(5);
        List<Integer> b = Collections.singletonList(3);

        List<Integer> expected = Arrays.asList(3, 5);

        MergeOrdered merge = new MergeOrdered();

        List<Integer> result = merge.mergeArrays(a, b);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void gpt9_shouldOrder() {
        List<Integer> a = Arrays.asList(1, 2, 2, 3);
        List<Integer> b = Arrays.asList(2, 3, 3, 4);

        List<Integer> expected = Arrays.asList(1, 2, 2, 2, 3, 3, 3, 4);

        MergeOrdered merge = new MergeOrdered();

        List<Integer> result = merge.mergeArrays(a, b);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void gpt10_shouldOrder() {
        List<Integer> a = Arrays.asList(1000000, 2000000, 3000000);
        List<Integer> b = Arrays.asList(500000, 1500000, 2500000, 3500000);

        List<Integer> expected = Arrays
                .asList(500000, 1000000, 1500000, 2000000, 2500000, 3000000, 3500000);

        MergeOrdered merge = new MergeOrdered();

        List<Integer> result = merge.mergeArrays(a, b);

        assertThat(result).isEqualTo(expected);
    }

}
