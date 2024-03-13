package com.arr.cs.recursion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WordReverseTest {

    @Test
    void shouldReverseEven() {
        String s = "geeks quiz practice code";
        String result = "code practice quiz geeks";

        WordReverse reverse = new WordReverse();

        assertThat(reverse.reverse(s)).isEqualTo(result);
    }

    @Test
    void shouldReverseOdd() {
        String s = "i love programming very much";
        String result = "much very programming love i";

        WordReverse reverse = new WordReverse();

        assertThat(reverse.reverse(s)).isEqualTo(result);
    }

    @Test
    void shouldReverseSingle() {
        String s = "hey";
        String result = "hey";

        WordReverse reverse = new WordReverse();

        assertThat(reverse.reverse(s)).isEqualTo(result);
    }
}
