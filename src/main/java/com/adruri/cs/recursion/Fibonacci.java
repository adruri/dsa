package com.adruri.cs.recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Fibonacci {

    public static void main(String[] args) {
        int n = 50;

        log.info("Fibonacci Sequence of {}", n);
        log.info(String.valueOf(fibonacci(n)));
    }

    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
