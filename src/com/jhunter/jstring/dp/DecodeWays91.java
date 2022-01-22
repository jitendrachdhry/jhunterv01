package com.jhunter.jstring.dp;

public class DecodeWays91 {
    /*
        A message containing letters from A-Z can be encoded into numbers using the following mapping:

        'A' -> "1"
        'B' -> "2"
        ...
        'Z' -> "26"
        To decode an encoded message, all the digits must be grouped then mapped back into letters using the reverse of the mapping above (there may be multiple ways). For example, "11106" can be mapped into:

        "AAJF" with the grouping (1 1 10 6)
        "KJF" with the grouping (11 10 6)
        Note that the grouping (1 11 06) is invalid because "06" cannot be mapped into 'F' since "6" is different from "06".

        Given a string s containing only digits, return the number of ways to decode it.
        The test cases are generated so that the answer fits in a 32-bit integer.

        Example 1:
        Input: s = "12"
        Output: 2
        Explanation: "12" could be decoded as "AB" (1 2) or "L" (12).

        Example 2:
        Input: s = "226"
        Output: 3
        Explanation: "226" could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
        Example 3:

        Input: s = "06"
        Output: 0
        Explanation: "06" cannot be mapped to "F" because of the leading zero ("6" is different from "06").
        Approach: Dynamic Programming
        Recursion, Tabulation(Bottom-up Approach) or Memoization ( Top-Down Approach). In current case we focus on Memoization.
     */
    public static int numDecodings(String s) {
        if (s == null || s.length() <= 0) return 0;

        int[] dp = new int[s.length() + 1];
        dp[0] = 1;

        for (int i = 1; i < s.length() + 1; i++) {
            int decodeNumber = (s.charAt(i - 1) == '0') ? 0 : dp[i - 1];
            // special check for '0' or '00' or n0 (where n is > 2) like 90 or 30
            if ((s.charAt(i - 1) == '0') && ((i == 1) || (s.charAt(i - 2) == '0') || (s.charAt(i - 2) - '0') > 2)) {
                return 0;
            } else if (i == 1) {
                decodeNumber = 1;
            } else if (s.charAt(i - 2) != '0') {
                int num = ((s.charAt(i - 2) - '0') * 10) + (s.charAt(i - 1) - '0');
                if (num <= 26) { // add case to check '0n'
                    decodeNumber += dp[i - 2];
                } else if (s.charAt(i - 1) == '0') { // special case to handle n0 (where n is > 2) like 90 or 30
                    return 0;
                }
            }
            dp[i] = decodeNumber;
        }
        return dp[s.length()];
    }
}
