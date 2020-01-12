package com.hand.algorithm.offer;

/**
 * 数值的整数次方：
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方
 * 保证base和exponent不同时为0
 */
public class Solution12 {
    /**
     * 解法1：暴力法
     *
     * @param base
     * @param exponent
     * @return
     */
    public double Power(double base, int exponent) {
        if (base == 0.0) return 0.0;
        double result = 1.0;
        //获取指数的绝对值
        int e = exponent > 0 ? exponent : -exponent;
        for (int i = 1; i <= e; ++i) {
            result *= base;
        }
        //根据指数正负，返回结果
        return exponent > 0 ? result : 1 / result;
    }

    /**
     * 解法2：二分法
     *
     * @param base
     * @param exponent
     * @return
     */
    public double Power2(double base, int exponent) {
        if (exponent < 0) {
            base = 1 / base;
            exponent = -exponent;
        }
        return helper(base, exponent);
    }

    private double helper(double base, int exponent) {
        if (exponent == 0) return 1.0;
        double half = helper(base, exponent / 2);
        if ((exponent & 1) == 0) return half * half;
        else return half * half * base;
    }
}
