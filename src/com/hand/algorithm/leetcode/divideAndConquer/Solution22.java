package com.hand.algorithm.leetcode.divideAndConquer;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. 括号生成
 */
public class Solution22 {
    List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        helper(0, 0, n, "");
        return result;
    }

    private void helper(int left, int right, int max, String s) {
        if (left == max && right == max) {
            result.add(s);
            return;
        }
        if (left < max) helper(left + 1, right, max, s + "(");
        if (right < left) helper(left, right + 1, max, s + ")");
    }
}
