package com.hand.algorithm.offer;

/**
 * 二叉搜索树的后序遍历序列：
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No
 * 假设输入的数组的任意两个数字都互不相同
 */
public class Solution23 {
    /**
     * 二叉搜索树的特性：
     * 1、左子树上所有节点的值均小于它的根节点的值
     * 2、右子树上所有节点的值均大于它的根节点的值
     * 3、一棵二叉搜索树的左子树和右子树都是二叉搜索树
     * 4、二叉搜索树中序遍历后元素升序排列
     *
     * @param sequence
     * @return
     */
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) return false;
        return helper(sequence, 0, sequence.length - 1);
    }

    private boolean helper(int[] sequence, int start, int root) {
        if (start >= root) return true;
        int rootVal = sequence[root];
        int i = start;
        for (; i < root; ++i)
            if (sequence[i] > rootVal) break;
        for (int j = i; j < root; ++j)
            if (sequence[j] < rootVal) return false;
        return helper(sequence, start, i - 1) && helper(sequence, i, root - 1);
    }
}
