package com.arr.cs;

import com.arr.cs.Palindrome;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void testSingleCharacter() {
        String s = "a";

        Palindrome p = new Palindrome();

        assertThat(p.check(s)).isTrue();
    }

    @Test
    void twoEqualCharacters_shouldBeTrue() {
        String s = "aa";

        Palindrome p = new Palindrome();

        assertThat(p.check(s)).isTrue();
    }

    @Test
    void twoDifferentCharacters_shouldBeFalse() {
        String s = "ab";

        Palindrome p = new Palindrome();

        assertThat(p.check(s)).isFalse();
    }

    @Test
    void testPalindrome_shouldBeFalse() {
        String s = "abc";

        Palindrome p = new Palindrome();

        assertThat(p.check(s)).isFalse();
    }

    @Test
    void testPalindrome_shouldBeTrue() {
        String s = "abba";

        Palindrome p = new Palindrome();

        assertThat(p.check(s)).isTrue();
    }

    @Test
    void testPalindrome2_shouldBeTrue() {
        String s = "rotavator";

        Palindrome p = new Palindrome();

        assertThat(p.check(s)).isTrue();
    }
}