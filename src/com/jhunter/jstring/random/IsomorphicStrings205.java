package com.jhunter.jstring.random;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings205 {
    /*
        Given two strings s and t, determine if they are isomorphic.
        Two strings s and t are isomorphic if the characters in s can be replaced to get t.
        All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.

        Example 1:
        Input: s = "egg", t = "add"
        Output: true

        Example 2:
        Input: s = "foo", t = "bar"
        Output: false

        Example 3:
        Input: s = "paper", t = "title"
        Output: true

        Constraints:
        1 <= s.length <= 5 * 104
        t.length == s.length
        s and t consist of any valid ascii character.
     */

    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();

        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            if (!map.containsKey(chS)) {
                if (map.values().contains(t.charAt(i))) {
                    return false;
                }
                map.put(chS, t.charAt(i));
            } else {
                if (map.get(chS) != t.charAt(i)) {
                    return false;
                }
            }
        }

        return true;
    }
}
