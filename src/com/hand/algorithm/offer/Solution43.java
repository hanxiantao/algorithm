package com.hand.algorithm.offer;

/**
 * 左旋转字符串：
 * 汇编语言中有一种移位指令叫做循环左移（ROL），现在有个简单的任务，就是用字符串模拟这个指令的运算结果
 * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出
 * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 */
public class Solution43 {
    /**
     * 1、先翻转前半部分
     * 2、再翻转后半部分
     * 3、再对字符串整个进行翻转
     *
     * @param str
     * @param n
     * @return
     */
    public String LeftRotateString(String str, int n) {
        if (str == null || str.length() == 0 || n < 0) return str;
        int length = str.length();
        n %= length;
        char[] chars = str.toCharArray();
        reverse(chars, 0, n - 1);
        reverse(chars, n, length - 1);
        reverse(chars, 0, length - 1);
        return new String(chars);
    }

    private void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}
