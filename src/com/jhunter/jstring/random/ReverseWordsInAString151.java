package com.jhunter.jstring.random;

public class ReverseWordsInAString151 {

    /*
        Given an input string s, reverse the order of the words.
        A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
        Return a string of the words in reverse order concatenated by a single space.
        Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.

        Example 1:

        Input: s = "the sky is blue"
        Output: "blue is sky the"
        Example 2:

        Input: s = "  hello world  "
        Output: "world hello"
        Explanation: Your reversed string should not contain leading or trailing spaces.
        Example 3:

        Input: s = "a good   example"
        Output: "example good a"
        Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.

        Constraints:
        1 <= s.length <= 104
        s contains English letters (upper-case and lower-case), digits, and spaces ' '.
        There is at least one word in s.

        Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?
     */
    public static String reverseWords(String s) {
        if (s == null || s.length() == 0 || s.indexOf(" ") < 0)
            return s;
        char[] arr = s.toCharArray();
        // 1. Reverse the string first
        reverse(arr, 0, s.length());

        int wordStartIdx = 0;
        // 2. find word by searching for a space and reverse the word.
        for (int i = 0; i < s.length(); i++) {
            // skip if we have duplicate ' '
            if (arr[i] == ' ' && wordStartIdx == i) {
                wordStartIdx = i + 1;
                continue;
            } else if (arr[i] == ' ' || i == s.length() - 1) { // reverse the word.
                if (i == (s.length() - 1)) {
                    reverse(arr, wordStartIdx, i + 1);
                } else {
                    reverse(arr, wordStartIdx, i);
                }
                wordStartIdx = i + 1;
            }
        }

        // 3. remove duplicate ' '
        int writeIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ' && writeIdx != 0 && arr[writeIdx - 1] != ' ') {
                arr[writeIdx++] = ' ';
            } else if (arr[i] != ' ') {
                arr[writeIdx++] = arr[i];
            }
        }

        // 4. Check for extra trailing space.
        if (arr[writeIdx - 1] == ' ') {
            writeIdx -= 1;
        }

        // 5. Return final staring starting from zero index to end of writeIdx.
        return String.copyValueOf(arr, 0, writeIdx);
    }

    public static void reverse(char[] arr, int startIdx, int endIdx) {
        int halfLength = (endIdx - startIdx) / 2;

        for (int i = 0; i < halfLength; i++) {
            int startId = startIdx + i;
            char temp = arr[startId];
            arr[startId] = arr[endIdx - 1 - i];
            arr[endIdx - 1 - i] = temp;
        }
    }
}
