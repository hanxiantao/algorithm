package com.hand.algorithm.offer;

/**
 * 对称的二叉树：
 * 请实现一个函数，用来判断一颗二叉树是不是对称的
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的
 */
public class Solution58 {
    boolean isSymmetrical(TreeNode pRoot) {
        return pRoot == null || helper(pRoot.left, pRoot.right);
    }

    private boolean helper(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) return false;
        if (node1.val != node2.val) {
            return false;
        } else {
            return helper(node1.left, node2.right) && helper(node1.right, node2.left);
        }
    }
}
