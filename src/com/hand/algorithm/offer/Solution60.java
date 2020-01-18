package com.hand.algorithm.offer;

import java.util.ArrayList;

/**
 * 把二叉树打印成多行：
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行
 */
public class Solution60 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        helper(pRoot, 0, result);
        return result;
    }

    private void helper(TreeNode root, int depth, ArrayList<ArrayList<Integer>> result) {
        if (root == null) return;
        if (depth >= result.size()) {
            result.add(new ArrayList<>());
        }
        result.get(depth).add(root.val);
        helper(root.left, depth + 1, result);
        helper(root.right, depth + 1, result);
    }
}
