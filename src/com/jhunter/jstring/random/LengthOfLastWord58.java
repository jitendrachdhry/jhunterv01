package com.jhunter.jstring.random;

public class LengthOfLastWord58 {
    /*
        Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.
     */
    public static String lastWord(String s) {
        if (s == null || s.length() <= 0) return "";

        boolean trimSpace = true;
        int startIdx = 0, endIdx = s.length();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (trimSpace) {
                    endIdx = i;
                    continue;
                }
                startIdx = i + 1;
                break;
            } else {
                trimSpace = false;
            }
        }
        return s.substring(startIdx, endIdx);
    }
}
