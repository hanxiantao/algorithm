package com.hand.algorithm.leetcode.array;

/**
 * 283. 移动零
 */
public class Solution283 {
    public void moveZeroes(int[] nums) {
        for (int i = 0, j = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                if (i != j) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
                ++j;
            }
        }
    }
}
