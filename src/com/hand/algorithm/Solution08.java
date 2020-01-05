package com.hand.algorithm;

/**
 * 跳台阶：
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）
 */
public class Solution08 {
    /**
     * 1 2 3 5 8 13
     *
     * @param target
     * @return
     */
    public int JumpFloor(int target) {
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
