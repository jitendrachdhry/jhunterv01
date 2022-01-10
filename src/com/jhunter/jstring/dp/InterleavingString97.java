package com.jhunter.jstring.dp;

public class InterleavingString97 {
    /*
        Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.
        An interleaving of two strings s and t is a configuration where they are divided into non-empty substrings such that:
        s = s1 + s2 + ... + sn
        t = t1 + t2 + ... + tm
        |n - m| <= 1
        The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...
        Note: a + b is the concatenation of strings a and b.

        Example 1:
        Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbcbcac"
        Output: true

        Example 2:
        Input: s1 = "aabcc", s2 = "dbbca", s3 = "aadbbbaccc"
        Output: false

        Example 3:
        Input: s1 = "", s2 = "", s3 = ""
        Output: true

        Example 4:
        Input: s1 = "ace", s2 = "bd", s3 = "abcde"
        Output: true

        Constraints:
        0 <= s1.length, s2.length <= 100
        0 <= s3.length <= 200
        s1, s2, and s3 consist of lowercase English letters.

        Follow up: Could you solve it using only O(s2.length) additional memory space?
        Approach: DP
     */
    public static boolean isInterleave(String s1, String s2, String s3) {
        //check for input string validation
        if ((s1 == null || s2 == null || s3 == null) || (s1.length() + s2.length() != s3.length())) {
            return false;
        }

        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i < s1.length() + 1; i++) {
            for (int j = 0; j < s2.length() + 1; j++) {
                int s3Idx = i + j - 1;

                // as per rule, two empty string equal to given empty string.
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                } else if (i == 0) { // compare first string with result string and check if its Interleave or not.
                    dp[i][j] = dp[i][j - 1] && (s2.charAt(j - 1) == s3.charAt(s3Idx));
                } else if (j == 0) {//compare second string with result string and check if its Interleave or not.
                    dp[i][j] = dp[i - 1][j] && (s1.charAt(i - 1) == s3.charAt(s3Idx));
                } else {
                    dp[i][j] = (s1.charAt(i - 1) == s3.charAt(s3Idx) && dp[i - 1][j]) | (s2.charAt(j - 1) == s3.charAt(s3Idx) && dp[i][j - 1]);
                }
            }
        }
        return dp[s1.length()][s2.length()];
    }
}


