package com.jhunter.jstring.random;

public class ValidPalindrome125 {
    /*
        A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
        Given a string s, return true if it is a palindrome, or false otherwise.

        Example 1:
        Input: s = "A man, a plan, a canal: Panama"
        Output: true
        Explanation: "amanaplanacanalpanama" is a palindrome.

        Example 2:
        Input: s = "race a car"
        Output: false
        Explanation: "raceacar" is not a palindrome.

        Example 3:
        Input: s = " "
        Output: true
        Explanation: s is an empty string "" after removing non-alphanumeric characters.
        Since an empty string reads the same forward and backward, it is a palindrome.

        Constraints:
        1 <= s.length <= 2 * 105
        s consists only of printable ASCII characters.
     */
    public static boolean isPalindrome(String s) {
        if (s == null || s.length() <= 0) {
            return false;
        }
        int length = s.length();
        int j = length - 1;
        for (int i = 0; i <= j; ) {
            if (!Character.isLetterOrDigit(s.charAt(i))) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(j))) {
                j--;
                continue;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            } else if (i == j || (j - i) == 1) {
                return true;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
