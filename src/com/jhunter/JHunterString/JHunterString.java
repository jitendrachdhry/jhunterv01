package com.jhunter.JHunterString;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*

    1. Given a string s, find the length of the longest substring without repeating characters.
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

    2.  Given a string s, return the longest palindromic substring in s.
        Example 1:
        Input: s = "babad"
        Output: "bab"
        Explanation: "aba" is also a valid answer.

        Example 2:
        Input: s = "cbbd"
        Output: "bb"
    3. The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
        P   A   H   N
        A P L S I I G
        Y   I   R
        And then read line by line: "PAHNAPLSIIGYIR"

        Write the code that will take a string and make this conversion given a number of rows:

        string convert(string s, int numRows);


        Example 1:

        Input: s = "PAYPALISHIRING", numRows = 3
        Output: "PAHNAPLSIIGYIR"
        Example 2:

        Input: s = "PAYPALISHIRING", numRows = 4
        Output: "PINALSIGYAHRPI"
        Explanation:
        P     I    N
        A   L S  I G
        Y A   H R
        P     I
 */
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
        /*
           Approach: Sliding window. Maintain two pointers.
           Left:  To contract or decrease the window.
           Right: To extend the window.
         */
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
            if (dp[(int) sArr[i]] >= minIdx) {
                newSubStringSize = i - minIdx; // calculate newStringSize once we found duplicate char in dp[].
            } else if (i == (sArr.length - 1)) { // Reached end of the array.
                newSubStringSize = (i - minIdx) + 1; // calculate newStringSize , from minIdx to end of string idx.
            }
            if (newSubStringSize > subStringSize) {
                subStringSize = newSubStringSize;
                startIdx = minIdx;
                endIdx = (i == (sArr.length - 1)) ? i : (i - 1);
            }
            if (newSubStringSize != 0) { // set minIdx only if we found duplicate char in the dp[].
                minIdx = dp[(int) sArr[i]] + 1;
            }
            dp[(int) sArr[i]] = i;
        }

        return subStringSize;
    }

    public int lengthOfLongestSubstringV01(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int max = 0;
        while (right < s.length()) {
            char ch = s.charAt(right);
            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(s.charAt(right)) + 1);
            }
            max = Math.max(max, right - left + 1);
            map.put(ch, right);
            right++;
        }
        return max;
    }

    public static int lengthOfLongestSubstringV02(String s) {
        HashSet<Character> set = new HashSet<Character>();
        int left = 0, right = 0, res = 0;
        while (right < s.length()) {
            if (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            } else {
                set.add(s.charAt(right));
                right++;
                res = Math.max(res, set.size());
            }

        }
        return res;
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

    /*
     * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows.
     * Complexity Analysis
        Time Complexity: O(n), where n == len(s)
        Space Complexity: O(n)
     */
    static public String zigzagPatternConvertor(String s, int numRows) {
        int inputStringLength = s.length();
        if (s == null || inputStringLength < 1 || numRows < 1) {
            return "";
        } else if (inputStringLength == 1 || numRows == 1) {
            return s;
        }

        boolean isGoingDown = false;
        int curRow = 0;
        StringBuilder[] v = new StringBuilder[numRows];
        for (int i = 0; i < inputStringLength; i++) {
            if (v[curRow] == null) {
                v[curRow] = new StringBuilder();
            }
            v[curRow].append(s.charAt(i));
            if(curRow<=0 || curRow >= (numRows - 1)) {
                isGoingDown = !isGoingDown;
            }
            curRow += isGoingDown == true ? 1 : -1;
        }

        StringBuilder resultStr = new StringBuilder(inputStringLength);
        for (int i = 0; i < numRows; i++) {
            if (v[i] != null) {
                resultStr.append(v[i].toString());
            } else {
                break;
            }
        }
        return resultStr.toString();
    }
}
