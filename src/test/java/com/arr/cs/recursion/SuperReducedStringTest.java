package com.arr.cs.recursion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SuperReducedStringTest {

    @Test
    void reduce1() {

        String input = "aab";
        String expected = "b";

        SuperReducedString result = new SuperReducedString();

        assertThat(result.reduce(input)).isEqualTo(expected);
    }

    @Test
    void reduce2() {

        String input = "abba";
        String expected = "Empty String";

        SuperReducedString result = new SuperReducedString();

        assertThat(result.reduce(input)).isEqualTo(expected);
    }

    @Test
    void reduce3() {

        String input = "aaabccddd";
        String expected = "abd";

        SuperReducedString result = new SuperReducedString();

        assertThat(result.reduce(input)).isEqualTo(expected);
    }

    @Test
    void reduce4() {

        String input = "aa";
        String expected = "Empty String";

        SuperReducedString result = new SuperReducedString();

        assertThat(result.reduce(input)).isEqualTo(expected);
    }
    @Test
    void reduce5() {

        String input = "baab";
        String expected = "Empty String";

        SuperReducedString result = new SuperReducedString();

        assertThat(result.reduce(input)).isEqualTo(expected);
    }

}
