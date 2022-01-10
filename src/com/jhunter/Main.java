package com.jhunter;

import com.jhunter.JHunterString.JHunterString;
import com.jhunter.fang.FANG2021;
import com.jhunter.fang.FANG2021DP;
import com.jhunter.jstring.backtracking.RestoreIPAddresses93;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr1 = null; // { 1,3,5};
        int[] arr2 = {2, 3, 6, 9};
        int[] arr3 = {0, 1, 5, 9};
        //int[] arr3 = {0, 0, 0, 0};

        FANG2021.MergeMultipleSortedArray(arr1, arr2, arr3);

        FANG2021.addNumberFromIntArray(arr2, arr3);

        System.out.println("\n ============================= addTwoStringNumberCompareWithOutputStringNumber ========================================================");
        String strNum1 = "123.4", strNum2 = ".123";
        FANG2021.addTwoStringNumberCompareWithOutputStringNumber(strNum1, strNum2);

        //int[] dp = { 1, -2, 4, 3, -2, 0};
        int[] dp = {1, -2, 4, -5, 2, 0};
        AtomicInteger startIdx = new AtomicInteger(0), endIdx = new AtomicInteger(0);
        FANG2021DP.addTwoStringNumberCompareWithOutputStringNumber(dp, startIdx, endIdx);

        int[] arrInput = {0, 2, 1, 2, 4, 5};
        // int[] arrInput = {0,2,1,-2,4,5};

        int target = 7;
        FANG2021DP.addTwoStringNumberCompareWithOutputStringNumber(arrInput, target);

        System.out.println("\n ============================= FindTheLongestIncreasingSubsequence ========================================================");
        FANG2021DP.FindTheLongestIncreasingSubsequence(new int[]{-1, 3, 4, 5, 2, 2, 2, 2});
        System.out.println("\n ============================= FindTheLongestNonDecreasingSubsequence ========================================================");
        FANG2021DP.FindTheLongestNonDecreasingSubsequence(new int[]{-1, 3, 4, 5, 2, 2, 2, 2});
        System.out.println("\n ============================= FindTheLongestDecreasingSubsequence ========================================================");
        FANG2021DP.FindTheLongestDecreasingSubsequence(new int[]{-1, 3, 4, 5, 2, 2, 2, 2});

        System.out.println("\n ============================= lengthOfLongestSubstring ========================================================");
        // System.out.println(" lengthOfLongestSubstring Result: " + JHunterString.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(" lengthOfLongestSubstring Result: " + JHunterString.lengthOfLongestSubstring("tmmzuxt"));
        System.out.println(" lengthOfLongestSubstring Result: " + JHunterString.lengthOfLongestSubstring("abcabcbbefgh"));
        System.out.println(" lengthOfLongestSubstring Result: " + JHunterString.lengthOfLongestSubstring("gabcabeda"));
        System.out.println(" lengthOfLongestSubstring Result: " + JHunterString.lengthOfLongestSubstring(""));
        System.out.println(" lengthOfLongestSubstring Result: " + JHunterString.lengthOfLongestSubstring("aa"));

        System.out.println("\n ============================= longestPalindrome ========================================================");

        System.out.println("input: " + "JTKMJTJ" + " longestPalindromeV01 Result: " + JHunterString.longestPalindromeV01("JTKMJTJ"));
        System.out.println("input: " + "a" + " longestPalindromeV01 Result: " + JHunterString.longestPalindromeV01("a"));
        System.out.println("input: " + "aa" + " longestPalindromeV01 Result: " + JHunterString.longestPalindromeV01("aa"));
        System.out.println("input: " + "zz456456bwcbcebcweqweqqwqwbecaaaaaaa" + " longestPalindromeV01 Result: " + JHunterString.longestPalindromeV01("zz456456bwcbcebcweqweqqwqwbecaaaaaaa"));
        System.out.println("input: " + "xaabacxcabaaxcabaax" + " longestPalindromeV01 Result: " + JHunterString.longestPalindromeV01("xaabacxcabaaxcabaax"));
        System.out.println("input: " + "acawilli" + " longestPalindromeV01 Result: " + JHunterString.longestPalindromeV01("acawilli"));
        System.out.println("input: " + "aaabaaaa" + " longestPalindromeV01 Result: " + JHunterString.longestPalindromeV01("aaabaaaa"));
        System.out.println("input: " + "babad" + " longestPalindromeV01 Result: " + JHunterString.longestPalindromeV01("babad"));
        System.out.println("input: " + "babab" + " longestPalindromeV01 Result: " + JHunterString.longestPalindromeV01("babab"));
        System.out.println("input: " + "abaab" + " longestPalindromeV01 Result: " + JHunterString.longestPalindromeV01("abaab"));
        System.out.println("input: " + "aacabdkacaa" + " longestPalindromeV01 Result: " + JHunterString.longestPalindromeV01("aacabdkacaa"));

        System.out.println("\n ============================= zigzagPatternConvertor ========================================================");
        System.out.println("input: " + "A" + " zigzagPatternConvertor Result: " + JHunterString.zigzagPatternConvertor("A", 1));
        System.out.println("input: " + "ABCDEFGH" + " zigzagPatternConvertor Result: " + JHunterString.zigzagPatternConvertor("ABCDEFGH", 1));
        System.out.println("input: " + "ALGORITHMOFTHEDAY" + " zigzagPatternConvertor Result: " + JHunterString.zigzagPatternConvertor("ALGORITHMOFTHEDAY", 4));

        System.out.println("\n ============================= myAtoi ========================================================");
        System.out.println("input: " + "+1" + " myAtoi Result: " + JHunterString.myAtoi("+1"));
        System.out.println("input: " + "  - 123 abc " + " myAtoi Result: " + JHunterString.myAtoi("  - 123"));
        System.out.println("input: " + "  - 12+3 abc " + " myAtoi Result: " + JHunterString.myAtoi("  - 12+3"));
        System.out.println("input: " + "  - 12399999e9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999" + " myAtoi Result: " + JHunterString.myAtoi("  - 12399999e9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999"));
        System.out.println("input: " + "-2147483649" + " myAtoi Result: " + JHunterString.myAtoi("-2147483649"));
        System.out.println("input: " + "-91283472332" + " myAtoi Result: " + JHunterString.myAtoi("-91283472332"));
        System.out.println("input: " + "2147483649" + " myAtoi Result: " + JHunterString.myAtoi("2147483649"));

        System.out.println("\n ============================= matchRegex ========================================================");
        //System.out.println("input: " + "missi mis*" + " matchRegex Result: " + JHunterString.matchRegex("missi", "mis*"));

        System.out.println("\n ============================= integerToRoman ========================================================");
        System.out.println("input: " + "49" + " integerToRoman Result: " + JHunterString.integerToRoman(49));
        System.out.println("input: " + "1" + " integerToRoman Result: " + JHunterString.integerToRoman(1));
        System.out.println("input: " + "3999" + " integerToRoman Result: " + JHunterString.integerToRoman(3999));

        System.out.println("\n ============================= romanToInteger ========================================================");
        System.out.println("input: " + "XLIX --> 49" + " romanToInteger Result: " + JHunterString.romanToInteger("XLIX"));
        System.out.println("input: " + "I --> 1 " + " romanToInteger Result: " + JHunterString.romanToInteger("I"));
        System.out.println("input: " + " MMMCMXCIX --> 3999" + " romanToInteger Result: " + JHunterString.romanToInteger("MMMCMXCIX"));

        System.out.println("\n ============================= longestCommonPrefix ========================================================");
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("input: " + " longestCommonPrefix Result: " + JHunterString.longestCommonPrefix(strs));
        strs[0] = "qlower";
        System.out.println("input: " + " longestCommonPrefix Result: " + JHunterString.longestCommonPrefix(strs));

        System.out.println("\n ============================= letterCombinations ========================================================");
        System.out.println("input: 23" + " letterCombinations Result: " + JHunterString.letterCombinations("23"));

        System.out.println("\n ============================= Valid Parentheses ========================================================");
        System.out.println("input: {{}}[])( --> false" + " Valid Parentheses Result: " + JHunterString.isValid("{{}}[])("));
        System.out.println("input: {{}}[](()) --> true" + " Valid Parentheses Result: " + JHunterString.isValid("{{}}[](())"));

        System.out.println("\n ============================= longest Valid Parentheses ========================================================");
        System.out.println("input: (()) --> 6" + " longest Valid Parentheses Result: " + JHunterString.longestValidParentheses("(())"));
        System.out.println("input: (())())( --> 6" + " longest Valid Parentheses Result: " + JHunterString.longestValidParentheses("(())())("));
        System.out.println("input: (())())( --> 6" + " longest Valid Parentheses Result: " + JHunterString.longestValidParentheses("(((((()()()(())("));

        System.out.println("\n ============================= Wildcard Match ========================================================");
        System.out.println("input: (abcdt , a?*t ) --> true" + " longest Valid Parentheses Result: " + JHunterString.isWildcardMatch("abcdt", "a?*t"));
        System.out.println("input: (abcdt , a?*tt ) --> true" + " longest Valid Parentheses Result: " + JHunterString.isWildcardMatch("abcdt", "a?*tt"));
        System.out.println("input: (zacabz , *a?b* ) --> true" + " longest Valid Parentheses Result: " + JHunterString.isWildcardMatch("zacabz", "*a?b*"));

        System.out.println("\n ============================= Group Anagrams ========================================================");
        String[] groupAnagrams = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("input: (\"eat\",\"tea\",\"tan\",\"ate\",\"nat\",\"bat\" ) --> [[\"bat\"],[\"nat\",\"tan\"],[\"ate\",\"eat\",\"tea\"]]" + " groupAnagrams Result: " + JHunterString.groupAnagrams(groupAnagrams));

        System.out.println("\n ============================= last Word in a given string ========================================================");
        System.out.println("input: " + "\"this    \" --> this" + " lastWord Result: " + JHunterString.lastWord("this    "));
        System.out.println("input: " + "\" this is cat\" --> cat" + " lastWord Result: " + JHunterString.lastWord(" this is cat"));

        System.out.println("\n ============================= Simplify Path ========================================================");
        System.out.println("input: " + "\"/a/./b/../../c/\" --> \"/c\"" + " lastWord Result: " + JHunterString.simplifyPath("/a/./b/../../c/"));
        System.out.println("input: " + "\"/../a/../../\" --> \"/\"" + " lastWord Result: " + JHunterString.simplifyPath("/../a/../../"));
        System.out.println("input: " + "\"/../a/\" --> \"/\"" + " lastWord Result: " + JHunterString.simplifyPath("/../a/"));
        System.out.println("input: " + "\"/\"/home//foo/\"\" --> \"/home/foo\"" + " lastWord Result: " + JHunterString.simplifyPath("/home//foo/"));

        System.out.println("\n ============================= Minimum Window from a given string ========================================================");
        System.out.println("input: (akkkkabc , abc ) --> abc" + " longest Valid Parentheses Result: " + JHunterString.minWindow("akkkkabc", "abc"));

        System.out.println("\n ============================= minDistance ========================================================");
        System.out.println("input: (horse , ros ) --> 3" + " minDistance Result: " + JHunterString.minDistance("horse", "ros"));

        System.out.println("\n ============================= numDecodings ========================================================");
        System.out.println("input: (\"90\" ) --> 0" + " numDecodings Result: " + JHunterString.numDecodings("90"));
        System.out.println("input: (\"100\" ) --> 0" + " numDecodings Result: " + JHunterString.numDecodings("100"));
        System.out.println("input: (\"1\" ) --> 1" + " numDecodings Result: " + JHunterString.numDecodings("1"));
        System.out.println("input: (\"101\" ) --> 1" + " numDecodings Result: " + JHunterString.numDecodings("101"));
        System.out.println("input: (\"1010\" ) --> 2" + " numDecodings Result: " + JHunterString.numDecodings("2610"));
        System.out.println("input: (\"1212\" ) --> 5" + " numDecodings Result: " + JHunterString.numDecodings("1212"));

        System.out.println("\n ============================= restoreIpAddresses ========================================================");
        System.out.println("input: (\"19216911\" ) --> " + " restoreIpAddresses Result: " + RestoreIPAddresses93.restoreIpAddresses("19216911"));

    }
}
