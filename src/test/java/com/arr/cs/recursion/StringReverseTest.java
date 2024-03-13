package com.arr.cs.recursion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringReverseTest {

    @Test
    void shouldReverseLetters() {
        StringReverse reverse = new StringReverse();

        String string = "abcdefg";
        String reversed = "gfedcba";

        assertThat(reverse.reverse(string)).isEqualTo(reversed);
    }

    @Test
    void shouldReverseNumbers() {
        StringReverse reverse = new StringReverse();

        String string = "12345";
        String reversed = "54321";

        assertThat(reverse.reverse(string)).isEqualTo(reversed);
    }
}
