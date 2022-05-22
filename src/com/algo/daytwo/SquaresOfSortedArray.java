package com.algo.daytwo;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};

        System.out.println(Arrays.toString(sortedSquares(nums)));
    }
    static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int p_pointer = 0;

        while(p_pointer < n && nums[p_pointer] < 0) {
            p_pointer += 1;
        }

        int n_pointer = p_pointer-1;
        int[] sorted = new int[n];
        int counter = 0;

        while(n_pointer >= 0 && p_pointer < n) {
            if(nums[n_pointer] * nums[n_pointer] < nums[p_pointer] * nums[p_pointer]) {
                sorted[counter] = nums[n_pointer] * nums[n_pointer];
                n_pointer -= 1;
            } else {
                sorted[counter] = nums[p_pointer] * nums[p_pointer];
                p_pointer += 1;
            }
            counter += 1;
        }

        while(n_pointer >= 0) {
            sorted[counter] = nums[n_pointer] * nums[n_pointer];
            n_pointer -= 1;
            counter += 1;
        }

        while(p_pointer < n) {
            sorted[counter] = nums[p_pointer] * nums[p_pointer];
            p_pointer += 1;
            counter += 1;
        }
        return sorted;
    }
}

/*
Question:(Squares of a Sorted Array)
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].

Example 2:
Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 */
