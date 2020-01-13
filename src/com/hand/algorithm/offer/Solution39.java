package com.hand.algorithm.offer;

/**
 * 平衡二叉树：
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树
 */
public class Solution39 {

    /**
     * 解法1：递归
     *
     * @param root
     * @return
     */
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) return true;
        return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1
                && IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }

    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    /**
     * 解法2：递归+剪枝
     *
     * @param root
     * @return
     */
    public boolean IsBalanced_Solution2(TreeNode root) {
        return getDepth(root) != -1;
    }

    private int getDepth(TreeNode root) {
        if (root == null) return 0;
        int left = getDepth(root.left);
        if (left == -1) return -1;
        int right = getDepth(root.right);
        if (right == -1) return -1;
        return Math.abs(left - right) > 1 ? -1 : 1 + Math.max(left, right);
    }
}
