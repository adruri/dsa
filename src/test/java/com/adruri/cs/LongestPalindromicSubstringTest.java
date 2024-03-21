package com.adruri.cs;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class LongestPalindromicSubstringTest {

    @Test
    void test() {

        String input = "forgeeksskeegfor";
        String expected = "geeksskeeg";

        LongestPalindromicSubstring lps = new LongestPalindromicSubstring(new Palindrome());

        String result = lps.find(input);

        log(input, expected, result);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test2() {

        String input = "Geeks";
        String expected = "ee";

        LongestPalindromicSubstring lps = new LongestPalindromicSubstring(new Palindrome());

        String result = lps.find(input);

        log(input, expected, result);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test3() {

        String input = "aaaabbaa";
        String expected = "aabbaa";

        LongestPalindromicSubstring lps = new LongestPalindromicSubstring(new Palindrome());

        String result = lps.find(input);

        log(input, expected, result);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test4() {

        String input = "abc";
        String expected = "a";

        LongestPalindromicSubstring lps = new LongestPalindromicSubstring(new Palindrome());

        String result = lps.find(input);

        log(input, expected, result);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test5() {

        String input = "abcdcab";
        String expected = "cdc";

        LongestPalindromicSubstring lps = new LongestPalindromicSubstring(new Palindrome());

        String result = lps.find(input);

        log(input, expected, result);

        assertThat(result).isEqualTo(expected);
    }
    @Test
    void test6() {

        String input = "abcdcba";
        String expected = "abcdcba";

        LongestPalindromicSubstring lps = new LongestPalindromicSubstring(new Palindrome());

        String result = lps.find(input);

        log(input, expected, result);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test7() {

        String input = "abcd";
        String expected = "a";

        LongestPalindromicSubstring lps = new LongestPalindromicSubstring(new Palindrome());

        String result = lps.find(input);

        log(input, expected, result);

        assertThat(result).isEqualTo(expected);
    }

    @Test
    void test8() {

        String input = "abaadcd";
        String expected = "aba";

        LongestPalindromicSubstring lps = new LongestPalindromicSubstring(new Palindrome());

        String result = lps.find(input);

        log(input, expected, result);

        assertThat(result).isEqualTo(expected);
    }

    private void log(String input, String expected, String result) {
        log.info("Input: {}", input);
        log.info("Expected: {}", expected);
        log.info("Result: {}", result);
    }


}
