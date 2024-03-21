package com.arr.cs;

import java.util.*;

public class Linter {

    static final String RESULT_OK = "OK";
    static final String RESULT_MISSING_OPENING = "Missing opening ";
    static final String RESULT_MISSING_CLOSING = "Missing closing ";
    private static final Set<Character> OPENING_BRACES = new HashSet<>(
            Arrays.asList(
                    '(',
                    '[',
                    '{'
            )
    );
    private static final Set<Character> CLOSING_BRACES = new HashSet<>(
            Arrays.asList(
                    ')',
                    ']',
                    '}'
            )
    );
    private static final Map<Character, Character> MATCHING_OPENING_BRACES = Map.of(
            '(', ')',
            '[', ']',
            '{', '}'
    );

    public String check(String codeLine) {

        Deque<Character> braceStack = new LinkedList<>();

        for (Character currentBrace : codeLine.toCharArray()) {
            if (isOpeningBrace(currentBrace)) {
                braceStack.offerLast(currentBrace);
                continue;
            }

            if (isClosingBrace(currentBrace)) {
                Character lastOpeningBrace = braceStack.pollLast();

                if (MATCHING_OPENING_BRACES.get(lastOpeningBrace).equals(currentBrace)) {
                    continue;
                }

                return RESULT_MISSING_OPENING + currentBrace;
            }
        }

        if (!braceStack.isEmpty()) {
            return RESULT_MISSING_CLOSING + braceStack.pollLast();
        }

        return RESULT_OK;
    }

    private boolean isOpeningBrace(char character) {
        return OPENING_BRACES.contains(character);
    }

    private boolean isClosingBrace(char character) {
        return CLOSING_BRACES.contains(character);
    }
}
