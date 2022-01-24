package com.jhunter.jstring.charcount;

import java.util.HashMap;
import java.util.Map;

public class AdditionOfTwoStringEqualToGivenString {
    /*
        Given strings s1, s2, and s3, find whether s3 is formed by an adding all char of s1 and s2.

        Example 1:
        Input: s1 = "abce", s2 = "dfgh", s3 = "abcdefgh"
        Output: true

        Example 2:
        Input: s1 = "", s2 = "", s3 = ""
        Output: true
     */

    public static boolean isAddintionOfStringEqualToGivenString(String s1, String s2, String s3) {
        // check if any input string is null.
        if (s1 == null || s2 == null || s3 == null)
            return false;
        // check if all three strings are empty.
        if (s1.length() == 0 && s2.length() == 0 && s3.length() == 0) {
            return true;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s3.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s1.toCharArray()) {
            if (map.getOrDefault(ch, 0) != 0) {
                map.put(ch, map.get(ch) - 1);
                if (map.getOrDefault(ch, 0) == 0) {
                    map.remove(ch);
                }
            } else
                return false;
        }

        for (char ch : s2.toCharArray()) {
            if (map.getOrDefault(ch, 0) != 0) {
                map.put(ch, map.get(ch) - 1);
                if (map.getOrDefault(ch, 0) == 0) {
                    map.remove(ch);
                }
            } else
                return false;
        }

        return map.isEmpty();
    }
}
