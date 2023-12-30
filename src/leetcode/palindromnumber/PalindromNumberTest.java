package leetcode.palindromnumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromNumberTest {

    @Test
    void isPalindrome() {
        assertTrue(PalindromNumber.isPalindrome(121));
    }

    @Test
    void isPalindromeNegative() {
        assertFalse(PalindromNumber.isPalindrome(-121));
    }
}