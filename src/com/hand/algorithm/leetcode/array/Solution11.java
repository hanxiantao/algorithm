package com.hand.algorithm.leetcode.array;

/**
 * 11. 盛最多水的容器
 */
public class Solution11 {
    public int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0, j = height.length - 1; i < j; ) {
            int minHeight = height[i] < height[j] ? height[i++] : height[j--];
            maxArea = Math.max(maxArea, minHeight * (j - i + 1));
        }
        return maxArea;
    }
}
