package com.hand.algorithm.leetcode.array;

/**
 * 26. 删除排序数组中的重复项
 */
public class Solution26 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; ++j) {
            if (nums[i] != nums[j]) nums[++i] = nums[j];
        }
        return i;
    }
}
