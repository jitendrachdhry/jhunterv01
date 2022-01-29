package com.jhunter.main;

import com.jhunter.fang.FANG2021;
import com.jhunter.fang.FANG2021DP;
import com.jhunter.jstring.backtracking.GenerateCombinationsOfWellFormedParentheses22;
import com.jhunter.jstring.backtracking.LetterCombinationsOfPhoneNumber17;
import com.jhunter.jstring.backtracking.RestoreIPAddresses93;
import com.jhunter.jstring.charcount.AdditionOfTwoStringEqualToGivenString;
import com.jhunter.jstring.dp.*;
import com.jhunter.jstring.random.*;
import com.jhunter.jstring.slidingwindow.LongestPalindromicSubstring5;
import com.jhunter.jstring.slidingwindow.MinimumWindowSubstring76;
import com.jhunter.tree.binarytree.*;
import com.jhunter.tree.binarytree.array.ConstructBinaryTreeFromGivenParentArrayRepresentation;
import com.jhunter.tree.binarytree.cousins.NodesAreCousinsOfEachOther;
import com.jhunter.tree.binarytree.cousins.PrintCousinsOfAGivenNodeInBinaryTree;
import com.jhunter.tree.binarytree.subtree.IdenticalBinaryTree;
import com.jhunter.tree.binarytree.sumtree.ConvertBinaryTreeToItsSumTree;
import com.jhunter.tree.binarytree.sumtree.IsItSumTree;
import com.jhunter.tree.binarytree.treetraversal.*;

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

        System.out.println("\n ============================= BinaryTreeSolution ========================================================");
        BinaryTreeSolution btSolution = new BinaryTreeSolution(new int[]{6, 8, 9, 10, 15, 20, 30});
        System.out.println("getTreeWayPreOrder : " + DFS.getTreeWayPreOrder(btSolution.getBinaryTreeRoot()));
        System.out.println("preOrderUsingStack : " + DFS.preOrderUsingStack(btSolution.getBinaryTreeRoot()));

        System.out.println("getTreeWayPostOrder : " + DFS.getTreeWayPostOrder(btSolution.getBinaryTreeRoot()));
        System.out.println("postOrderUsingStack : " + DFS.postOrderUsingStack(btSolution.getBinaryTreeRoot()));

        System.out.println("getTreeWayInOrder : " + DFS.getTreeWayInOrder(btSolution.getBinaryTreeRoot()));
        System.out.println("inOrderUsingStack : " + DFS.inOrderUsingStack(btSolution.getBinaryTreeRoot()));

        TreeNode rootbfs = new TreeNode(3);
        rootbfs.right = new TreeNode(20);
        rootbfs.right.left = new TreeNode(15);
        rootbfs.right.right = new TreeNode(7);
        rootbfs.right.right.right = new TreeNode(70);
        rootbfs.right.right.right.right = new TreeNode(700);
        /*
        Example 1:
            3
          /  \
         9   20
            /  \
           15  7
                \
                70
         */
        System.out.println("BFS levelOrderTraverse : " + BFS.levelOrderTraverse(rootbfs));
        System.out.println("BFS levelOrderTraverse : " + BFS.levelOrderTraverseNonRecursive(rootbfs));

        System.out.println("BinaryTreePaths257.getBinaryTreePaths: " + BinaryTreePaths257.getBinaryTreePaths(rootbfs));
        System.out.println("Ancestors.findAncestorsHistory: " + Ancestors.findAncestorsHistory(rootbfs, 7));
        System.out.println("Ancestors.findAncestorsHistory: " + Ancestors.findAncestorsHistory(btSolution.getBinaryTreeRoot(), 30));
        //System.out.println("AllNodesDistanceKInBinaryTree Result[70] : " + AllNodesDistanceKInBinaryTree.findAllNodesDistanceKInBinaryTree(rootbfs, 20, 2));
        rootbfs.left = new TreeNode(9);
        rootbfs.left.right = new TreeNode(99);
        rootbfs.left.right.right = new TreeNode(999);
        rootbfs.left.left = new TreeNode(9999);
               /*
        Example 1:
                  3
              /      \
             9       20
           /  \      /  \
        9999  99    15  7
               \        \
              999       70
                          \
                          700
         */
        System.out.println("AllNodesDistanceKInBinaryTree Input[99, 1] Result[9, 999] : " + AllNodesDistanceKInBinaryTree.findAllNodesDistanceKInBinaryTree(rootbfs, rootbfs.left.right, 1));
        System.out.println("AllNodesDistanceKInBinaryTree Input[999, 3] Result[9999, 3] : " + AllNodesDistanceKInBinaryTree.findAllNodesDistanceKInBinaryTree(rootbfs, rootbfs.left.right.right, 3));
        System.out.println("AllNodesDistanceKInBinaryTree Input[9, 3] Result[15,7] : " + AllNodesDistanceKInBinaryTree.findAllNodesDistanceKInBinaryTree(rootbfs, rootbfs.left, 3));
        System.out.println("AllNodesDistanceKInBinaryTree Input[9, 2] Result[999, 20] : " + AllNodesDistanceKInBinaryTree.findAllNodesDistanceKInBinaryTree(rootbfs, rootbfs.left, 2));
        System.out.println("AllNodesDistanceKInBinaryTree Input[3, 2] Result[9999, 99, 15, 7] : " + AllNodesDistanceKInBinaryTree.findAllNodesDistanceKInBinaryTree(rootbfs, rootbfs, 2));
        System.out.println("DistanceBetweenGivenPairsOfNodesInABinaryTree (result: 3): " + DistanceBetweenGivenPairsOfNodesInABinaryTree.findDistanceBetweenGivenPairsOfNodesInABinaryTree(rootbfs, 9, 7));
        System.out.println("TruncateABinaryTreeHavingSumLessThanK: " + TruncateABinaryTreeHavingSumLessThanK.truncateABinaryTreeHavingSumLessThanK(rootbfs, 100));

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        root.left.left.right = new TreeNode(10);
        root.left.right.left = new TreeNode(11);
        root.right.left.left = new TreeNode(12);
        root.right.left.right = new TreeNode(7);

        /*
                               1
                          2         3
                      9      6    4   5
                      10   11   12 7
                      22: 1 + 2 + 9 + 10
         */
        System.out.println("PrintAllPathsFromLeaf2RootNode: ");
        PrintAllPathsFromLeaf2RootNode.printAllPathsFromLeaf2RootNode(root);

        System.out.println("findDiagonalSumOfABinaryTree output[9, 19, 42]: " + DiagonalSumOfABinaryTree.findDiagonalSumOfABinaryTree(root));
        System.out.println("findDiagonalSumOfABinaryTree output[9, 19, 42]: " + DiagonalSumOfABinaryTree.findDiagonalSumOfABinaryTreeNonRecursive(root));
        System.out.println("FindMaximumSumRootToLeafPathInABinaryTree Output[22: 1 + 2 + 9 + 10]: " + FindMaximumSumRootToLeafPathInABinaryTree.findMaximumSumRootToLeafPathInABinaryTree(root));
        root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        /*
                -10
               /   \
              9    20
                 /   \
                15   7
         */
        System.out.println("BinaryTreeMaximumPathSum125 output [15 -> 20 -> 7 : 42] : " + BinaryTreeMaximumPathSum125.maxPathSum(root));
        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.left.left = new TreeNode(8);
        root.right.left.right = new TreeNode(9);

        System.out.println("findDiagonalSumOfABinaryTree output[11,8,13,13]: " + DiagonalSumOfABinaryTree.findDiagonalSumOfABinaryTree(root));
        System.out.println("PrintBottomViewOfBinaryTree [6,8,9,10,15,20,30]: " + PrintBottomViewOfBinaryTree.getBottomViewOfBinaryTree(btSolution.getBinaryTreeRoot()));
        System.out.println("PrintBottomViewOfBinaryTree [7, 5, 8, 6]: " + PrintBottomViewOfBinaryTree.getBottomViewOfBinaryTree(root));
        System.out.println("PrintTopViewOfBinaryTree [2, 1, 3, 6]: " + PrintTopViewOfBinaryTree.getTopViewOfBinaryTree(root));
        System.out.println("NodesAreCousinsOfEachOther (4, 5) false : " + NodesAreCousinsOfEachOther.isNodesAreCousinsOfEachOther(root, 4, 5));
        System.out.println("NodesAreCousinsOfEachOther (4, 6) true : " + NodesAreCousinsOfEachOther.isNodesAreCousinsOfEachOther(root, 4, 6));
        System.out.println("PrintCousinsOfAGivenNodeInBinaryTree [6, 7]: " + PrintCousinsOfAGivenNodeInBinaryTree.getCousinsOfAGivenNodeInBinaryTree(root, 5));
        System.out.println(" ConvertBinaryTreeToItsSumTree - DONE");
        ConvertBinaryTreeToItsSumTree.convertBinaryTreeToItsSumTree(root);


        TreeNode root01 = new TreeNode(44);
        root01.left = new TreeNode(9);
        root01.right = new TreeNode(13);
        root01.left.left = new TreeNode(4);
        root01.left.right = new TreeNode(5);
        root01.right.left = new TreeNode(6);
        root01.right.right = new TreeNode(7);
        System.out.println("IsItSumTree (true): " + IsItSumTree.isItSumTree(root01));
        root01.left = new TreeNode(900);
        System.out.println("IsItSumTree (false): " + IsItSumTree.isItSumTree(root01));
        System.out.println(" ConvertBinaryTreeToItsMirror DONE");
        ConvertBinaryTreeToItsMirror.convertBinaryTreeToItsMirror(root01);
        System.out.println("\n ============================= IdenticalBinaryTree ========================================================");
        // construct the first tree
        TreeNode treeNodeX = new TreeNode(15);
        treeNodeX.left = new TreeNode(10);
        treeNodeX.right = new TreeNode(20);
        treeNodeX.left.left = new TreeNode(8);
        treeNodeX.left.right = new TreeNode(12);
        treeNodeX.right.left = new TreeNode(16);
        treeNodeX.right.right = new TreeNode(25);

        // construct the second tree
        TreeNode treeNodeY = new TreeNode(15);
        treeNodeY.left = new TreeNode(10);
        treeNodeY.right = new TreeNode(20);
        treeNodeY.left.left = new TreeNode(8);
        treeNodeY.left.right = new TreeNode(12);
        treeNodeY.right.left = new TreeNode(16);
        treeNodeY.right.right = new TreeNode(25);
        /*
                 15
              /     \
            10       20
          /  \     /   \
        8    12   16   25
                       /
                      100
                        \
                        500
                                 */
        System.out.println("isIdentical : " + IdenticalBinaryTree.isIdentical(treeNodeX, treeNodeY));
        System.out.println("Construct Binary Tree from Parent Array");
        ConstructBinaryTreeFromGivenParentArrayRepresentation.constructBinaryTreeFromGivenParentArrayRepresentation(new int[]{1, 5, 5, 2, 2, -1, 3});
        treeNodeY.right.right.left = new TreeNode(100);
        treeNodeY.right.right.left.right = new TreeNode(500);
        System.out.println("FindAllNodesAtAGivenDistanceFromLeafNodes output[2 -> 15, 25]: " + FindAllNodesAtAGivenDistanceFromLeafNodes.findAllNodesAtAGivenDistanceFromLeafNodes(treeNodeY, 2));
        System.out.println("FindAllNodesAtAGivenDistanceFromLeafNodes output[1 -> 10, 20, 100]: " + FindAllNodesAtAGivenDistanceFromLeafNodes.findAllNodesAtAGivenDistanceFromLeafNodes(treeNodeY, 1));
        System.out.println("FindAllNodesAtAGivenDistanceFromLeafNodes output[3 -> 20]: " + FindAllNodesAtAGivenDistanceFromLeafNodes.findAllNodesAtAGivenDistanceFromLeafNodes(treeNodeY, 3));

        treeNodeY = new TreeNode(1);
        treeNodeY.left = new TreeNode(2);
        treeNodeY.right = new TreeNode(3);
        treeNodeY.left.left = new TreeNode(4);
        treeNodeY.left.left.left = new TreeNode(4);
        treeNodeY.right.left = new TreeNode(5);
        treeNodeY.right.left.left = new TreeNode(5);
        treeNodeY.right.left.right = new TreeNode(5);
        treeNodeY.right.right = new TreeNode(6);
        treeNodeY.right.right.right = new TreeNode(7);
        //System.out.println("CountUnivalueSubtrees output[6]: " + CountUnivalueSubtrees.getCountOfUnivalueSubtrees(treeNodeY));

        /*
                1
              /   \
             1    1
           /  \    \
          5   5    5
         */
        treeNodeY = new TreeNode(1);
        treeNodeY.left = new TreeNode(1);
        treeNodeY.right = new TreeNode(1);
        treeNodeY.left.left = new TreeNode(5);
        treeNodeY.left.right = new TreeNode(5);
        treeNodeY.right.right = new TreeNode(5);
        System.out.println("CountUnivalueSubtrees output[3]: " + CountUnivalueSubtrees.getCountOfUnivalueSubtrees(treeNodeY));

        treeNodeY = new TreeNode(5);
        treeNodeY.left = new TreeNode(1);
        treeNodeY.right = new TreeNode(5);
        treeNodeY.left.left = new TreeNode(5);
        treeNodeY.left.right = new TreeNode(5);
        treeNodeY.right.right = new TreeNode(5);
        System.out.println("CountUnivalueSubtrees output[4]: " + CountUnivalueSubtrees.getCountOfUnivalueSubtrees(treeNodeY));
        treeNodeY.right.right.right = new TreeNode(5);
        treeNodeY.right.right.right.right = new TreeNode(5);
        System.out.println("CountUnivalueSubtrees output[6]: " + CountUnivalueSubtrees.getCountOfUnivalueSubtrees(treeNodeY));

        treeNodeY = new TreeNode(6);
        treeNodeY.left = new TreeNode(3);
        treeNodeY.right = new TreeNode(8);
        treeNodeY.right.left = new TreeNode(2);
        treeNodeY.right.right = new TreeNode(4);
        treeNodeY.right.left.left = new TreeNode(1);
        treeNodeY.right.left.right = new TreeNode(7);
        /* Construct the following tree
              6
            /   \
           /     \
          3       8
                /   \
               /     \
              2       4
            /   \
           /     \
          1       7
        */
        System.out.println("MaximumDifferenceBetweenANodeAndItsDescendants output[ (8 - 1) = 7]: " + MaximumDifferenceBetweenANodeAndItsDescendants.findMaximumDifferenceBetweenANodeAndItsDescendants(treeNodeY));
        System.out.println("MaximumSumPathBetweenTwoLeaves output[ 3->6->8->2->7 = 26]: " + MaximumSumPathBetweenTwoLeaves.getMaximumSumPathBetweenTwoLeaves(treeNodeY));

    }
}
