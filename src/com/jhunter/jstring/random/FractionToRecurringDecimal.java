package com.jhunter.jstring.random;

public class FractionToRecurringDecimal {
    /*
        Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.
        If the fractional part is repeating, enclose the repeating part in parentheses.
        If multiple answers are possible, return any of them.
        It is guaranteed that the length of the answer string is less than 104 for all the given inputs.

        Example 1:
        Input: numerator = 1, denominator = 2
        Output: "0.5"

        Example 2:
        Input: numerator = 2, denominator = 1
        Output: "2"

        Example 3:
        Input: numerator = 4, denominator = 333
        Output: "0.(012)"

        Constraints:
        -231 <= numerator, denominator <= 231 - 1
        denominator != 0
     */
 /*   public static String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) return "0";
        if(denominator == 0) return "";

        double divResult = (double) numerator / denominator;
        int divResultInInt = (int) divResult;
        StringBuilder result = new StringBuilder(divResultInInt + ".");
        StringBuilder fraction = new StringBuilder();
        divResult -= divResultInInt;
        while (divResult > 0) {
            divResult *= 10;
            divResultInInt = (int) divResult;
            fraction.append(divResultInInt);
            divResult -= divResultInInt;
            if(isItDuplicate(fraction)) break;
        }
        return result.append(fraction).toString();
    }
    static boolean isItDuplicate(StringBuilder fraction){
        if(fraction.length() == 0 || fraction.length() % 2 != 0) {
            return false;
        }
        
    }*/

}
