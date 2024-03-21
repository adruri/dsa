package com.adruri.cs.recursion;

/**
 * https://www.hackerrank.com/challenges/fizzbuzz/
 * https://catonmat.net/tools/generate-fizzbuzz-sequence
 */
public class FizzBuzz {
    public String solve() {
        return createSequence(new StringBuilder(), 1);
    }

    private String createSequence(StringBuilder result, int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            result.append("FizzBuzz");
        } else if (number % 3 == 0) {
            result.append("Fizz");
        } else if (number % 5 == 0) {
            result.append("Buzz");
        } else {
            result.append(number);
        }

        if (number == 100) {
            return result.toString();
        }

        result.append(", ");

        return createSequence(result, number + 1);
    }
}
