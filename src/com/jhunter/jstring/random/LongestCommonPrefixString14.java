package com.jhunter.jstring.random;

public class LongestCommonPrefixString14 {
       /*
        Write a function to find the longest common prefix string amongst an array of strings.

        If there is no common prefix, return an empty string "".

        Example 1:
        Input: strs = ["flower","flow","flight"]
        Output: "fl"

        Example 2:
        Input: strs = ["dog","racecar","car"]
        Output: ""
        Explanation: There is no common prefix among the input strings.
     */

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length <= 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    public static String longestCommonPrefixV01(String[] strs) {
        for (int i = 0; ; i++) {
            for (int j = 1; j < strs.length; j++) {
                if ((i < strs[j].length()) && (i < strs[0].length()) && (strs[j].charAt(i) == strs[0].charAt(i))) {
                    continue;
                }
                return (j == 1) ? "" : strs[0].substring(0, j);
            }
        }
    }
}
