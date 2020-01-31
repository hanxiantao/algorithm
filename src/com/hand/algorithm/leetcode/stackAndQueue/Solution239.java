package com.hand.algorithm.leetcode.stackAndQueue;

import java.util.LinkedList;

/**
 * 239. 滑动窗口最大值
 */
public class Solution239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if (k * n == 0) return new int[0];
        if (k == 1) return nums;
        int[] result = new int[n - k + 1];
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; ++i) {
            while (!list.isEmpty() && nums[i] > nums[list.peekLast()]) {
                list.pollLast();
            }
            list.add(i);
            if (i - k + 1 > list.peekFirst()) list.pollFirst();
            if (i - k + 1 >= 0) result[i - k + 1] = nums[list.peekFirst()];
        }
        return result;
    }
}
