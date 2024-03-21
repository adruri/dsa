package com.arr.cs;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Slf4j
public class AnagramFinder {

    public boolean find(String word, String anagram) {

        Map<Character, Integer> wordMap = createCharMapFromString(word);
        Map<Character, Integer> anagramMap = createCharMapFromString(anagram);

        log.debug("wordMap -> {}", wordMap);
        log.debug("anagramMap -> {}", anagramMap);

        return wordMap.equals(anagramMap);
    }

    private Map<Character, Integer> createCharMapFromString(String string) {

        Map<Character, Integer> result = new HashMap<>();

        for (Character chr : string.toLowerCase().toCharArray()) {
            if (result.containsKey(chr)) {
                result.put(chr, result.get(chr) + 1);
            } else {
                result.put(chr, 1);
            }
        }

        return result;
    }
}
