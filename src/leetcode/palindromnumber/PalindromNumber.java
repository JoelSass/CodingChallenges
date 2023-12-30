package leetcode.palindromnumber;

public class PalindromNumber {
    public static boolean isPalindrome(int x) {
        String numberAsString = String.valueOf(x);
        char[] chars = numberAsString.toCharArray();
        boolean isPalindrom = true;
        for (int i = 0; i < chars.length/2; i++) {
            isPalindrom &= chars[i] == chars[chars.length - 1 - i];
        }
        return isPalindrom;
    }
}
