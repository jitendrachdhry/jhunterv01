package com.jhunter.jstring.random;

import java.util.Stack;

public class LongestValidParenthesesSubstring32 {
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
}
