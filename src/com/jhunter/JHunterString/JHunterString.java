package com.jhunter.JHunterString;

import java.util.*;

/*
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
        if (num == null || num.length() <= 0) {
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
        for (int i = 0; i < num.length(); ) {
            if (i != num.length() - 1 && romanKeyMap.containsKey(num.substring(i, i + 2))) {
                result += romanKeyMap.get(num.substring(i, i + 2));
                i += 2;
            } else {
                result += romanKeyMap.get(num.substring(i, i + 1));
                i += 1;
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
        if (strs == null || strs.length <= 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

    public static String longestCommonPrefixV01(String[] strs) {
        for (int i = 0; ; i++) {
            for (int j = 1; j < strs.length; j++) {
                if ((i < strs[j].length()) && (i < strs[0].length()) && (strs[j].charAt(i) == strs[0].charAt(i))) {
                    continue;
                }
                return (j == 1) ? "" : strs[0].substring(0, j);
            }
        }
    }

    /*
    Letter Combinations of a Phone Number
    Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.
    A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters. Like:
    2 -> abc
    3 -> def
    4 -> geh

    Example 1:
    Input: digits = "23"
    Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

    Example 2:
    Input: digits = ""
    Output: []

    Example 3:
    Input: digits = "2"
    Output: ["a","b","c"]

    Approach 1: Backtracking (https://leetcode.com/explore/featured/card/recursion-ii/472/backtracking/2654/)
     */
    static final String[] digitMap = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public static List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();
        if (digits == null || digits.length() <= 0) {
            return result;
        }

        dfs(digits, 0, "", result);
        return result;
    }

    /**
     * e.g., "23"
     * recursion tree
     * root
     * /          |             \
     * first possibility -> "abc"           "a"           "b"            "c"
     * /  |  \        /  |  \        /  |  \
     * second possibility -> "def"      "d" "e" "f"    "d" "e" "f"    "d" "e" "f"
     * <p>
     * start at root with empty string,
     * and build possibilities by appending possible option at each level down each branch of the tree.
     **/
    public static void dfs(String digits, int idx, String str, List<String> result) {
        if (digits.length() == idx) {
            result.add(str);
            return;
        }

        String currentDigitStr = digitMap[(digits.charAt(idx) - '0')];
        for (char ch : currentDigitStr.toCharArray()) {
            dfs(digits, idx + 1, str + ch, result);
        }
    }

    /*
        Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

        An input string is valid if:
        Open brackets must be closed by the same type of brackets.
        Open brackets must be closed in the correct order.
    */
    static public boolean isValid(String s) {
        if (s == null || s.length() <= 0) {
            return false;
        }

        Stack<Character> stack = new Stack<Character>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty() || stack.pop() != openBracketOf(ch)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return (stack.isEmpty()) ? true : false;
    }

    public static char openBracketOf(char ch) {
        switch (ch) {
            case '}':
                return '{';
            case ')':
                return '(';
            case ']':
                return '[';
        }
        return ch;
    }

    /*
        Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
        Example 1:
        Input: n = 3
        Output: ["((()))","(()())","(())()","()(())","()()()"]

        Example 2:
        Input: n = 1
        Output: ["()"]
     */
    public List<String> generateParenthesis(int n) {
        List<String> result_output = new ArrayList<String>();
        backtrace(result_output, "", 0, 0, n);
        return result_output;
    }

    void backtrace(List<String> result_array, String current_string, int open, int close, int max) {
        if (current_string.length() == max) { // base case
            result_array.add(current_string);
            return;
        }

        if (open < max) {
            backtrace(result_array, current_string + "(", open + 1, close, max);
        }

        if (close < open) {
            backtrace(result_array, current_string + ")", open, close + 1, max);
        }
    }

    /*
        Given a string containing just the characters '(' and ')', find the length of the longest valid (well-formed) parentheses substring.

        Example 1:
        Input: s = "(()"
        Output: 2
        Explanation: The longest valid parentheses substring is "()".

        Example 2:
        Input: s = ")()())"
        Output: 4
        Explanation: The longest valid parentheses substring is "()()".

     */
    public static int longestValidParentheses(String s) {
        if (s == null || s.length() <= 0) return 0;
        Stack<Character> parS = new Stack<Character>();
        Stack<Integer> latestInvalidIdxS = new Stack<Integer>();
        latestInvalidIdxS.push(-1);
        int max = 0, idx = 0;
        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                if (!parS.isEmpty() && parS.peek() == '(') {
                    parS.pop();
                    latestInvalidIdxS.pop();
                    max = Math.max(max, idx - latestInvalidIdxS.peek());
                } else {
                    latestInvalidIdxS.push(idx);
                }
            } else if (ch == '(') {
                parS.push(ch);
                latestInvalidIdxS.push(idx);
            }
            idx++;
        }
        return max;
    }

    /*
        Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*' where:
        '?' Matches any single character.
        '*' Matches any sequence of characters (including the empty sequence).
        Example 2:
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

    /*
        Given an array of strings strs, group the anagrams together. You can return the answer in any order.
        An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

        Example 1:
        Input: strs = ["eat","tea","tan","ate","nat","bat"]
        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
     */
    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length <= 0) {
            return new ArrayList<List<String>>();
        }
        Map<String, List<String>> resultMap = new HashMap<String, List<String>>();
        for (String str : strs) {
            char[] currentSortStr = str.toCharArray();
            Arrays.sort(currentSortStr);
            String sortedStr = new String(currentSortStr);
            if (resultMap.containsKey(new String(currentSortStr))) {
                resultMap.get(sortedStr).add(str);
            } else {
                List<String> stringList = new ArrayList<String>();
                stringList.add(str);
                resultMap.put(sortedStr, stringList);
            }
        }
        List<List<String>> resList = new ArrayList<List<String>>();
        for (Map.Entry<String, List<String>> entry : resultMap.entrySet()) {
            resList.add(entry.getValue());
        }
        return resList;
    }

    /*
        Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.
     */
    public static String lastWord(String s) {
        if (s == null || s.length() <= 0) return "";

        boolean trimSpace = true;
        int startIdx = 0, endIdx = s.length();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (trimSpace) {
                    endIdx = i;
                    continue;
                }
                startIdx = i + 1;
                break;
            } else {
                trimSpace = false;
            }
        }
        return s.substring(startIdx, endIdx);
    }

    /*
        Given a string path, which is an absolute path (starting with a slash '/') to a file or directory in a Unix-style file system, convert it to the simplified canonical path.
        In a Unix-style file system, a period '.' refers to the current directory, a double period '..' refers to the directory up a level, and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'. For this problem, any other format of periods such as '...' are treated as file/directory names.

        The canonical path should have the following format:

        The path starts with a single slash '/'.
        Any two directories are separated by a single slash '/'.
        The path does not end with a trailing '/'.
        The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
        Return the simplified canonical path.
        Example 1:
            Input: path = "/../"
            Output: "/"
            Explanation: Going one level up from the root directory is a no-op, as the root level is the highest level you can go.
        Example 2:
            Input: path = "/home//foo/"
            Output: "/home/foo"
            Explanation: In the canonical path, multiple consecutive slashes are replaced by a single one.
     */
    public static String simplifyPath(String path) {
        if (path == null || path.length() <= 0 || (path.length() == 1 && path.charAt(0) != '/'))
            return "";

        int backwordDirCount = 0;
        List<String> resutPathList = new ArrayList<String>();
        String currentDir = "";
        // Input: "/../a/../../"
        for (int i = path.length() - 1; i >= 0; i--) {
            if (path.charAt(i) == '/') {
                if (((path.length() - 1) == i) || (i <= (path.length() - 2) && path.charAt(i + 1) == '/')) continue;
                if (currentDir.equals("..")) {
                    backwordDirCount++;
                    currentDir = "";
                    continue;
                } else if (currentDir.equals(".")) {
                    currentDir = "";
                    continue;
                }
                if (backwordDirCount > 0) {
                    backwordDirCount--;
                    currentDir = "";
                    continue;
                }
                resutPathList.add(0, currentDir);
                currentDir = "";

            } else {
                currentDir = path.charAt(i) + currentDir;
            }
        }

        if (resutPathList.size() == 0) {
            return "/";
        }
        String resStr = "";
        for (String dir : resutPathList) {
            resStr += ("/" + dir);
        }
        return resStr;
    }

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

        int dp[][] = new int[word1.length() + 1][word2.length() + 1];
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
