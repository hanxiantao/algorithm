package com.hand.algorithm;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * 最小的K个数：
 * 输入n个整数，找出其中最小的K个数
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4
 */
public class Solution29 {
    /**
     * 解法1：大顶堆
     *
     * @param input
     * @param k
     * @return
     */
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (k == 0 || k > input.length) return result;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(11, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i : input) {
            if (maxHeap.size() != k) {
                maxHeap.offer(i);
            } else if (maxHeap.peek() > i) {
                maxHeap.poll();
                maxHeap.offer(i);
            }
        }
        for (int i : maxHeap) {
            result.add(i);
        }
        return result;
    }

    /**
     * 解法2:快速排序
     *
     * @param input
     * @param k
     * @return
     */
    public ArrayList<Integer> GetLeastNumbers_Solution2(int[] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (k == 0 || k > input.length) return result;
        quickSort(input, 0, input.length - 1);
        for (int i = 0; i < k; ++i) {
            result.add(input[i]);
        }
        return result;
    }

    private void quickSort(int[] input, int p, int r) {
        if (p >= r) return;
        int q = partition(input, p, r);
        quickSort(input, p, q - 1);
        quickSort(input, q + 1, r);
    }

    private int partition(int[] input, int p, int r) {
        int pivot = input[r];
        int i = p;
        for (int j = p; j < r; ++j) {
            if (input[j] < pivot) {
                if (i == j) {
                    ++i;
                } else {
                    int tmp = input[i];
                    input[i++] = input[j];
                    input[j] = tmp;
                }
            }
        }
        int tmp = input[i];
        input[i] = input[r];
        input[r] = tmp;
        return i;
    }
}
