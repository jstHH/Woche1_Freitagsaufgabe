package jst.freitagsaufgabe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidatorTest {
    PasswordValidator validator = new PasswordValidator();

    @Test
    void isValidPassword() {
    }

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



}