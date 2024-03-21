package com.adruri.cs.recursion;

import lombok.extern.slf4j.Slf4j;
import java.math.BigInteger;

@Slf4j
public class Factorial {

    public static void main(String[] args) {
        int n = 100;

        log.info("Factorial of {}", n);
        log.info(String.valueOf(factorial(n)));
    }

    static BigInteger factorial(int n) {
        if (n < 1) {
            return BigInteger.ONE;
        }

        return factorial(n - 1).multiply(BigInteger.valueOf(n));
    }

}
