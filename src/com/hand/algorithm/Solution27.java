package com.hand.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * 字符串的排列：
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba
 * <p>
 * 输入描述：
 * 输入一个字符串,长度不超过9（可能有字符重复）,字符只包括大小写字母
 */
public class Solution27 {
    /**
     * 回溯法
     *
     * @param str
     * @return
     */
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<>();
        if (str == null || str.length() == 0) return result;
        HashSet<String> set = new HashSet<>();
        helper(set, str.toCharArray(), 0);
        result.addAll(set);
        Collections.sort(result);
        return result;
    }

    private void helper(HashSet<String> set, char[] charArray, int k) {
        if (k == charArray.length - 1) {
            set.add(new String(charArray));
            return;
        }
        for (int i = k; i < charArray.length; ++i) {
            swap(charArray, i, k);
            helper(set, charArray, k + 1);
            swap(charArray, i, k);
        }

    }

    private void swap(char[] charArray, int i, int k) {
        if (i != k) {
            char tmpChar = charArray[i];
            charArray[i] = charArray[k];
            charArray[k] = tmpChar;
        }
    }
}
