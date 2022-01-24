package com.jhunter.jstring.random;

public class String2Integer8 {
    static public int myAtoi(String s) {
        if (s == null || s.length() <= 0) {
            return 0;
        }

        long result = 0;
        boolean isSignPositive = true, isStartedCalculation = false, isSignFound = false;

        for (char ch : s.toCharArray()) {
            if (ch == '-' || ch == '+') {
                if (isStartedCalculation || isSignFound) {
                    return (int) (isSignPositive == true ? result : result * -1);
                }
                isSignFound = true;
                isSignPositive = ch == '+';
            } else if (ch >= '0' && ch <= '9') {
                isStartedCalculation = true;
                int currentDigit = ch - '0';
                result = (result * 10) + currentDigit;
                if (result > Integer.MAX_VALUE) {
                    return isSignPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            } else {
                if (ch == ' ' && !isStartedCalculation && !isSignFound) {
                    continue;
                }
                return (int) (isSignPositive == true ? result : result * -1);
            }
        }
        return (int) (isSignPositive == true ? result : result * -1);
    }
}
