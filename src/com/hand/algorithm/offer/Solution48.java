package com.hand.algorithm.offer;

/**
 * 不用加减乘除做加法：
 * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号
 */
public class Solution48 {
    /**
     * ^：按位异或，相同为0不同为1
     * &：按位与，两位同时为1，结果才为1，否则为0
     * |：按位或，两位只要有一个为1，其值为1，否则为0
     * <p>
     * 1、两个数异或：相当于每一位相加，而不考虑进位；
     * 2、两个数相与，并左移一位：相当于求得进位；
     * 3、将上述两步的结果相加
     *
     * @param num1
     * @param num2
     * @return
     */
    public int Add(int num1, int num2) {
        while (num2 != 0) {
            int sum = num1 ^ num2;
            int carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;
        }
        return num1;
    }
}
