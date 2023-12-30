package leetcode.longestcommonprefix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {
        assertEquals("c", LongestCommonPrefix.longestCommonPrefix(new String[]{"cir", "car"}));
    }
}