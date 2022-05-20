package com.algo.dayone;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        System.out.println(search(nums, target));
    }
    static int search(int[] nums, int target) {
        if(nums.length == 0) return -1;
        int left = 0;
        int right = nums.length-1;
        while(left <= right) {
            int middle = left + (right-left) / 2;
            if(target==nums[middle]) {
                return middle;
            } else if(nums[middle]>target) {
                right = middle-1;
            } else {
                left = middle+1;
            }
        }
        return -1;
    }
}

/*
Question:
Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4

Example 2:
Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1
 */
