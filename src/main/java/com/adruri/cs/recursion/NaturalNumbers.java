package com.adruri.cs.recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NaturalNumbers {

    public static void main(String[] args) {
        printNaturalNumbers(10);
        printNaturalNumbersAscending(10);
    }

    static void printNaturalNumbers(int n) {
        if (n <= 0) {
            return;
        }

        log.info(String.valueOf(n));

        printNaturalNumbers(n - 1);
    }

    static void printNaturalNumbersAscending(int n) {
        if (n <= 0) {
            return;
        }

        printNaturalNumbersAscending(n - 1);

        log.info(String.valueOf(n));
    }

}
