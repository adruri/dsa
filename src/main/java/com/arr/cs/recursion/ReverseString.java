package com.arr.cs.recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class ReverseString {

    public static void main(String[] args) {

        String s = "hola";

        log.info("Original string {}", s);

        String reversed = reverse(s);

        log.info("Reversed String {}", reversed);
    }

    static String reverse(String s) {

        if (s.length() == 1) {
            return s;
        }

        return reverse(s.substring(1)) + s.charAt(0);
    }

}
