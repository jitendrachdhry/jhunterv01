package com.jhunter;

import com.jhunter.fang.FANG2021;
import com.jhunter.fang.FANG2021DP;
import com.jhunter.JHunterString.JHunterString;
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
        int[] dp = { 1, -2, 4, -5, 2, 0};
        AtomicInteger startIdx = new AtomicInteger(0), endIdx = new AtomicInteger(0);
        FANG2021DP.addTwoStringNumberCompareWithOutputStringNumber(dp, startIdx, endIdx);

        int[] arrInput = {0,2,1,2,4,5};
        // int[] arrInput = {0,2,1,-2,4,5};

        int target = 7;
        FANG2021DP.addTwoStringNumberCompareWithOutputStringNumber(arrInput, target);

        System.out.println("\n ============================= FindTheLongestIncreasingSubsequence ========================================================");
        FANG2021DP.FindTheLongestIncreasingSubsequence(new int[] { -1, 3, 4, 5, 2, 2, 2, 2 });
        System.out.println("\n ============================= FindTheLongestNonDecreasingSubsequence ========================================================");
        FANG2021DP.FindTheLongestNonDecreasingSubsequence(new int[] { -1, 3, 4, 5, 2, 2, 2, 2 });
        System.out.println("\n ============================= FindTheLongestDecreasingSubsequence ========================================================");
        FANG2021DP.FindTheLongestDecreasingSubsequence(new int[] { -1, 3, 4, 5, 2, 2, 2, 2 });

        System.out.println("\n ============================= lengthOfLongestSubstring ========================================================");
        // System.out.println(" lengthOfLongestSubstring Result: " + JHunterString.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(" lengthOfLongestSubstring Result: " + JHunterString.lengthOfLongestSubstring("tmmzuxt"));
        System.out.println(" lengthOfLongestSubstring Result: " + JHunterString.lengthOfLongestSubstring("abcabcbbefgh"));
        System.out.println(" lengthOfLongestSubstring Result: " + JHunterString.lengthOfLongestSubstring("gabcabeda"));
        System.out.println(" lengthOfLongestSubstring Result: " + JHunterString.lengthOfLongestSubstring(""));
        System.out.println(" lengthOfLongestSubstring Result: " + JHunterString.lengthOfLongestSubstring("aa"));

        System.out.println("\n ============================= longestPalindrome ========================================================");

        System.out.println("input: " + "JTKMJTJ" + " longestPalindromeV01 Result: " + JHunterString.longestPalindromeV01("JTKMJTJ") );
        System.out.println("input: " + "a" + " longestPalindromeV01 Result: " + JHunterString.longestPalindromeV01("a") );
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
    }
}
