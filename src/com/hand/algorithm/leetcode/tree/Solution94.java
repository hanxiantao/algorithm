package com.hand.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 */
public class Solution94 {
    List<Integer> result = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        helper(root);
        return result;
    }

    private void helper(TreeNode root) {
        if (root == null) return;
        helper(root.left);
        result.add(root.val);
        helper(root.right);
    }
}
