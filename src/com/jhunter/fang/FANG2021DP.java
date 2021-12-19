package com.jhunter.fang;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/*
    Dynamic Programming:
    Cut problem into sub problem to build a global answer to the question.

    ===================================================================================
    Questions:
    ===================================================================================
    1. Maximum Value Contiguous Subsequence. Given a sequence of n real numbers A(1) ... A(n), determine a contiguous subsequence A(i) ... A(j) for which the sum of elements in the subsequence is maximized.
        Input: { 1, -2, 4, 3, -2, 0} Result: 7 (2,3)
    2. Given array of integers as input and a target, return true if a contiguous subsequence sums to the target.
    3. Find The Longest (strict) Increasing Subsequence.
        Input:
        { -1, 3, 4, 5, 2, 2, 2, 2 }
        Output:
        { -1, 3, 4, 5 }
    4. Find The Longest NonDecreasing Subsequence.
        Input:
        { -1, 3, 4, 5, 2, 2, 2, 2 }
        Output:
        { -1, 2, 2, 2, 2 }
    5. Find The Longest Decreasing Subsequence.
        Input:
        { -1, 3, 4, 5, 2, 2, 2, 2 }
        Output:
        { 5, 2 }
 */

public class FANG2021DP {
    public static int addTwoStringNumberCompareWithOutputStringNumber(int[] inputArr, AtomicInteger startIdx, AtomicInteger endIdx) {
        /*
        https://people.cs.clemson.edu/~bcdean/dp_practice/
        Question:
        Maximum Value Contiguous Subsequence. Given a sequence of n real numbers A(1) ... A(n), determine a contiguous subsequence A(i) ... A(j) for which the sum of elements in the subsequence is maximized.

        Input: { 1, -2, 4, 3, -2, 0}
        Result: 7 (2,3)
        */

        if (inputArr == null) {
            startIdx.set(-1);
            endIdx.set(-1);
            return -1;
        }

        int[] dpArr = new int[inputArr.length];
        dpArr[0] = inputArr[0];
        int maxValue = inputArr[0], startJIdx, endJIdx;
        startIdx.set(0);
        endIdx.set(0);
        startJIdx = endJIdx = 0;
        for (int j = 1; j < inputArr.length; j++) {
            if (Math.max((dpArr[j - 1] + inputArr[j]), inputArr[j]) > inputArr[j]) {
                endJIdx++;
                dpArr[j] = dpArr[j - 1] + inputArr[j];
            } else {
                startJIdx = endJIdx = j;
                dpArr[j] = inputArr[j];
            }

            if (dpArr[j] > maxValue) {
                startIdx.set(startJIdx);
                endIdx.set(endJIdx);
                maxValue = dpArr[j];
            }
        }

        System.out.println(" Start Idx: " + startIdx + " endIdx: " + endIdx + " Sum: " + maxValue);
        return maxValue;
    }

    public static boolean addTwoStringNumberCompareWithOutputStringNumber(int[] inputArr, int target) {
        /*
            Question:
            Given array of integers as input and a target, return true if a contiguous subsequence sums to the target.

            Approach:
            - Take two pointer to point head and tail.
            - Keep adding number [head++] until we reach greater than target value.
            - keep removing from tail[++] until we reach below target.
            - return true if addition equal to given target value.
        */

        if (inputArr == null) {
            return false;
        }

        boolean retValue = false;
        int tail = 0, head = 1, sum = inputArr[0];
        while (head < inputArr.length || sum >= target) {
            if (sum < target) {
                sum += inputArr[head++];
            } else if (sum > target) {
                sum -= inputArr[tail++];
            } else {
                retValue = true;
                break;
            }
        }
        System.out.println(" inputArr: " + Arrays.toString(inputArr) + " target: " + target + " found or not? " + retValue);
        return retValue;
    }

    public static int FindTheLongestIncreasingSubsequence(int[] inputArr) {
        /*
            Find The Longest Increasing Subsequence.
            Input:
            { -1, 3, 4, 5, 2, 2, 2, 2 }
            Output: 4
            Explanation: { -1, 3, 4, 5 }
            BigO:
            Time Complexity: O(n^2)
            Space Complexity: O(n)
         */

        if(inputArr == null || inputArr.length == 0) {
            return -1;
        }
        int[] targetArr = new int[inputArr.length];
        targetArr[0] = 1;

        for(int i=1 ; i<inputArr.length; i++) {
            targetArr[i] = 1;
            for(int j=0; j < i; j++) {
                if(inputArr[j] < inputArr[i]){
                    targetArr[i] = targetArr[j] + 1;
                }
            }
        }

        int returnVal = targetArr[0];
        for(int k=1; k< targetArr.length; k++) {
            if(returnVal < targetArr[k]) {
                returnVal = targetArr[k];
            }
        }
        System.out.println("FindTheLongestNonDecreasingSubsequence of " + Arrays.toString(inputArr) + " is : " + returnVal);
        return returnVal;
    }

    public static int FindTheLongestNonDecreasingSubsequence(int[] inputArr) {
        /*
            Find The Longest NonDecreasing Subsequence.
            Input:
            { -1, 3, 4, 5, 2, 2, 2, 2 }
            Output: 5
            Explanation: { -1, 2, 2, 2, 2 }
            BigO:
            Time Complexity: O(n^2)
            Space Complexity: O(n)

            URL: https://www.youtube.com/watch?v=fV-TF4OvZpk&t=602s
         */

        if(inputArr == null || inputArr.length == 0) {
            return -1;
        }
        int[] targetArr = new int[inputArr.length];
        targetArr[0] = 1;

        for(int i=1 ; i<inputArr.length; i++) {
            targetArr[i] = 1;
            for(int j=0; j < i; j++) {
                if(inputArr[j] <= inputArr[i]){
                    targetArr[i] = targetArr[j] + 1;
                }
            }
        }

        int returnVal = targetArr[0];
        for(int k=1; k< targetArr.length; k++) {
            if(returnVal < targetArr[k]) {
                returnVal = targetArr[k];
            }
        }
        System.out.println("FindTheLongestNonDecreasingSubsequence of " + Arrays.toString(inputArr) + " is : " + returnVal);
        return returnVal;
    }

    public static int FindTheLongestDecreasingSubsequence(int[] inputArr) {
        /*
            Find The Longest NonDecreasing Subsequence.
            Input:
            arr[] = [15, 27, 14, 38, 63, 55, 46, 65, 85]
            Output: 3
            Explanation: The longest decreasing subsequence is {63, 55, 46}
            BigO:
            Time Complexity: O(n^2)
            Space Complexity: O(n)
         */

        if(inputArr == null || inputArr.length == 0) {
            return -1;
        }
        int[] targetArr = new int[inputArr.length];
        targetArr[0] = 1;

        for(int i=1 ; i<inputArr.length; i++) {
            targetArr[i] = 1;
            for(int j=0; j < i; j++) {
                if(inputArr[j] > inputArr[i]){
                    targetArr[i] = targetArr[j] + 1;
                }
            }
        }

        int returnVal = targetArr[0];
        for(int k=1; k< targetArr.length; k++) {
            if(returnVal < targetArr[k]) {
                returnVal = targetArr[k];
            }
        }
        System.out.println("FindTheLongestDecreasingSubsequence of " + Arrays.toString(inputArr) + " is : " + returnVal);
        return returnVal;
    }
}