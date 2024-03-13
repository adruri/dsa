package com.arr.cs.recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class ReverseString {

    public static void main(String[] args) {

        String s = "1234";

        log.info("Original string {}", s);

        String reversed = reverse(s);

        log.info("Reversed String {}", reversed);
    }

    static String reverse(String s) {

        log.info(s);

        if (s.length() == 1) {
            return s;
        }

        log.info("* " + s.substring(1) + " * " + s.charAt(0));
        return reverse(s.substring(1)) + s.charAt(0);
    }

    static String reverse2(String s) {

        if (s.length() == 1) {
            return s;
        }

        return reverse2(s.substring(1)) + s.charAt(0);
    }

}
