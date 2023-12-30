package leetcode.longestsubstring;

import java.util.HashMap;
import java.util.HashSet;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int maxCount = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < i + 1; j++) {

            }
            HashSet<Character> hashSet = new HashSet<>();
            if (hashSet.contains(s.charAt(i))){
                if (hashSet.size() > maxCount) maxCount = hashSet.size();
                continue;
            }
            hashSet.add(s.charAt(i));
        }
        return maxCount;
    }
}
