package com.hand.algorithm.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * [15. 三数之和](https://leetcode-cn.com/problems/3sum/)
 */
public class Solution15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int k = 0; k < nums.length - 2; ++k) {
            if (nums[k] > 0) break;
            if (k > 0 && nums[k] == nums[k - 1]) continue;
            int i = k + 1, j = nums.length - 1;
            while (i < j) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) {
                    while (i < j && nums[j] == nums[--j]) ;
                } else if (sum < 0) {
                    while (i < j && nums[i] == nums[++i]) ;
                } else {
                    result.add(Arrays.asList(nums[k], nums[i], nums[j]));
                    while (i < j && nums[i] == nums[++i]) ;
                    while (i < j && nums[j] == nums[--j]) ;
                }
            }
        }
        return result;
    }

}
