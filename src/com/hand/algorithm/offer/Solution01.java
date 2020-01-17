package com.hand.algorithm.offer;

/**
 * 二维数组中的查找：
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 */
public class Solution01 {
    /**
     * 从左下找：
     * 利用该二维数组的性质，左下角的值m为该行最小的值，该列最大的值
     * <p>
     * 每次将m和目标值target比较：
     * 当m<target，由于m已经是该行最大的元素，想要更大只有从列考虑，取值右移一位
     * 当m>target，由于m已经是该列最小的元素，想要更小只有从行考虑，取值上移一位
     * 当m=target，找到该值，返回true
     *
     * @param target
     * @param array
     * @return
     */
    public boolean Find(int target, int[][] array) {
        int rows = array.length, cols = array[0].length;
        if (rows == 0 || cols == 0) return false;
        int row = rows - 1, col = 0;
        while (row >= 0 && col < cols) {
            if (array[row][col] < target)
                col++;
            else if (array[row][col] > target)
                row--;
            else return true;
        }
        return false;
    }
}
