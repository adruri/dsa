package com.arr.cs;

import java.util.*;

public class Linter {

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

    private static final Map<Character, Character> MATCHING_OPENING_BRACES = createBracesMap();
    public String check1(String codeLine) {

        Stack<Character> characterStack = new Stack<>();

        for (char currentChar : codeLine.toCharArray()) {
            if (isOpeningBrace(currentChar)) {
                characterStack.push(currentChar);
            } else if (isClosingBrace(currentChar)) {
                char lastBraceInStack = characterStack.pop();
                if (MATCHING_OPENING_BRACES.get(lastBraceInStack).equals(currentChar)) {
                    continue;
                }

                return "Missing matching " + lastBraceInStack;
            }
        }

        return characterStack.empty() ? "OK" : "Missing matching " + characterStack.peek();
    }

    public String check(String codeLine) {
        Deque<Character> characterStack = new ArrayDeque<>();

        for (Character currentChar : codeLine.toCharArray()) {

            if (isOpeningBrace(currentChar)) {
                characterStack.push(currentChar);
                continue;
            }

            if (isClosingBrace(currentChar)) {
                Character lastBraceInStack = characterStack.pollFirst();

                if (lastBraceInStack == null) {
                    return "Missing opening brace for " + currentChar;
                }

                if (!MATCHING_OPENING_BRACES.get(lastBraceInStack).equals(currentChar)) {
                    return "Missing opening brace for " + currentChar;
                }
            }
        }

        return "OK";
    }

    private boolean isOpeningBrace(char character) {
        return OPENING_BRACES.contains(character);
    }

    private boolean isClosingBrace(char character) {
        return CLOSING_BRACES.contains(character);
    }

    private static Map<Character, Character> createBracesMap() {
        Map<Character, Character> result = new HashMap<>();

        result.put('[' , ']');
        result.put('(' , ')');
        result.put('{' , '}');

        return result;
    }
}
