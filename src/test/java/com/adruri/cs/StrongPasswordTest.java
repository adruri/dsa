package com.adruri.cs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StrongPasswordTest {

    @Test
    void testResultIs3() {
        String password = "Ab1";
        int expected = 2;

        StrongPassword sp = new StrongPassword();

        assertThat(sp.check(password)).isEqualTo(expected);
    }

    @Test
    void testResultIs2() {
        String password = "2bbbb";
        int expected = 3;

        StrongPassword sp = new StrongPassword();

        assertThat(sp.check(password)).isEqualTo(expected);
    }

    @Test
    void testResultIs0() {
        String password = "aa1bG$";

        int expected = 0;

        StrongPassword sp = new StrongPassword();

        assertThat(sp.check(password)).isEqualTo(expected);
    }
}
