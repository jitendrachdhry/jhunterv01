package com.jhunter;

import com.jhunter.jstring.dp.*;
import com.jhunter.fang.FANG2021;
import com.jhunter.fang.FANG2021DP;
import com.jhunter.jstring.random.*;
import com.jhunter.jstring.backtracking.RestoreIPAddresses93;
import com.jhunter.jstring.slidingwindow.MinimumWindowSubstring76;
import com.jhunter.jstring.slidingwindow.LongestPalindromicSubstring5;
import com.jhunter.jstring.backtracking.LetterCombinationsOfPhoneNumber17;
import com.jhunter.jstring.charcount.AdditionOfTwoStringEqualToGivenString;
import com.jhunter.jstring.backtracking.GenerateCombinationsOfWellFormedParentheses22;

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

        System.out.println("\nlengthOfLongestSubstring ========================================================");
        System.out.println(" input: (\"tmmzuxt\" ) --> 5 lengthOfLongestSubstring Result: " + LongestSubstringWithoutRepeatingCharacters3.lengthOfLongestSubstring("tmmzuxt"));
        System.out.println(" input: (\"abcabcbbefgh\" ) --> 5 lengthOfLongestSubstring Result: " + LongestSubstringWithoutRepeatingCharacters3.lengthOfLongestSubstring("abcabcbbefgh"));
        System.out.println(" input: (\"gabcabeda\" ) --> 5 lengthOfLongestSubstring Result: " + LongestSubstringWithoutRepeatingCharacters3.lengthOfLongestSubstring("gabcabeda"));
        System.out.println(" input: (\"\" ) --> 0 lengthOfLongestSubstring Result: " + LongestSubstringWithoutRepeatingCharacters3.lengthOfLongestSubstring(""));
        System.out.println(" input: (\"aa\" ) --> 1 lengthOfLongestSubstring Result: " + LongestSubstringWithoutRepeatingCharacters3.lengthOfLongestSubstring("aa"));

        System.out.println("\n ============================= longestPalindrome ========================================================");
        System.out.println("input: " + "JTKMJTJ" + " longestPalindromeV01 Result: " + LongestPalindromicSubstring5.longestPalindromeV01("JTKMJTJ"));
        System.out.println("input: " + "a" + " longestPalindromeV01 Result: " + LongestPalindromicSubstring5.longestPalindromeV01("a"));
        System.out.println("input: " + "aa" + " longestPalindromeV01 Result: " + LongestPalindromicSubstring5.longestPalindromeV01("aa"));
        System.out.println("input: " + "zz456456bwcbcebcweqweqqwqwbecaaaaaaa" + " longestPalindromeV01 Result: " + LongestPalindromicSubstring5.longestPalindromeV01("zz456456bwcbcebcweqweqqwqwbecaaaaaaa"));
        System.out.println("input: " + "xaabacxcabaaxcabaax" + " longestPalindromeV01 Result: " + LongestPalindromicSubstring5.longestPalindromeV01("xaabacxcabaaxcabaax"));
        System.out.println("input: " + "acawilli" + " longestPalindromeV01 Result: " + LongestPalindromicSubstring5.longestPalindromeV01("acawilli"));
        System.out.println("input: " + "aaabaaaa" + " longestPalindromeV01 Result: " + LongestPalindromicSubstring5.longestPalindromeV01("aaabaaaa"));
        System.out.println("input: " + "babad" + " longestPalindromeV01 Result: " + LongestPalindromicSubstring5.longestPalindromeV01("babad"));
        System.out.println("input: " + "babab" + " longestPalindromeV01 Result: " + LongestPalindromicSubstring5.longestPalindromeV01("babab"));
        System.out.println("input: " + "abaab" + " longestPalindromeV01 Result: " + LongestPalindromicSubstring5.longestPalindromeV01("abaab"));
        System.out.println("input: " + "aacabdkacaa" + " longestPalindromeV01 Result: " + LongestPalindromicSubstring5.longestPalindromeV01("aacabdkacaa"));

        System.out.println("\n ============================= zigzagPatternConvertor ========================================================");
        System.out.println("input: " + "A" + " zigzagPatternConvertor Result: " + ZigzagConversion6.zigzagPatternConvertor("A", 1));
        System.out.println("input: " + "ABCDEFGH" + " zigzagPatternConvertor Result: " + ZigzagConversion6.zigzagPatternConvertor("ABCDEFGH", 1));
        System.out.println("input: " + "ALGORITHMOFTHEDAY" + " zigzagPatternConvertor Result: " + ZigzagConversion6.zigzagPatternConvertor("ALGORITHMOFTHEDAY", 4));

        System.out.println("\n ============================= myAtoi ========================================================");
        System.out.println("input: " + "+1" + " myAtoi Result: " + String2Integer8.myAtoi("+1"));
        System.out.println("input: " + "  - 123 abc " + " myAtoi Result: " + String2Integer8.myAtoi("  - 123"));
        System.out.println("input: " + "  - 12+3 abc " + " myAtoi Result: " + String2Integer8.myAtoi("  - 12+3"));
        System.out.println("input: " + "  - 12399999e9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999" + " myAtoi Result: " + String2Integer8.myAtoi("  - 12399999e9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999"));
        System.out.println("input: " + "-2147483649" + " myAtoi Result: " + String2Integer8.myAtoi("-2147483649"));
        System.out.println("input: " + "-91283472332" + " myAtoi Result: " + String2Integer8.myAtoi("-91283472332"));
        System.out.println("input: " + "2147483649" + " myAtoi Result: " + String2Integer8.myAtoi("2147483649"));

        System.out.println("\n ============================= matchRegex ========================================================");
        System.out.println("input: " + "missi mis*" + " matchRegex Result: " + RegularExpressionMatching10.matchRegex("missi", "mis*"));

        System.out.println("\n ============================= integerToRoman ========================================================");
        System.out.println("input: " + "49" + " integerToRoman Result: " + Integer2Roman12.integerToRoman(49));
        System.out.println("input: " + "1" + " integerToRoman Result: " + Integer2Roman12.integerToRoman(1));
        System.out.println("input: " + "3999" + " integerToRoman Result: " + Integer2Roman12.integerToRoman(3999));

        System.out.println("\n ============================= romanToInteger ========================================================");
        System.out.println("input: " + "XLIX --> 49" + " romanToInteger Result: " + Roman2Integer13.romanToInteger("XLIX"));
        System.out.println("input: " + "I --> 1 " + " romanToInteger Result: " + Roman2Integer13.romanToInteger("I"));
        System.out.println("input: " + " MMMCMXCIX --> 3999" + " romanToInteger Result: " + Roman2Integer13.romanToInteger("MMMCMXCIX"));

        System.out.println("\n ============================= longestCommonPrefix ========================================================");
        String[] strs = {"flower", "flow", "flight"};
        System.out.println("input: " + " longestCommonPrefix Result: " + LongestCommonPrefixString14.longestCommonPrefix(strs));
        strs[0] = "qlower";
        System.out.println("input: " + " longestCommonPrefix Result: " + LongestCommonPrefixString14.longestCommonPrefix(strs));

        System.out.println("\n ============================= letterCombinations ========================================================");
        System.out.println("input: 23" + " letterCombinations Result: " + LetterCombinationsOfPhoneNumber17.letterCombinations("23"));

        System.out.println("\n ============================= generateParenthesis ========================================================");
        System.out.println("input: 3  --> \"5\"" + " GenerateCombinationsOfWellFormedParentheses22 Result: " + GenerateCombinationsOfWellFormedParentheses22.generateParenthesis(3));
        System.out.println("input: 2  --> \"2\"" + " GenerateCombinationsOfWellFormedParentheses22 Result: " + GenerateCombinationsOfWellFormedParentheses22.generateParenthesis(2));

        System.out.println("\n ============================= Valid Parentheses ========================================================");
        System.out.println("input: {{}}[])( --> false" + " Valid Parentheses Result: " + ValidParentheses20.isValid("{{}}[])("));
        System.out.println("input: {{}}[](()) --> true" + " Valid Parentheses Result: " + ValidParentheses20.isValid("{{}}[](())"));

        System.out.println("\n ============================= longest Valid Parentheses ========================================================");
        System.out.println("input: (()) --> 6" + " longest Valid Parentheses Result: " + LongestValidParenthesesSubstring32.longestValidParentheses("(())"));
        System.out.println("input: (())())( --> 6" + " longest Valid Parentheses Result: " + LongestValidParenthesesSubstring32.longestValidParentheses("(())())("));
        System.out.println("input: (())())( --> 6" + " longest Valid Parentheses Result: " + LongestValidParenthesesSubstring32.longestValidParentheses("(((((()()()(())("));

        System.out.println("\n ============================= Wildcard Match ========================================================");
        System.out.println("input: (abcdt , a?*t ) --> true" + " longest Valid Parentheses Result: " + WildcardPatternMatching44.isWildcardMatch("abcdt", "a?*t"));
        System.out.println("input: (abcdt , a?*tt ) --> true" + " longest Valid Parentheses Result: " + WildcardPatternMatching44.isWildcardMatch("abcdt", "a?*tt"));
        System.out.println("input: (zacabz , *a?b* ) --> true" + " longest Valid Parentheses Result: " + WildcardPatternMatching44.isWildcardMatch("zacabz", "*a?b*"));

        System.out.println("\n ============================= Group Anagrams ========================================================");
        String[] groupAnagrams = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("input: (\"eat\",\"tea\",\"tan\",\"ate\",\"nat\",\"bat\" ) --> [[\"bat\"],[\"nat\",\"tan\"],[\"ate\",\"eat\",\"tea\"]]" + " groupAnagrams Result: " + GroupTheAnagrams49.groupAnagrams(groupAnagrams));

        System.out.println("\n ============================= last Word in a given string ========================================================");
        System.out.println("input: " + "\"this    \" --> this" + " lastWord Result: " + LengthOfLastWord58.lastWord("this    "));
        System.out.println("input: " + "\" this is cat\" --> cat" + " lastWord Result: " + LengthOfLastWord58.lastWord(" this is cat"));

        System.out.println("\n ============================= Simplify Path ========================================================");
        System.out.println("input: " + "\"/a/./b/../../c/\" --> \"/c\"" + " lastWord Result: " + SimplifyPath71.simplifyPath("/a/./b/../../c/"));
        System.out.println("input: " + "\"/../a/../../\" --> \"/\"" + " lastWord Result: " + SimplifyPath71.simplifyPath("/../a/../../"));
        System.out.println("input: " + "\"/../a/\" --> \"/\"" + " lastWord Result: " + SimplifyPath71.simplifyPath("/../a/"));
        System.out.println("input: " + "\"/\"/home//foo/\"\" --> \"/home/foo\"" + " lastWord Result: " + SimplifyPath71.simplifyPath("/home//foo/"));

        System.out.println("\n ============================= Minimum Window from a given string ========================================================");
        System.out.println("input: (akkkkabc , abc ) --> abc" + " longest Valid Parentheses Result: " + MinimumWindowSubstring76.minWindow("akkkkabc", "abc"));

        System.out.println("\n ============================= minDistance ========================================================");
        System.out.println("input: (horse , ros ) --> 3" + " minDistance Result: " + ConvertWord1ToWord72.minDistance("horse", "ros"));

        System.out.println("\n ============================= numDecodings ========================================================");
        System.out.println("input: (\"90\" ) --> 0" + " numDecodings Result: " + DecodeWays91.numDecodings("90"));
        System.out.println("input: (\"100\" ) --> 0" + " numDecodings Result: " + DecodeWays91.numDecodings("100"));
        System.out.println("input: (\"1\" ) --> 1" + " numDecodings Result: " + DecodeWays91.numDecodings("1"));
        System.out.println("input: (\"101\" ) --> 1" + " numDecodings Result: " + DecodeWays91.numDecodings("101"));
        System.out.println("input: (\"1010\" ) --> 2" + " numDecodings Result: " + DecodeWays91.numDecodings("2610"));
        System.out.println("input: (\"1212\" ) --> 5" + " numDecodings Result: " + DecodeWays91.numDecodings("1212"));

        System.out.println("\n ============================= restoreIpAddresses ========================================================");
        System.out.println("input: (\"19216911\" ) --> " + " restoreIpAddresses Result: " + RestoreIPAddresses93.restoreIpAddresses("19216911"));

        System.out.println("\n ============================= isAddintionOfStringEqualToGivenString ========================================================");
        System.out.println("input: ( \"\", \"\", \"\" ) --> true" + " isAddintionOfStringEqualToGivenString Result: " + AdditionOfTwoStringEqualToGivenString.isAddintionOfStringEqualToGivenString("", "", ""));
        System.out.println("input: ( \"abce\", \"dfgh\", \"abcdefgh\" ) --> true" + " isAddintionOfStringEqualToGivenString Result: " + AdditionOfTwoStringEqualToGivenString.isAddintionOfStringEqualToGivenString("abce", "dfgh", "abcdefgh"));
        System.out.println("input: ( \"ab\", \"dfgh\", \"abcdefgh\" ) --> false" + " isAddintionOfStringEqualToGivenString Result: " + AdditionOfTwoStringEqualToGivenString.isAddintionOfStringEqualToGivenString("ab", "dfgh", "abcdefgh"));

        System.out.println("\n ============================= isAddintionOfStringEqualToGivenString ========================================================");
        System.out.println("input: ( \"\", \"\", \"\" ) --> true" + " isAddintionOfStringEqualToGivenString Result: " + InterleavingString97.isInterleave("", "", ""));
        System.out.println("input: ( \"aab\", \"axy\", \"aaxaby\" ) --> true" + " isAddintionOfStringEqualToGivenString Result: " + InterleavingString97.isInterleave("aab", "axy", "aaxaby"));
        System.out.println("input: ( \"aby\", \"xaa\", \"aaxaby\" ) --> false" + " isAddintionOfStringEqualToGivenString Result: " + InterleavingString97.isInterleave("aby", "xaa", "aaxaby"));

        System.out.println("\n ============================= isAddintionOfStringEqualToGivenString ========================================================");
        System.out.println("input: ( \"\", \"\" ) --> 1" + " DistinctSubsequences Result: " + DistinctSubsequences115.numDistinct("", ""));
        System.out.println("input: ( \"rabbbit\", \"rabbit\" ) --> 3" + " DistinctSubsequences Result: " + DistinctSubsequences115.numDistinct("rabbbit", "rabbit"));
        System.out.println("input: ( \"bagbag\", \"bag\" ) --> 3" + " DistinctSubsequences Result: " + DistinctSubsequences115.numDistinct("bagbag", "bag"));

        System.out.println("\n ============================= isPalindrome ========================================================");
        System.out.println("input: ( \"A man, a plan, a canal: Panama\" ) --> true" + " isPalindrome Result: " + ValidPalindrome125.isPalindrome("A man, a plan, a canal: Panama"));


        System.out.println("\n ============================= FractionToRecurringDecimal ========================================================");
        //System.out.println("input: ( \"4\" , \"333\") --> \"0.(012)\"" + " FractionToRecurringDecimal Result: " + FractionToRecurringDecimal.fractionToDecimal(4, 333));

        System.out.println("\n ============================= ReverseWordsInAString151 ========================================================");
        System.out.println("input: ( \"  the sky is      blue    \") --> \"blue is sky the\"" + " FractionToRecurringDecimal Result: \"" + ReverseWordsInAString151.reverseWords("  the sky is      blue    ") + "\"");
        System.out.println("input: ( \"the\") --> \"the\"" + " FractionToRecurringDecimal Result: " + ReverseWordsInAString151.reverseWords("the"));


    }
}
