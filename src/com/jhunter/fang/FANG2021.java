package com.jhunter.fang;
import java.util.Arrays;

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
        2. do we allow empty array as an input?

        Approach:
        1. Create four index to carry counter for three input array and one result array.
        2. Compare all input array's current values and find minimum value from all three array.
        3. Insert into result array in sorted order without having duplicate.

        Big O:
        - Time Complexity
          O(n)
        - Space Complexity
          O(n)

        Test Cases:
        1. Take all same array length.
        2. take different array length.

         */

        // write your code here
        int size = arr1.length + arr2.length + arr3.length;
        System.out.println("arr1.length: " + arr1.length + " arr2.length: " + arr2.length + " arr3.length: " + arr3.length);

        int[] resArr = new int[size];
        System.out.println("Result array length: " + resArr.length);
        int idx1 = 0, idx2 = 0, idx3 = 0, resIdx = -1;
        while (idx1 < arr1.length || idx2 < arr2.length || idx3 < arr3.length) {
            int minimumValueArr;
            if (idx1 >= arr1.length ) {
                if (idx2 >= arr2.length ) {
                    minimumValueArr = arr3[idx3++];
                } else if (idx3 >= arr3.length ) {
                    minimumValueArr = arr2[idx2++];
                } else {
                    if (arr2[idx2] < arr3[idx3]) {
                        minimumValueArr = arr2[idx2++];
                    } else {
                        minimumValueArr = arr3[idx3++];
                    }
                }
            } else if ( idx2 >= arr2.length  ) {
                if (idx3 >= arr3.length ) {
                    minimumValueArr = arr1[idx1++];
                } else {
                    if (arr1[idx1] < arr3[idx3]) {
                        minimumValueArr = arr1[idx1++];
                    } else {
                        minimumValueArr = arr3[idx3++];
                    }
                }
            } else if ( idx3 >= arr3.length ) {
                if (arr1[idx1] < arr2[idx2]) {
                    minimumValueArr = arr1[idx1++];
                } else {
                    minimumValueArr = arr2[idx2++];
                }
            } else {
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
            if (resIdx < 0 || resArr[resIdx] != minimumValueArr) {
                resArr[++resIdx] = minimumValueArr;
            }
        }
        System.out.print("\n\n\n\n Array Result: ");
        int[] subArray = Arrays.copyOfRange(resArr, 0, resIdx + 1);
        for (int i : subArray) {
            System.out.print(i + " ");
        }
        return resArr;
    }
}
