package com.jhunter.jstring.random;

import java.util.Stack;

public class ValidParentheses20 {
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
        return stack.isEmpty();
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
}
