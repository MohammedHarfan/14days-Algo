package com.algo.daythree;

public class MoveZeros {
    public static void main(String[] args) {
        int[] numbers = {0,1,0,3,12};
        moveZeroes(numbers);
        printArray(numbers);
    }
    static void moveZeroes(int[] nums) {
        int index = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }

        for(int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    static void printArray(int[] arr)
    {
        for (int j : arr) System.out.print(j + " ");
    }
}

/*
Question:( Move Zeroes)
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]
 */

