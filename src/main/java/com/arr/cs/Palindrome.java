package com.arr.cs;

public class Palindrome {
    public boolean check(String s) {
        return checkPalindrome(s, 0, s.length() - 1);
    }

    private boolean checkPalindrome(String s, int startIndex, int endIndex) {

        if (startIndex == endIndex) {
            return true;
        }

        if (endIndex == startIndex + 1) {
            return s.charAt(startIndex) == s.charAt(endIndex);
        }

        if (s.charAt(startIndex) != s.charAt(endIndex)) {
            return false;
        }

        return checkPalindrome(s, startIndex + 1, endIndex - 1);
    }
}
