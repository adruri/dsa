package com.adruri.cs;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LongestPalindromicSubstring {

    private final Palindrome p;
    public String find(String string) {
        String longestPalindrome = "";

        for (int i = 0; i < string.length(); i++) {
            for (int j = i; j < string.length(); j++) {

                String current = string.substring(i, j + 1);

                boolean isPalindrome = p.check(current);

                if (isPalindrome && current.length() > longestPalindrome.length()) {
                    longestPalindrome = current;
                }
            }
        }

        return longestPalindrome;
    }
}
