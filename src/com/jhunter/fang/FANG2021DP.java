package com.jhunter.fang;

import static java.lang.Math.max;
import java.util.concurrent.atomic.AtomicInteger;
public class FANG2021DP {
    public static int addTwoStringNumberCompareWithOutputStringNumber(int[] inputArr, AtomicInteger startIdx, AtomicInteger endIdx) {
        /*
        https://people.cs.clemson.edu/~bcdean/dp_practice/
        Question:
        Maximum Value Contiguous Subsequence. Given a sequence of n real numbers A(1) ... A(n), determine a contiguous subsequence A(i) ... A(j) for which the sum of elements in the subsequence is maximized.

        Input: { 1, -2, 4, 3, -2, 0}
        Result: 7 (2,3)
        */

        if(inputArr == null ) {
            startIdx.set(-1); endIdx.set(-1);
            return -1;
        }

        int [] dpArr = new int[inputArr.length];
        dpArr[0] = inputArr[0];
        int maxValue = inputArr[0], startJIdx , endJIdx;
        startIdx.set(0); endIdx.set(0);
        startJIdx = endJIdx = 0;
        for(int j=1; j<inputArr.length; j++) {
            if(Math.max( ( dpArr[j-1] + inputArr[j] ) , inputArr[j] ) > inputArr[j] ) {
                endJIdx++;
                dpArr[j] = dpArr[j-1] + inputArr[j];
            } else {
                startJIdx = endJIdx = j;
                dpArr[j] = inputArr[j];
            }

            if (dpArr[j] > maxValue){
                startIdx.set(startJIdx);
                endIdx.set(endJIdx);
                maxValue = dpArr[j];
            }
        }

        System.out.println(" Start Idx: " + startIdx + " endIdx: " + endIdx + " Sum: " + maxValue);
        return maxValue;
    }
}