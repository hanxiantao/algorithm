package com.hand.algorithm.offer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 从上往下打印二叉树：
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印
 */
public class Solution22 {
    /**
     * 广度优先搜索
     *
     * @param root
     * @return
     */
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;
        deque.add(root);
        while (!deque.isEmpty()) {
            TreeNode node = deque.pollFirst();
            result.add(node.val);
            if (node.left != null) {
                deque.addLast(node.left);
            }
            if (node.right != null) {
                deque.addLast(node.right);
            }
        }
        return result;
    }
}
