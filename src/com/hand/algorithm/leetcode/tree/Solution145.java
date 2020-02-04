package com.hand.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 145. 二叉树的后序遍历
 */
public class Solution145 {
    List<Integer> result = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        helper(root);
        return result;
    }

    private void helper(TreeNode root) {
        if (root == null) return;
        helper(root.left);
        helper(root.right);
        result.add(root.val);
    }
}
