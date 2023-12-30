package leetcode.longestcommonprefix;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int count = 0;
        int shortestWordLength = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < shortestWordLength) shortestWordLength = str.length();
        }

        for (int i = 0; i < shortestWordLength; i++) {
            char currentChar = '\0';
            boolean isSameChar = true;
            for (String str : strs) {
                if (currentChar == '\0') currentChar = str.charAt(i);
                else isSameChar &= currentChar == str.charAt(i);
            }
            if (isSameChar) count++;
            else break;
        }
        return strs[0].substring(0,count);
    }
}
