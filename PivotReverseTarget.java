/*
 There is an integer array nums sorted in ascending order (with distinct values). 
Prior to being passed to your function, nums is possibly rotated at an unknown pivot 
index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., 
nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] 
might be rotated at pivot index 3 and become [4,5,6,7,0,1,2]. 
Given the array nums after the possible rotation and an integer target, return the 
index of target if it is in nums, or -1 if it is not in nums.[C] 
Example 1: 
Input: nums = [4,5,6,7,0,1,2], target = 0 
Output: 4 
Example 2: 
Input: nums = [4,5,6,7,0,1,2], target = 3 
Output: -1
 */

import java.util.Scanner;

public class PivotReverseTarget {

    public static void shortArray(int nums[]) {

        for (int turn = 0; turn < nums.length - 1; turn++) {
            for (int j = 0; j < nums.length - 1 - turn; j++) {

                if (nums[j] > nums[j + 1]) {
                    // swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void reverseToPivotIndex(int nums[], int pivotIndex, int target) {

        int newNums[] = new int[nums.length];

        int position = 0;

        for (int i = pivotIndex; i < nums.length; i++) {
            newNums[position] = nums[i];
            position++;
        }

        for (int i = 0; i < pivotIndex; i++) {
            newNums[position] = nums[i];
            position++;
        }

        for (int i = 0; i < newNums.length; i++) {
            System.out.print(newNums[i] + " ");
        }

        System.out.println();
        for (int i = 0; i < newNums.length; i++) {
            if (newNums[i] == target) {
                System.out.println(target + " is an index = " + i);
            } 
            else{
                System.out.println("target is not found:");
            }
        }

    }

    public static void main(String args[]) {

        int nums[] = { 0, 1, 2, 4, 5, 6, 7 };
        int pivotIndex = 3;
        int target = 0;

        reverseToPivotIndex(nums, pivotIndex, target);
    }
}
