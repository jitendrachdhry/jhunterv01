package com.jhunter.jstring.dp;

import java.util.Arrays;

public class DistinctSubsequences115 {
    /*
        Given two strings s and t, return the number of distinct subsequences of s which equals t.
        A string's subsequence is a new string formed from the original string by deleting some (can be none) of the characters without disturbing the remaining characters' relative positions. (i.e., "ACE" is a subsequence of "ABCDE" while "AEC" is not).
        The test cases are generated so that the answer fits on a 32-bit signed integer.

        Example 1:
        Input: s = "rabbbit", t = "rabbit"
        Output: 3
        Explanation:
        As shown below, there are 3 ways you can generate "rabbit" from S.
        rabbbit
        rabbbit
        rabbbit

        Example 2:
        Input: s = "babgbag", t = "bag"
        Output: 5
        Explanation:
        As shown below, there are 5 ways you can generate "bag" from S.
        babgbag
        babgbag
        babgbag
        babgbag
        babgbag

        Constraints:
        1 <= s.length, t.length <= 1000
        s and t consist of English letters.
     */
    public static int numDistinct(String s, String t) {
        int[][] dp = new int[s.length() + 1][t.length() + 1];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return findDistinctSubsequences(0, 0, s, t, dp);
    }

    static int findDistinctSubsequences(int i, int j, String s, String t, int[][] dp) {
        //check if we reach end of target string.
        if (j == t.length()) return 1;
        //check if we reach end of input string before reaching end of target string.
        if (i == s.length()) return 0;
        // check if we already have Distinct Subsequences for index i and j.
        if (dp[i][j] != -1) return dp[i][j];

        // if both input and target char match. look for next match including the char plus excluding th char.
        if (s.charAt(i) == t.charAt(j)) {
            dp[i][j] = findDistinctSubsequences(i + 1, j + 1, s, t, dp) + findDistinctSubsequences(i + 1, j, s, t, dp);
        } else { // if both input and target char does not match than move to next char of input string.
            dp[i][j] = findDistinctSubsequences(i + 1, j, s, t, dp);
        }
        return dp[i][j];
    }
}
