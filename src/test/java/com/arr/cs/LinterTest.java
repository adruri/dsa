package com.arr.cs;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.assertj.core.api.Assertions.assertThat;

public class LinterTest {

    @Test
    void correctBraces_shouldReturnOK() {

        String codeLine = "(([[]]))";

        Linter linter = new Linter();

        String result = linter.check(codeLine);

        assertThat(result).isEqualTo("OK");

    }

    @Test
    void missingClosing_shouldReturnMissingBracket() {

        String codeLine = "(([[]))";

        Linter linter = new Linter();

        String result = linter.check(codeLine);

        assertThat(result).isEqualTo("Missing matching [");

    }

    @Test
    void missingOpening_shouldReturnMissingOpeningParenthesis() {

        String codeLine = "([[]))";

        Linter linter = new Linter();

        String result = linter.check(codeLine);

        assertThat(result).isEqualTo("Missing matching [");

    }

    @Test
    void correctBraces_shouldReturnOK2() {

        String codeLine = "()";

        Linter linter = new Linter();

        String result = linter.check(codeLine);

        assertThat(result).isEqualTo("OK");

    }

}
