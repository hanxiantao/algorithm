package com.hand.algorithm.leetcode.divideAndConquer;

/**
 * 98. 验证二叉搜索树
 */
public class Solution98 {
    double last = -Double.MAX_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (isValidBST(root.left)) {
            if (last < root.val) {
                last = root.val;
                return isValidBST(root.right);
            }
        }
        return false;
    }
}
