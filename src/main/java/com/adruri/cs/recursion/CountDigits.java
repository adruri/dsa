package com.adruri.cs.recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CountDigits {

    public static void main(String[] args) {
        int n = 1234567890;

        log.info("Count digits in {}", n);
        log.info("Number of digits: {}", countDigits(n));

    }

    static int countDigits(int n) {

        if (n / 10 == 0) {
            return 1;
        }

        return countDigits(n / 10) + 1;
    }

}
