package com.jhunter;

import com.jhunter.fang.FANG2021;
import com.jhunter.fang.FANG2021DP;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] arr1 = null; // { 1,3,5};
        int[] arr2 = {2, 3, 6, 9};
        int[] arr3 = {0, 1, 5, 9};
        //int[] arr3 = {0, 0, 0, 0};

        FANG2021.MergeMultipleSortedArray(arr1, arr2, arr3);

        FANG2021.addNumberFromIntArray(arr2, arr3);

        String strNum1 = "123.4", strNum2 = ".123";
        FANG2021.addTwoStringNumberCompareWithOutputStringNumber(strNum1, strNum2);

        int[] dp = { 1, -2, 4, 3, -2, 0};
        AtomicInteger startIdx = new AtomicInteger(0), endIdx = new AtomicInteger(0);
        FANG2021DP.addTwoStringNumberCompareWithOutputStringNumber(dp, startIdx, endIdx);
    }
}
