package com.hand.algorithm.offer;

/**
 * 二进制中1的个数：
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示
 */
public class Solution11 {
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }
}