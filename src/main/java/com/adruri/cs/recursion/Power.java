package com.adruri.cs.recursion;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Power {

    public static void main(String[] args) {

        int base = -2;
        int power = 4;

        log.info("Value of {}^{} = {}", base, power, power(base, power));

    }

    static int power(int base, int power) {

        if (power == 0) {
            return 1;
        }

        if (power == 1) {
            return base;
        }

        return power(base, power - 1) * base;
    }

}
