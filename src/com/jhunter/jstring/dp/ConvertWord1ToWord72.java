package com.jhunter.jstring.dp;

public class ConvertWord1ToWord72 {
    /*
    Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.

    You have the following three operations permitted on a word:
    Insert a character
    Delete a character
    Replace a character

    Example 1:

    Input: word1 = "horse", word2 = "ros"
    Output: 3
    Explanation:
    horse -> rorse (replace 'h' with 'r')
    rorse -> rose (remove 'r')
    rose -> ros (remove 'e')
*/
    public static int minDistance(String word1, String word2) {
        if (word1 == null || word2 == null) {
            return 0;
        }

        int[][] dp = new int[word1.length() + 1][word2.length() + 1];
        dp[0][0] = 0;
        for (int i = 1; i <= word1.length() || i <= word2.length(); i++) {
            if (i <= word1.length()) {
                dp[i][0] = dp[i - 1][0] + 1;
            }
            if (i <= word2.length()) {
                dp[0][i] = dp[0][i - 1] + 1;
            }
        }
        for (int i = 1; i < word1.length() + 1; i++) {
            char ch = word1.charAt(i - 1);
            for (int j = 1; j < word2.length() + 1; j++) {
                if (ch == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                }
            }
        }
        return dp[word1.length()][word2.length()];
    }
}
