package com.arr.cs.recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NaturalNumbers {

    public static void main(String[] args) {
        printNaturalNumbers(100);
    }

    static void printNaturalNumbers(int n) {
        if (n <= 0) {
            return;
        }

        printNaturalNumbers(n - 1);
        log.info(String.valueOf(n));
    }

}
