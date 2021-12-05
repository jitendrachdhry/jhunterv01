package com.jhunter.fang;

import java.util.Arrays;

/*
    ===================================================================================
    Questions:
    ===================================================================================
    1. Given 3 sorted int arrays, merge them into one sorted array without duplicates.
    Example:
    arr1[] = { 1,3,5}
    arr2[] = { 2,3,6,9}
    arr3[] = { 0,1,5,9}

    Output:
    resultArr[]= {0,1,2,3,5,6,9}

    2. Given two array A[0….n-1] and B[0….m-1] of size n and m respectively, representing two numbers such that every element of arrays represent a digit. For example, A[] = { 1, 2, 3} and B[] = { 2, 1, 4 } represent 123 and 214 respectively. The task is to find the sum of both the number. In above case, answer is 337.
    Example:
    Input :
        a[] = { 9, 5, 4, 9 }
        b[] = { 2, 1, 4 }
    Output : 9763

    3. Given two numbers as strings, return their sum as a string, e.g., “3.14” + “0.9” = “4.04”
 */
public class FANG2021 {
    public static int[] MergeMultipleSortedArray(int[] arr1, int[] arr2, int[] arr3) {
        /*
        Question:
        Given 3 sorted int arrays, merge them into one sorted array without duplicates.

        Example:
        arr1[] = { 1,3,5}
        arr2[] = { 2,3,6,9}
        arr3[] = { 0,1,5,9}

        Output:
        resultArr[]= {0,1,2,3,5,6,9}

        Doubts to confirm:
        1. Does all array have same size?
        2. do we allow empty(null) array as an input?

        Approach:
        1. Create four index to carry counter for three input array and one result array.
        2. Compare all input array's current values and find minimum value from all three array.
        3. Insert into result array in sorted order without having duplicate.

        Big O:
        - Time Complexity
          O(m + n + o)
        - Space Complexity
          O(m + n + o)

        Test Cases:
        1. Take all same array length.
        2. take different array length.

         */

        // Calculate size of output array.
        int size = (arr1 != null) ? arr1.length : 0;
        size = (arr2 != null) ? arr2.length + size : size;
        size = (arr3 != null) ? arr3.length + size : size;

        int[] resArr = new int[size];
        System.out.println("Result array length: " + resArr.length);

        /* Initialize array indexes. */
        int idx1 = 0, idx2 = 0, idx3 = 0, resIdx = -1;

        /* Start a while loop to traverse all element of arr1, arr2 and arr3. */
        while ((arr1 != null && idx1 < arr1.length) || (arr2 != null && idx2 < arr2.length) || (arr3 != null && idx3 < arr3.length)) {
            int minimumValueArr;
            if (arr1 == null || idx1 >= arr1.length) { /* Check if we have traversed all element of arr1. */
                if (arr2 == null || idx2 >= arr2.length) { /* Check if we have traversed all element of arr2. */
                    minimumValueArr = arr3[idx3++];
                } else if (arr3 == null || idx3 >= arr3.length) { /* Check if we have traversed all element of arr3. */
                    minimumValueArr = arr2[idx2++];
                } else {
                    if (arr2[idx2] < arr3[idx3]) { /* Find minimum element from arr2 and arr3. */
                        minimumValueArr = arr2[idx2++];
                    } else {
                        minimumValueArr = arr3[idx3++];
                    }
                }
            } else if (arr2 == null || idx2 >= arr2.length) { /* Check if we have traversed all element of arr2. */
                if (arr3 == null || idx3 >= arr3.length) { /* Check if we have traversed all element of arr3. */
                    minimumValueArr = arr1[idx1++];
                } else { /* Find minimum element from arr1 and arr3. */
                    if (arr1[idx1] < arr3[idx3]) {
                        minimumValueArr = arr1[idx1++];
                    } else {
                        minimumValueArr = arr3[idx3++];
                    }
                }
            } else if (arr3 == null || idx3 >= arr3.length) {/* Check if we have traversed all element of arr3. */
                if (arr1[idx1] < arr2[idx2]) { /* Find minimum element from arr1 and arr2. */
                    minimumValueArr = arr1[idx1++];
                } else {
                    minimumValueArr = arr2[idx2++];
                }
            } else { /* Find minimum element from arr1, arr2 and arr3. */
                if (arr1[idx1] < arr2[idx2]) {
                    if (arr1[idx1] < arr3[idx3]) {
                        minimumValueArr = arr1[idx1++];
                    } else {
                        minimumValueArr = arr3[idx3++];
                    }
                } else if (arr2[idx2] < arr3[idx3]) {
                    minimumValueArr = arr2[idx2++];
                } else {
                    minimumValueArr = arr3[idx3++];
                }
            }
            if (resIdx < 0 || resArr[resIdx] != minimumValueArr) { /* Insert non duplicate values into output array. */
                resArr[++resIdx] = minimumValueArr;
            }
        }
        System.out.print("\n ===================================== \n Array Result: ");
        int[] subArray = Arrays.copyOfRange(resArr, 0, resIdx + 1);
        for (int i : subArray) {
            System.out.print(i + " ");
        }
        return resArr;
    }

