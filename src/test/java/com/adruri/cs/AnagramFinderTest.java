package com.adruri.cs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AnagramFinderTest {

    @Test
    void test1_true() {
        String word = "abc";
        String anagram = "cba";

        AnagramFinder anagramFinder = new AnagramFinder();

        boolean result = anagramFinder.find(word, anagram);

        assertThat(result).isTrue();
    }

    @Test
    void test2_false() {
        String word = "abc";
        String anagram = "abd";

        AnagramFinder anagramFinder = new AnagramFinder();

        boolean result = anagramFinder.find(word, anagram);

        assertThat(result).isFalse();
    }

    @Test
    void test3_trueWithDuplicates() {
        String word = "aabbcd";
        String anagram = "bbcada";

        AnagramFinder anagramFinder = new AnagramFinder();

        boolean result = anagramFinder.find(word, anagram);

        assertThat(result).isTrue();
    }

    @Test
    void gpt1_true() {
        String word = "listen";
        String anagram = "silent";

        AnagramFinder anagramFinder = new AnagramFinder();

        boolean result = anagramFinder.find(word, anagram);

        assertThat(result).isTrue();
    }

    @Test
    void gpt2_true() {
        String word = "Listen";
        String anagram = "SILENT";

        AnagramFinder anagramFinder = new AnagramFinder();

        boolean result = anagramFinder.find(word, anagram);

        assertThat(result).isTrue();
    }

    @Test
    void gpt3_false() {
        String word = "earth";
        String anagram = "heartthrob";

        AnagramFinder anagramFinder = new AnagramFinder();

        boolean result = anagramFinder.find(word, anagram);

        assertThat(result).isFalse();
    }

    @Test
    void gpt4_false() {
        String word = "apple";
        String anagram = "apply";

        AnagramFinder anagramFinder = new AnagramFinder();

        boolean result = anagramFinder.find(word, anagram);

        assertThat(result).isFalse();
    }

    @Test
    void gpt5_true() {
        String word = "12345";
        String anagram = "54321";

        AnagramFinder anagramFinder = new AnagramFinder();

        boolean result = anagramFinder.find(word, anagram);

        assertThat(result).isTrue();
    }

    @Test
    void gpt6_true() {
        String word = "1213452";
        String anagram = "1254321";

        AnagramFinder anagramFinder = new AnagramFinder();

        boolean result = anagramFinder.find(word, anagram);

        assertThat(result).isTrue();
    }

}