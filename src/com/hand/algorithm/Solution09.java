package com.hand.algorithm;

import java.util.Arrays;

/**
 * 变态跳台阶：
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法
 */
public class Solution09 {

    /**
     * 解法1：DP
     *
     * @param target
     * @return
     */
    public int JumpFloorII(int target) {
        if (target <= 2) return target;
        int[] dp = new int[target + 1];
        Arrays.fill(dp, 1);//除了0之外，每一种都可以直接从0跳到n
        dp[0] = 0;
        for (int i = 2; i <= target; ++i) {
            for (int j = i - 1; j >= 1; --j) {
                dp[i] += dp[j];
            }
        }
        return dp[target];
    }

    /**
     * 解法2：
     * f(n)=f(n−1)+f(n−2)+……f(0)
     * f(n−1)=f(n−2)+……f(0)
     * 两式相减得：f(n)=2f(n−1)
     *
     * @param target
     * @return
     */
    public int JumpFloorII2(int target) {
        if (target <= 2) return target;
        int result = 2;
        for (int i = 3; i <= target; ++i) {
            result = 2 * result;
        }
        return result;
    }
}
