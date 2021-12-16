package com.jhunter.JHunterString;

import java.util.Arrays;
import java.util.HashSet;

public class JHunterString {
    /*
    Given a string s, find the length of the longest substring without repeating characters.
    Example 1:

    Input: s = "abcabcbb"
    Output: 3
    Explanation: The answer is "abc", with the length of 3.
    Example 2:

    Input: s = "bbbbb"
    Output: 1
    Explanation: The answer is "b", with the length of 1.
    Example 3:

    Input: s = "pwwkew"
    Output: 3
    Explanation: The answer is "wke", with the length of 3.
    Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
    Example 4:

    Input: s = ""
    Output: 0

    Constraints:
    0 <= s.length <= 5 * 104
    s consists of English letters, digits, symbols and spaces.
     */
    public static int MAX_ARR_SIZE = 256;

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) return 0;

        int dp[] = new int[MAX_ARR_SIZE];
        int minIdx = 0;
        int startIdx = 0, endIdx = 0, subStringSize = 1;

        System.out.print(" Input string \"" + s + "\":");
        Arrays.fill(dp, -1);
        dp[(int) s.charAt(0)] = 0;
        char sArr[] = s.toCharArray();
        // loop through each element using for-each loop
        for (int i = 1; i < sArr.length; i++) {
            int newSubStringSize = 0;
            // access each character
            if ((dp[(int) sArr[i]] != -1 && dp[(int) sArr[i]] >= minIdx)) {
                newSubStringSize = i - minIdx; // calculate newStringSize once we found duplicate char in dp[].
            } else if (i == (sArr.length - 1)) { // Reached end of the array.
                newSubStringSize = (i - minIdx) + 1; // calculate newStringSize , from minIdx to end of string idx.
            }
            if (newSubStringSize > subStringSize) {
                subStringSize = newSubStringSize;
                startIdx = minIdx;
                endIdx = i - 1;
            }
            if (newSubStringSize != 0) { // set minIdx only if we found duplicate char in the dp[].
                minIdx = dp[(int) sArr[i]] + 1;
            }
            dp[(int) sArr[i]] = i;
        }

        return subStringSize;
    }

    public static int lengthOfLongestSubstringV01(String s) {
        HashSet<Character> set =  new HashSet<Character>();

        int left=0, right=0, res=0;

        while(right < s.length()){
            if(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            } else{
                set.add(s.charAt(right));
                right++;
                res = Math.max(res, set.size());
            }

        }

        return res;
    }
}
