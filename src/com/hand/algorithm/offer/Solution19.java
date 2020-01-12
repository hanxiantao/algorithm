package com.hand.algorithm.offer;

import java.util.ArrayList;

/**
 * 顺时针打印矩阵：
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10
 */
public class Solution19 {
    public ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        if (m == 0 || n == 0) return result;
        int left = 0, right = matrix[0].length - 1, up = 0, down = matrix.length - 1;
        while (true) {
            //上
            for (int i = left; i <= right; ++i) {
                result.add(matrix[up][i]);
            }
            up++;
            if (up > down) break;
            //右
            for (int i = up; i <= down; ++i) {
                result.add(matrix[i][right]);
            }
            right--;
            if (right < left) break;
            //下
            for (int i = right; i >= left; --i) {
                result.add(matrix[down][i]);
            }
            down--;
            if (down < up) break;
            //左
            for (int i = down; i >= up; --i) {
                result.add(matrix[i][left]);
            }
            left++;
            if (left > right) break;
        }
        return result;
    }
}
