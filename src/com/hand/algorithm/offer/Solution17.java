package com.hand.algorithm.offer;

/**
 * 树的子结构：
 * 输入两棵二叉树A，B，判断B是不是A的子结构（空树不是任意一个树的子结构）
 */
public class Solution17 {
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) return false;
        return judgeSubTree(root1, root2) || judgeSubTree(root1.left, root2) || judgeSubTree(root1.right, root2);
    }

    private boolean judgeSubTree(TreeNode root1, TreeNode root2) {
        if (root2 == null) return true;
        if (root1 == null) return false;
        if (root1.val != root2.val) return false;
        return judgeSubTree(root1.left, root2.left) && judgeSubTree(root1.right, root2.right);
    }
}
