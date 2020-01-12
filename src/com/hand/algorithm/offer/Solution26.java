package com.hand.algorithm.offer;

/**
 * 二叉搜索树与双向链表：
 * 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表
 * 要求不能创建任何新的结点，只能调整树中结点指针的指向
 */
public class Solution26 {

    TreeNode pLast = null;

    /**
     * 思路：
     * 先中序遍历，修改当前遍历节点与前一遍历节点的指针指向
     * 每个节点的right设为下一个节点，下一个节点的left设为上一个节点
     *
     * @param pRootOfTree
     * @return
     */
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        //如果左子树为空，那么根节点pRootOfTree为双向链表的头节点
        TreeNode head = Convert(pRootOfTree.left);
        if (head == null) head = pRootOfTree;
        //连接当前节点pRootOfTree和当前链表的尾节点pLast
        pRootOfTree.left = pLast;
        if (pLast != null) pLast.right = pRootOfTree;
        pLast = pRootOfTree;
        Convert(pRootOfTree.right);
        return head;
    }
}
