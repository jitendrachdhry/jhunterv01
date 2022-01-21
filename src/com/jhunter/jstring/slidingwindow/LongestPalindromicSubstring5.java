package com.jhunter.jstring.slidingwindow;

public class LongestPalindromicSubstring5 {
    public static String longestPalindrome(String s) { // O(n^3)
        if (s == null || s.length() == 0) {
            return "";
        }

        int startIdx = 0, endIdx = 0, palindromStrMaxSize = 1;

        for (int headIdx = 0; headIdx < s.length(); headIdx++) {
            int leftIdx = headIdx, tailIdx = s.length() - 1;
            boolean isPalindrome = false;
            for (int rightIdx = s.length() - 1; rightIdx > headIdx; rightIdx--) {
                if (s.charAt(leftIdx) == s.charAt(rightIdx)) {
                    /*
                        case to check:
                        1. [0]a [1]a      ==> (head point to index 0 and tail points to index 1)
                        2. [0]a [1]b [2]a ==> (head point to index 0 and tail points to index 2)
                    */
                    if ((leftIdx == (rightIdx - 1)) || ((rightIdx - leftIdx) - 1) == 1) {
                        isPalindrome = true;
                        break;
                    }
                    leftIdx++;
                } else {
                    leftIdx = headIdx;
                    rightIdx = tailIdx--;
                }
            }
            if (isPalindrome) {
                if ((tailIdx - headIdx + 1) > palindromStrMaxSize) {
                    startIdx = headIdx;
                    endIdx = tailIdx;
                    palindromStrMaxSize = tailIdx - headIdx + 1;
                }
            }
        }
        return s.substring(startIdx, endIdx + 1);
    }

    /*
        Given a string s, return the longest palindromic substring in s.
        Example 1:
        Input: s = "babad"
        Output: "bab"
        Explanation: "aba" is also a valid answer.
                Example 2:

        Input: s = "cbbd"
        Output: "bb"

        Call Out: Palindromic logic based on even or odd input string size.
    */

    public static String longestPalindromeV01(String s) { // O(n^2)
        int inputStrLength = s.length();
        if (s == null || inputStrLength < 1) {
            return "";
        }

        int startIdx = 0, endIdx = 0;
        for (int i = 0; i < inputStrLength; i++) {
            int oddLpsSize, evenLpsSize, currentLpsSize;
            evenLpsSize = expandPalindromeFromMiddle(i, i, s);
            oddLpsSize = expandPalindromeFromMiddle(i, i + 1, s);

            // get size of Longest Palindrome
            currentLpsSize = oddLpsSize > evenLpsSize ? oddLpsSize : evenLpsSize;
            if (currentLpsSize > endIdx - startIdx) {
                startIdx = i - ((currentLpsSize - 1) / 2);
                endIdx = i + (currentLpsSize / 2);
            }
        }
        return s.substring(startIdx, endIdx + 1);
    }

    static int expandPalindromeFromMiddle(int left, int right, String s) {
        int strLength = s.length();
        while (left >= 0 && right < strLength && (s.charAt(left) == s.charAt(right))) {
            left--;
            right++;
        }
        return right - (left + 1);
    }
}
