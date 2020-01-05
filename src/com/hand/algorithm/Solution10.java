package com.hand.algorithm;

/**
 * 矩形覆盖：
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法
 */
public class Solution10 {
    /**
     * 1 2 3 5 8 13
     *
     * @param target
     * @return
     */
    public int RectCover(int target) {
        if (target <= 2) return target;
        int prepre = 1, pre = 2, result = 0;
        for (int i = 3; i <= target; ++i) {
            result = prepre + pre;
            prepre = pre;
            pre = result;
        }
        return result;
    }
}
