package com.slothnerds.algos.search;

/*
Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
*/

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 7;
        int result = searchInsert(arr, target);
        System.out.println("Element found at index: " + result);
    }

    private static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            System.out.println("left: " + left + " right: " + right + " mid: " + mid);
            if (nums[mid] > target) {
                right = right - 1;
            }
            if (nums[mid] < target) {
                left = left + 1;
            }
            if (nums[mid] == target) {
                System.out.println("found at index: " + mid);
                return mid;
            }
        }
        if (nums[mid] < target) {
            mid++;
        }
        return mid;
    }

}
