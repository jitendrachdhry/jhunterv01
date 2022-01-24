package com.jhunter.jstring.backtracking;

import java.util.ArrayList;
import java.util.List;

public class RestoreIPAddresses93 {
    /*
        A valid IP address consists of exactly four integers separated by single dots. Each integer is between 0 and 255 (inclusive) and cannot have leading zeros.

        For example, "0.1.2.201" and "192.168.1.1" are valid IP addresses, but "0.011.255.245", "192.168.1.312" and "192.168@1.1" are invalid IP addresses.
        Given a string s containing only digits, return all possible valid IP addresses that can be formed by inserting dots into s. You are not allowed to reorder or remove any digits in s. You may return the valid IP addresses in any order.

        Example 1:
        Input: s = "25525511135"
        Output: ["255.255.11.135","255.255.111.35"]

        Example 2:
        Input: s = "0000"
        Output: ["0.0.0.0"]

        Example 3:
        Input: s = "101023"
        Output: ["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]

        Constraints:
        0 <= s.length <= 20
        s consists of digits only.
     */

    public static List<String> restoreIpAddresses(String s) {
        List<String> resultList = new ArrayList<>();
        // check if string have enough characters to add three dots.
        if (s == null || s.length() < 4 || s.length() > 12) {
            return resultList;
        }
        backTrace(0, 0, "", s, resultList);
        return resultList;
    }

    static void backTrace(int i, int dot, String ipAdd, String s, List<String> resultList) {
        // goal: ready to exit
        if (dot == 4 && i == s.length()) {
            resultList.add(ipAdd.substring(0, ipAdd.length() - 1));
            return;
        }

        for (int j = i; j < Math.min(i + 3, s.length()); j++) {
            // add validation logic to check if we move forward or not.
            // 1. Number should be greater than zero and less than 255
            // 2. first digit should not be zero for 2 or more char. like 100.011.255.1. In this example 011 is not allowed.
            int num = Integer.parseInt(s.substring(i, j + 1));
            if (num <= 255 && (i == j || s.charAt(i) != '0')) {
                backTrace(j + 1, dot + 1, ipAdd + s.substring(i, j + 1) + ".", s, resultList);
            }
        }
    }
}
