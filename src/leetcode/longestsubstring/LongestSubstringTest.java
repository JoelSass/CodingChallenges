package leetcode.longestsubstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringTest {

    @Test
    void OneLetterString() {
        assertEquals(LongestSubstring.lengthOfLongestSubstring("a"),1);
    }

    @Test
    void OneLetterMultipleString() {
        assertEquals(LongestSubstring.lengthOfLongestSubstring("aaaaaa"),1);
    }
}