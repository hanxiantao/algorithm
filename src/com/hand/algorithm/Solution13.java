package com.hand.algorithm;

/**
 * 调整数组顺序使奇数位于偶数前面：
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 * 所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变
 */
public class Solution13 {
    /**
     * 因为题目要求偶数和偶数之间的相对位置不变，所以选择一个稳定的排序算法，这里选择插入排序
     *
     * @param array
     */
    public void reOrderArray(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            //如果当前元素是奇数
            if ((array[i] & 1) == 1) {
                int current = i, tmp = array[i];
                while (current > 0 && ((array[current - 1] & 1) == 0)) {
                    array[current] = array[current - 1];
                    --current;
                }
                array[current] = tmp;
            }
        }
    }
}
