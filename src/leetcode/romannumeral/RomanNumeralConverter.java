package leetcode.romannumeral;

public class RomanNumeralConverter {
    public static int romanToInt(String s) {
        int sum = 0;
        int lookahead = 3;
        for (int i = 0; i < s.length(); i++) {
            int currentValue = charToInt(s.charAt(i));
            int nextValue = i + 1 < s.length() ? charToInt(s.charAt(i + 1)) : 0;
            lookahead = 3;
            if (currentValue > nextValue) sum += currentValue;
            if (currentValue < nextValue) {
                sum += nextValue - currentValue;
                i++;
            }
            if (currentValue == nextValue) {
                while (currentValue == nextValue && lookahead > 0){
                    sum += currentValue + nextValue;
                    currentValue = nextValue;
                    nextValue = s.charAt(++i);
                    lookahead--;
                }
            }
        }
        return sum;
    }

    private static int charToInt(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> throw new IllegalArgumentException();
        };
    }
}
