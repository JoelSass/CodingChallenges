package leetcode.romannumeral;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralConverterTest {

    @Test
    void romanToInt() {
        assertEquals(3, RomanNumeralConverter.romanToInt("III"));
    }
}