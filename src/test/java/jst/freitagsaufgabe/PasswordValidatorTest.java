package jst.freitagsaufgabe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    PasswordValidator validator = new PasswordValidator();


    //Main Method
    @Test
    void isValidPassword_whenSimpleAndValid_thenTrue() {
        String input = "abcdefg2";
        String group = "simple";
        assertTrue(validator.isValidPassword(input, group));
    }

    @Test
    void isValidPassword_whenSimpleAndInvalid_thenFalse() {
        String input = "abcdefgt";
        String group = "simple";
        assertFalse(validator.isValidPassword(input, group));
    }

    // Validation Groups
    @Test
    void isValidSimple_whenLengthAndNumbers_thenTrue() {
        String input = "abcdefg12";
        assertTrue(validator.isValidSimple(input));
    }

    @Test
    void isValidSimple_whenLengthOnly_thenFalse() {
        String input = "abcdefgh";
        assertFalse(validator.isValidSimple(input));
    }

    @Test
    void isValidSimple_whenNumbersOnly_thenFalse() {
        String input = "1234567";
        assertFalse(validator.isValidSimple(input));
    }

    // Validation Steps
    @Test
    void hasLength_when7_thenFalse() {
        String input = "abcdefg";
        assertFalse(validator.hasLength(input));
    }

    @Test
    void hasLength_when8_thenTrue() {
        String input = "abcdefgh";
        assertTrue(validator.hasLength(input));
    }

    @Test
    void hasNumber_whenNoNumber_thenFalse() {
        String input = "abcdefgh";
        assertFalse(validator.hasNumber(input));
    }

    @Test
    void hasNumber_whenNumber_thenTrue() {
        String input = "1bcdefgh";
        assertTrue(validator.hasNumber(input));
    }

    @Test
    void hasUpperCase_whenNoUC_thenFalse() {
        String input = "abcdefgh";
        assertFalse(validator.hasUpperCase(input));
    }

    @Test
    void hasUpperCase_whenUC_thenTrue() {
        String input = "Abcdefgh";
        assertTrue(validator.hasUpperCase(input));
    }

    @Test
    void hasLowerCase_whenNoLC_thenFalse() {
        String input = "ABCDEFGH";
        assertFalse(validator.hasLowerCase(input));
    }

    @Test
    void hasLowerCase_whenLC_thenTrue() {
        String input = "aBCDEFGH";
        assertTrue(validator.hasLowerCase(input));
    }

    @Test
    void isWeak_whenWeak_thenTrue() {
        String input = "qwertz";
        assertTrue(validator.isWeak(input));
    }

    @Test
    void isWeak_whenStrong_thenFalse() {
        String input = "1x2yTZU00";
        assertFalse(validator.isWeak(input));
    }

    @Test
    void doesStringContains_True() {
        String input = "test";
        char[] compareArray = {'t', 'a'};
        assertTrue(validator.doesStringContains(input, compareArray));
    }

    @Test
    void doesStringContains_False() {
        String input = "test";
        char[] compareArray = {'b', 'a'};
        assertFalse(validator.doesStringContains(input, compareArray));
    }
}