package com.hand.algorithm.offer;

import java.util.Arrays;

/**
 * 重建二叉树：
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回
 */
public class Solution04 {

    /**
     * 1、根据前序序列第一个结点确定根结点
     * 2、根据根结点在中序序列中的位置分割出左右两个子序列
     * 3、对左子树和右子树分别递归使用同样的方法继续分解
     *
     * @param pre
     * @param in
     * @return
     */
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        if (pre.length == 0 || in.length == 0) return null;
        TreeNode node = new TreeNode(pre[0]);
        for (int i = 0; i < in.length; ++i) {
            if (pre[0] == in[i]) {
                //左子树 copyOfRange()方法：左闭右开
                node.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
                //右子树
                node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + 1, pre.length));
                break;
            }
        }
        return node;
    }
}
