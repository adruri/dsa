package com.adruri.cs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LinterTest {

    @Test
    void correctBraces_shouldReturnOK() {

        String codeLine = "( ( [ [] ] ) )";

        Linter linter = new Linter();

        String result = linter.check(codeLine);

        assertThat(result).isEqualTo(Linter.RESULT_OK);

    }

    @Test
    void missingClosing_shouldReturnMissingBracket() {

        String codeLine = "(([[]))";

        Linter linter = new Linter();

        String result = linter.check(codeLine);

        assertThat(result).isEqualTo(Linter.RESULT_MISSING_OPENING + ")");

    }

    @Test
    void missingOpening_shouldReturnMissingOpeningParenthesis() {

        String codeLine = "([[]))";

        Linter linter = new Linter();

        String result = linter.check(codeLine);

        assertThat(result).isEqualTo(Linter.RESULT_MISSING_OPENING + ")");

    }

    @Test
    void correctBraces_shouldReturnOK2() {

        String codeLine = "()";

        Linter linter = new Linter();

        String result = linter.check(codeLine);

        assertThat(result).isEqualTo(Linter.RESULT_OK);

    }

    @Test
    void missingClosingBrace() {
        String codeLine = "{()";
        Linter linter = new Linter();

        String result = linter.check(codeLine);

        assertThat(result).isEqualTo(Linter.RESULT_MISSING_CLOSING + "{");
    }

}
