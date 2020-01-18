package com.hand.algorithm.offer;

/**
 * 二叉树的下一个结点：
 * 给定一个二叉树和其中的一个结点，请找出中序遍历顺序的下一个结点并且返回
 * 注意，树中的结点不仅包含左右子结点，同时包含指向父结点的指针
 */
public class Solution57 {
    /**
     * 1、如果有右子树，那么下个结点就是右子树最左边的点
     * 2、如果没有右子树
     * 1）如果当前节点是父节点的左孩子，那么父节点就是下一个节点
     * 2）如果当前节点是父节点的右孩子，找到其父节点的父节点的父节点...直到当前结点是其父节点的左孩子位置
     *
     * @param pNode
     * @return
     */
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) return null;
        //如果有右子树，则找右子树的最左节点
        if (pNode.right != null) {
            pNode = pNode.right;
            while (pNode.left != null) pNode = pNode.left;
            return pNode;
        }
        //没右子树，则找第一个当前节点是父节点左孩子的节点
        while (pNode.next != null) {
            if (pNode.next.left == pNode) return pNode.next;
            pNode = pNode.next;
        }
        return null;
    }
}
