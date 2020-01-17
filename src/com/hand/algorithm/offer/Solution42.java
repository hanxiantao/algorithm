package com.hand.algorithm.offer;

import java.util.ArrayList;

/**
 * 和为S的两个数字：
 * 输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，
 * 如果有多对数字的和等于S，输出两个数的乘积最小的
 * <p>
 * 输出描述:
 * 对应每个测试案例，输出两个数，小的先输出
 */
public class Solution42 {
    /**
     * 思路：左右加逼
     *
     * @param array
     * @param sum
     * @return
     */
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        ArrayList<Integer> result = new ArrayList<>();
        if (array == null || array.length < 2) return result;
        int i = 0, j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == sum) {
                result.add(array[i]);
                result.add(array[j]);
                return result;
            } else if (array[i] + array[j] > sum) {
                --j;
            } else {
                ++i;
            }
        }
        return result;
    }
}
