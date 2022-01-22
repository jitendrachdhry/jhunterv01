package com.jhunter.jstring.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateCombinationsOfWellFormedParentheses22 {
    /*
        https://leetcode.com/problems/generate-parentheses/
        Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
        Example 1:
        Input: n = 3
        Output: ["((()))","(()())","(())()","()(())","()()()"]

        Example 2:
        Input: n = 1
        Output: ["()"]
    */
    public static List<String> generateParenthesis(int n) {
        List<String> result_output = new ArrayList<String>();
        backtrace(result_output, "", 0, 0, n);
        return result_output;
    }

    public static void backtrace(List<String> result_array, String current_string, int open, int close, int max) {
        if (current_string.length() == max * 2) { // base case
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
}
