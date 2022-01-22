package com.jhunter.jstring.slidingwindow;

import java.util.HashMap;

public class MinimumWindowSubstring76 {
    /*
    76. Minimum Window Substring
    Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".
    The testcases will be generated such that the answer is unique.
    A substring is a contiguous sequence of characters within the string.

    Example 1:
    Input: s = "ADOBECODEBANC", t = "ABC"
    Output: "BANC"
    Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.

    Example 2:
    Input: s = "a", t = "a"
    Output: "a"
    Explanation: The entire string s is the minimum window.

    Example 3:
    Input: s = "a", t = "aa"
    Output: ""
    Explanation: Both 'a's from t must be included in the window.
    Since the largest window of s only has one 'a', return empty string.

    Example 4:
    Input: s = "akkkkkkabc", t = "abc"
    Output: "abc"

    Approach: Sliding Window
    In any sliding window based problem we have two pointers. One right pointer whose job is to expand the current window and then we have the left pointer whose job is to contract a given window. At any point in time only one of these pointers move and the other one remains fixed.
    The solution is pretty intuitive. We keep expanding the window by moving the right pointer. When the window has all the desired characters, we contract (if possible) and save the smallest window till now.
     Algorithm
     1. We start with two pointers, left and right initially pointing to the first element of the string SSS.
     2. We use the right pointer to expand the window until we get a desirable window i.e. a window that contains all of the characters of TTT.
     3. Once we have a window with all the characters, we can move the left pointer ahead one by one. If the window is still a desirable one we keep on updating the minimum window size.
     4. If the window is not desirable any more, we repeat step2 onwards.
*/
    public static String minWindow(String s, String t) {
        if (s == null || s.length() <= 0 || t == null || t.length() <= 0 || t.length() > s.length()) return "";

        String resultStr = "";
        HashMap<Character, Integer> subStringMap = new HashMap<>();
        // create HashMap which keep count of string t char's
        for (char ch : t.toCharArray()) {
            subStringMap.put(ch, subStringMap.getOrDefault(ch, 0) + 1);
        }

        int i = -1, j = -1; // left and right pointer of sliding window.
        int count = 0; // counter to keep target string characters in input string.
        // below HashMap keep char count of input string.
        HashMap<Character, Integer> inputStrMap = new HashMap<>();
        // two flags to come out from while(true) loop
        boolean innerLoop = false, outerLoop = false;
        do {
            innerLoop = outerLoop = false;

            // 1. acquire
            while (i < s.length() - 1 && count < t.length()) {
                ++i; // Its because i started from -1
                char ch = s.charAt(i);
                inputStrMap.put(ch, inputStrMap.getOrDefault(ch, 0) + 1);

                if (inputStrMap.get(ch) <= subStringMap.getOrDefault(ch, 0)) {
                    count++;
                }
                innerLoop = true;
            }
            // 2. compute output and release
            while (j < i && count == t.length()) {
                j++;
                if (subStringMap.containsKey(s.charAt(j))) {
                    String temp = s.substring(j, i + 1);
                    if (resultStr.length() == 0 || temp.length() < resultStr.length()) {
                        resultStr = temp;
                    }
                }
                char ch = s.charAt(j);
                if (inputStrMap.get(ch) == 1) {
                    inputStrMap.remove(ch);
                } else {
                    inputStrMap.put(ch, inputStrMap.get(ch) - 1);
                }

                if (inputStrMap.getOrDefault(ch, 0) < subStringMap.getOrDefault(ch, 0)) {
                    count--;
                }
                outerLoop = true;
            }
        } while (innerLoop || outerLoop);
        return resultStr;
    }
}
