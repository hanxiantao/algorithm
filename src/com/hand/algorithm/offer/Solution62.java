package com.hand.algorithm.offer;

import java.util.Stack;

/**
 * 二叉搜索树的第k个结点：
 * 给定一棵二叉搜索树，请找出其中的第k小的结点
 * 例如，(5，3，7，2，4，6，8)中，按结点数值大小顺序第三小结点的值为4
 */
public class Solution62 {

    int count = 0;

    /**
     * 解法1：递归
     *
     * @param pRoot
     * @param k
     * @return
     */
    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot != null) {
            TreeNode node = KthNode(pRoot.left, k);
            if (node != null) return node;
            count++;
            if (count == k) return pRoot;
            node = KthNode(pRoot.right, k);
            if (node != null) return node;
        }
        return null;
    }

    /**
     * 解法2：基于栈的遍历
     *
     * @param pRoot
     * @param k
     * @return
     */
    TreeNode KthNode2(TreeNode pRoot, int k) {
        if (pRoot == null || k == 0) return null;
        int count = 0;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode node = pRoot;
        while (node != null || !stack.isEmpty()) {
            if (node != null) {
                stack.push(node);
                node = node.left;
            } else {
                node = stack.pop();
                count++;
                if (count == k) return node;
                node = node.right;
            }
        }
        return null;
    }
}
