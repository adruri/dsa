package com.adruri.cs.recursion;

/**
 * @url https://www.hackerrank.com/challenges/reduced-string/problem
 */
public class SuperReducedString {
    public String reduce(String input) {
        return reduceRecursive(input, 0);
    }

    private String reduceRecursive(String input, int index) {
        if (input.isEmpty()) {
            return "Empty String";
        }

        if (input.length() == 1 || index + 1 >= input.length()) {
            return input;
        }

        if (input.charAt(index) == input.charAt(index + 1)) {
            String removedFirst = removeFromIndex(input, index);
            String removedSecond = removeFromIndex(removedFirst, index);

            return reduceRecursive(removedSecond, 0);
        }

        return reduceRecursive(input, index + 1);
    }

    private String removeFromIndex(String input, int index) {
        return new StringBuilder(input)
                .deleteCharAt(index)
                .toString();
    }
}