    public static int[] addNumberFromIntArray(int[] arr1, int[] arr2) {

        /*
            Question:
            Given two array A[0….n-1] and B[0….m-1] of size n and m respectively, representing two numbers such that every element of arrays represent a digit. For example, A[] = { 1, 2, 3} and B[] = { 2, 1, 4 } represent 123 and 214 respectively. The task is to find the sum of both the number. In above case, answer is 337.

            Example:
                Input :
                a[] = { 9, 5, 4, 9 }
                b[] = { 2, 1, 4 }
                Output : 9763

            Doubts to confirm:
            1. can we get input like below?
                a[] = { 0, 0, 0, 0, 0, 0, 0, 0}
                b[] = { 2, 1, 4 }

            Big O:
            - Time Complexity
              O(m + n)
            - Space Complexity
              O(m + n)
         */
        if (arr1 == null && arr2 == null) {
            return null;
        } else if (arr1 == null && arr2 != null) {
            return Arrays.copyOfRange(arr2, 0, arr2.length);
        } else if (arr2 == null && arr1 != null) {
            return Arrays.copyOfRange(arr1, 0, arr1.length);
        }
        int[] resArr = new int[Math.max(arr1.length, arr2.length) + 1];
        int idx1 = arr1.length - 1, idx2 = arr2.length - 1, idxOutput = resArr.length - 1, carry = 0;
        while (idx1 >= 0 || idx2 >= 0) {
            int addition;
            if (idx1 >= 0 && idx2 >= 0) {
                addition = arr1[idx1--] + arr2[idx2--] + carry;
            } else if (idx1 >= 0) {
                addition = arr1[idx1--] + carry;
            } else {
                addition = arr2[idx2--] + carry;
            }
            carry = (addition > 10) ? 1 : 0;
            resArr[idxOutput--] = addition % 10;
        }

        System.out.print("\n ===================================== \n Array Result: ");
        int[] subArray = Arrays.copyOfRange(resArr, idxOutput + 1, resArr.length);
        for (int i : subArray) {
            System.out.print(i + " ");
        }
        return resArr;
    }

    public static String addTwoStringNumberCompareWithOutputStringNumber(String str1, String str2) {
        /*
        Question:
        Given two numbers as strings, return their sum as a string, e.g., “3.14” + “0.9” = “4.04”
        */
        if (str1 == null && str2 == null) {
            return null;
        } else if (str1 == null) {
            return str2;
        } else if (str2 == null) {
            return str1;
        }

        char dot = '.';
        char[] resOutput = new char[str1.length() + str2.length() + 1];
        int decimalIdx1 = str1.indexOf(dot), decimalIdx2 = str2.indexOf(dot);
        int decimialDigitCountStr1 = (decimalIdx1 != -1) ? str1.length() - decimalIdx1 - 1 : -1;
        int decimialDigitCountStr2 = (decimalIdx2 != -1) ? str2.length() - decimalIdx2 - 1 : -1;
        int idx1 = str1.length() - 1;
        int idx2 = str2.length() - 1;
        int idxRes = resOutput.length - 1;
        int carry = 0;
        while (decimialDigitCountStr1 > 0 || decimialDigitCountStr2 > 0) {
            if (decimialDigitCountStr1 > decimialDigitCountStr2) {
                resOutput[idxRes--] = str1.charAt(idx1--);
                decimialDigitCountStr1--;
            } else if (decimialDigitCountStr2 > decimialDigitCountStr1) {
                resOutput[idxRes--] = str2.charAt(idx2--);
                decimialDigitCountStr2--;
            } else {
                int addition = Integer.parseInt(String.valueOf(str1.charAt(idx1--))) + Integer.parseInt(String.valueOf(str2.charAt(idx2--))) + carry;
                carry = (addition > 10) ? 1 : 0;
                resOutput[idxRes--] = (char) ((addition % 10) + '0');
                decimialDigitCountStr1--;
                decimialDigitCountStr2--;
            }
        }

        /* Insert dot. */
        if (decimialDigitCountStr1 != -1 || decimialDigitCountStr2 != -1) {
            resOutput[idxRes--] = dot;
        }

        idx1 = (decimalIdx1 != -1) ? decimalIdx1 - 1 : str1.length();
        idx2 = (decimalIdx2 != -1) ? decimalIdx2 - 1 : str2.length() - 1;

        while (idx1 >= 0 || idx2 >= 0) {
            if (idx1 == -1) {
                resOutput[idxRes--] = str2.charAt(idx2--);
            } else if (idx2 == -1) {
                resOutput[idxRes--] = str1.charAt(idx1--);
            } else {
                int addition = Integer.parseInt(String.valueOf(str1.charAt(idx1--))) + Integer.parseInt(String.valueOf(str2.charAt(idx2--))) + carry;
                carry = (addition > 10) ? 1 : 0;
                resOutput[idxRes--] = (char) ((addition % 10) + '0');
            }
        }

        if (carry == 1) {
            resOutput[idxRes--] = (char) (carry + '0');
        }
        System.out.println("\n ===================================== \n Sum of " + str1 + " and " + str2 + " = " + new String(resOutput));

        //String outputStr = new String(resOutput, idxRes + 1, resOutput.length-1);
        //System.out.println(" Sum of " + str1 + " and " + str2 + " = " + outputStr);
        return String.valueOf(resOutput);
    }

}
