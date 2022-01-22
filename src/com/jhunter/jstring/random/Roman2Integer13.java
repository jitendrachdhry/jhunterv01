package com.jhunter.jstring.random;

import java.util.HashMap;
import java.util.Map;

public class Roman2Integer13 {
    /*
    Roman to Integer
    Example 1:
    Input: s = "III"
    Output: 3
    Explanation: III = 3.

    Example 2:
    Input: s = "LVIII"
    Output: 58
    Explanation: L = 50, V= 5, III = 3.

    Example 3:
    Input: s = "MCMXCIV"
    Output: 1994
    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 */
    public static int romanToInteger(String num) {
        if (num == null || num.length() <= 0) {
            return 0;
        }

        Map<String, Integer> romanKeyMap = new HashMap<String, Integer>();
        romanKeyMap.put("I", 1);
        romanKeyMap.put("IV", 4);
        romanKeyMap.put("V", 5);
        romanKeyMap.put("IX", 9);
        romanKeyMap.put("X", 10);
        romanKeyMap.put("XL", 40);
        romanKeyMap.put("L", 50);
        romanKeyMap.put("XC", 90);
        romanKeyMap.put("C", 100);
        romanKeyMap.put("CD", 400);
        romanKeyMap.put("D", 500);
        romanKeyMap.put("CM", 900);
        romanKeyMap.put("M", 1000);

        int result = 0;
        for (int i = 0; i < num.length(); ) {
            if (i != num.length() - 1 && romanKeyMap.containsKey(num.substring(i, i + 2))) {
                result += romanKeyMap.get(num.substring(i, i + 2));
                i += 2;
            } else {
                result += romanKeyMap.get(num.substring(i, i + 1));
                i += 1;
            }
        }
        return result;
    }
}
