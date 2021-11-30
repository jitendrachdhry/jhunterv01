package com.jhunter;
import com.jhunter.fang.FANG2021;

import static com.jhunter.fang.FANG2021.MergeMultipleSortedArray;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr1 = null; // { 1,3,5};
        int[] arr2 = { 2,3,6,9};
        int[] arr3 = { 0,1,5,9};

        int[] resArr = FANG2021.MergeMultipleSortedArray(arr1, arr2, arr3);
    }
}
