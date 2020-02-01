package com.hand.algorithm.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 590. N叉树的后序遍历
 */
public class Solution590 {
    List<Integer> result = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        helper(root);
        return result;
    }

    private void helper(Node root) {
        if (root == null) return;
        for (int i = 0; i < root.children.size(); ++i) {
            helper(root.children.get(i));
        }
        result.add(root.val);
    }
}
