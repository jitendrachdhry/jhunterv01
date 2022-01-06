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
            if (curRow <= 0 || curRow >= (numRows - 1)) {
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

    static public int myAtoi(String s) {
        if (s == null || s.length() <= 0) {
            return 0;
        }

        long result = 0;
        boolean isSignPositive = true, isStartedCalculation = false, isSignFound = false;

        for (char ch : s.toCharArray()) {
            if (ch == '-' || ch == '+') {
                if (isStartedCalculation || isSignFound) {
                    return (int) (isSignPositive == true ? result : result * -1);
                }
                isSignFound = true;
                isSignPositive = ch == '+' ? true : false;
            } else if (ch >= '0' && ch <= '9') {
                isStartedCalculation = true;
                int currentDigit = ch - '0';
                result = (result * 10) + currentDigit;
                if (result > Integer.MAX_VALUE) {
                    return isSignPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            } else {
                if (ch == ' ' && !isStartedCalculation && !isSignFound) {
                    continue;
                }
                return (int) (isSignPositive == true ? result : result * -1);
            }
        }
        return (int) (isSignPositive == true ? result : result * -1);
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

    /*
     * Given an input string s and a pattern p, implement regular expression matching with support for '.' and '*' where:
       '.' Matches any single character.
       '*' Matches zero or more of the preceding element.
       The matching should cover the entire input string (not partial).
     * Dynamic programming technique for regex matching.
     */
    public static boolean matchRegex(String textStr, String patternStr) {
        char[] text = textStr.toCharArray();
        char[] pattern = patternStr.toCharArray();
        boolean T[][] = new boolean[text.length + 1][pattern.length + 1];

        T[0][0] = true;
        //Deals with patterns like a* or a*b* or a*b*c*
        for (int i = 1; i < T[0].length; i++) {
            if (pattern[i - 1] == '*') {
                T[0][i] = T[0][i - 2];
            }
        }

        for (int i = 1; i < T.length; i++) {
            for (int j = 1; j < T[0].length; j++) {
                if (pattern[j - 1] == '.' || pattern[j - 1] == text[i - 1]) {
                    T[i][j] = T[i - 1][j - 1];
                } else if (pattern[j - 1] == '*') {
                    T[i][j] = T[i][j - 2];
                    if (pattern[j - 2] == '.' || pattern[j - 2] == text[i - 1]) {
                        T[i][j] = T[i][j] | T[i - 1][j];
                    }
                } else {
                    T[i][j] = false;
                }
            }
        }
        return T[text.length][pattern.length];
    }

    /*
        Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

        Symbol       Value
        I             1
        V             5
        X             10
        L             50
        C             100
        D             500
        M             1000
        For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

        Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

        I can be placed before V (5) and X (10) to make 4 and 9.
        X can be placed before L (50) and C (100) to make 40 and 90.
        C can be placed before D (500) and M (1000) to make 400 and 900.
     */
    public static String integerToRoman(int num) {
        if (num <= 0) {
            return "";
        }
        String romanKeys[] = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int romanValues[] = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        StringBuilder romanStr = new StringBuilder();
        for (int i = romanKeys.length - 1; i >= 0; i--) {
            int res = num / romanValues[i];
            if (res > 0) {
                for (int j = 0; j < res; j++) {
                    romanStr.append(romanKeys[i]);
                }
            }
            num %= romanValues[i];

            if (num == 0) {
                break;
            }
        }
        return romanStr.toString();
    }
/*
    Roman to Integer
    Example 1:
    Input: s = "III"
    Output: 3
    Explanation: III = 3.

    Example 2:
    Input: s = "LVIII"
    Output: 58
    Explanation: L = 50, V= 5, III = 3.

    Example 3:
    Input: s = "MCMXCIV"
    Output: 1994
    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
    public static int romanToInteger(String num) {
        if (num == null || num.length() <= 0 ) {
            return 0;
        }

        Map<String, Integer> romanKeyMap = new HashMap<String, Integer>();
        romanKeyMap.put("I", 1);
        romanKeyMap.put("IV", 4);
        romanKeyMap.put("V", 5);
        romanKeyMap.put("IX", 9);
        romanKeyMap.put("X", 10);
        romanKeyMap.put("XL", 40);
        romanKeyMap.put("L", 50);
        romanKeyMap.put("XC", 90);
        romanKeyMap.put("C", 100);
        romanKeyMap.put("CD", 400);
        romanKeyMap.put("D", 500);
        romanKeyMap.put("CM", 900);
        romanKeyMap.put("M", 1000);

        int result = 0;
        for(int i=0; i<num.length(); ) {
            if(i != num.length() - 1 && romanKeyMap.containsKey(num.substring(i, i+2))){
                result += romanKeyMap.get(num.substring(i, i+2));
                i+=2;
            } else {
                result += romanKeyMap.get(num.substring(i, i+1));
                i+=1;
            }
        }
        return result;
    }

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
        if(strs == null || strs.length <=0) {
            return "";
        }

        String prefix = strs[0];
        for( int i=1; i<strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring( 0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    public static String longestCommonPrefixV01(String[] strs) {
        for( int i=0; ; i++){
            for(int j=1; j<strs.length; j++) {
                if( (i < strs[j].length()) && (i < strs[0].length()) && ( strs[j].charAt(i) == strs[0].charAt(i))){
                    continue;
                }
                return (j == 1) ? "" : strs[0].substring(0, j);
            }
        }
    }
}
