package com.arr.cs.recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SumNumbers {

    public static void main(String[] args) {
        int n = 10;
        log.info("Sum of {}: {}", n, sum(n));
    }

    static int sum(int n) {
        if (n <= 1) {
            return 1;
        }

        return sum((n - 1)) + n;
    }

}
