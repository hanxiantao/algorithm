package com.hand.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 589. N叉树的前序遍历
 */
public class Solution589 {
    List<Integer> result = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        helper(root);
        return result;
    }

    private void helper(Node root) {
        if (root == null) return;
        result.add(root.val);
        for (Node node : root.children) {
            helper(node);
        }
    }
}
