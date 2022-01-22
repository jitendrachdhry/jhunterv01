package com.jhunter.jstring.dp;

public class WildcardPatternMatching44 {
    /*
    Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*' where:
    '?' Matches any single character.
    '*' Matches any sequence of characters (including the empty sequence).
    Example 1:
    Input: s = "aa", p = "*"
    Output: true
    Explanation: '*' matches any sequence.

    Example 2:
    Input: s = "abcdt" , p = "a?*tt"
    Output: true
    Explanation: '?' matches 'b', but the second letter is 'x', which match will all.
 */
    public static boolean isWildcardMatch(String s, String p) {
        if ((p == null && s == null) || (p.length() <= 0 && s.length() <= 0)) {
            return true;
        }

        boolean dp[][] = new boolean[p.length() + 1][s.length() + 1];
        dp[0][0] = true;

        for (int i = 1; i < p.length() + 1; i++) {
            if (p.charAt(i - 1) == '*') {
                dp[i][0] = dp[i - 1][0];
            }
        }

        for (int i = 1; i <= p.length(); i++) {
            for (int j = 1; j <= s.length(); j++) {
                if (p.charAt(i - 1) == '?' || p.charAt(i - 1) == s.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(i - 1) == '*') {
                    dp[i][j] = dp[i][j - 1] | dp[i - 1][j];
                }
            }
        }
        return dp[p.length()][s.length()];
    }
}
