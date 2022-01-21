package com.jhunter.jstring.random;

public class ZigzagConversion6 {
    /*
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows.
 * Complexity Analysis
    Time Complexity: O(n), where n == len(s)
    Space Complexity: O(n)
 */
    static public String zigzagPatternConvertor(String s, int numRows) {
        int inputStringLength = s.length();
        if (s == null || inputStringLength < 1 || numRows < 1) {
            return "";
        } else if (inputStringLength == 1 || numRows == 1) {
            return s;
        }

        boolean isGoingDown = false;
        int curRow = 0;
        StringBuilder[] v = new StringBuilder[numRows];
        for (int i = 0; i < inputStringLength; i++) {
            if (v[curRow] == null) {
                v[curRow] = new StringBuilder();
            }
            v[curRow].append(s.charAt(i));
            if (curRow <= 0 || curRow >= (numRows - 1)) {
                isGoingDown = !isGoingDown;
            }
            curRow += isGoingDown == true ? 1 : -1;
        }

        StringBuilder resultStr = new StringBuilder(inputStringLength);
        for (int i = 0; i < numRows; i++) {
            if (v[i] != null) {
                resultStr.append(v[i].toString());
            } else {
                break;
            }
        }
        return resultStr.toString();
    }
}
