package com.jhunter.jstring.tree;

public class ExpressionEquality {

    /*
        How to compare two strings are equal or not with logical operators in between those strings. These strings are table columns ?
        Let's say countrycode , domainNumber , employeeType are the columns of the table.
        We want to compare the expressions that are formed by these columns with logical operators in between in any order are not same .

        Example 1 :
        str1: (country_code ='US' AND domain_num ='5' OR employee_type ='FT')
        str2 : (country_code ='US' OR domain_num ='5' AND employee_type ='FT')
        Answer : False

        Example 2 :
        (employee_type = 'P' AND (domain_num = '1' or domain_num = '3') AND country_code = 'US')
        (country_code = 'US' AND (domain_num = '1' or domain_num = '3') AND employee_type = 'P')
        Answer : True

        Example 2 :
        (employee_type = 'P' AND (domain_num = '3' or domain_num = '1') AND country_code = 'US')
        (country_code = 'US' AND (domain_num = '1' AND domain_num = '3') AND employee_type = 'P')
        Answer : False
     */
    public static boolean checkExpressionEquality(String s1, String s2){
        return false;
    }
}
