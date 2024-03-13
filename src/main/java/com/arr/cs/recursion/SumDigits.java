package com.arr.cs.recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SumDigits {

    public static void main(String[] args) {
        int n = 1234567890; // 45

        log.info("Sum digits in {}", n);
        log.info("Sum of digits: {}", sumDigits(n));
    }

    static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return sumDigits(n / 10) + n % 10;
    }

}
