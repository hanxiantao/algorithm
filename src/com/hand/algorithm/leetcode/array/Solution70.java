package com.hand.algorithm.leetcode.array;

/**
 * 70. 爬楼梯
 */
public class Solution70 {
    public int climbStairs(int n) {
        if (n <= 2) return n;
        int pre = 1, current = 2;
        for (int i = 3; i <= n; ++i) {
            int tmp = current;
            current = current + pre;
            pre = current;
        }
        return current;
    }
}
