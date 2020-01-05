package com.hand.algorithm;

/**
 * 斐波那契数列：
 * 现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，n<=39）
 */
public class Solution07 {
    /**
     * 0 1 1 2 3 5 8 13
     *
     * @param n
     * @return
     */
    public int Fibonacci(int n) {
        if (n == 0 || n == 1) return n;
        int prepre = 0, pre = 1, result = 0;
        for (int i = 2; i <= n; ++i) {
            result = prepre + pre;
            prepre = pre;
            pre = result;
        }
        return result;
    }
}
