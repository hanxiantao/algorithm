package com.hand.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 数组中出现次数超过一半的数字：
 * 数组中有一个数字出现的次数超过数组长度的一半，
 * 请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}
 * 由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0
 */
public class Solution28 {
    /**
     * 解法1：排序
     *
     * @param array
     * @return
     */
    public int MoreThanHalfNum_Solution(int[] array) {
        Arrays.sort(array);
        int count = 0;
        for (int i : array) {
            if (i == array[array.length / 2]) {
                count++;
            }
        }
        if (count > array.length / 2) {
            return array[array.length / 2];
        } else {
            return 0;
        }
    }

    /**
     * 解法2：HashMap
     *
     * @param array
     * @return
     */
    public int MoreThanHalfNum_Solution2(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : array) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                int count = map.get(i);
                map.put(i, ++count);
            }
        }
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value > array.length / 2) return key;
        }
        return 0;
    }
}
