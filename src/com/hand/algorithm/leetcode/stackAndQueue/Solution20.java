package com.hand.algorithm.leetcode.stackAndQueue;

import java.util.Stack;

/**
 * 20. 有效的括号
 */
public class Solution20 {
    public boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char current : charArray) {
            if (stack.empty()) {
                stack.push(current);
            } else if (check(stack.peek(), current)) {
                stack.pop();
            } else {
                stack.push(current);
            }
        }
        return stack.empty();
    }

    private boolean check(char last, char current) {
        return (last == '(' && current == ')') ||
                (last == '[' && current == ']') ||
                (last == '{' && current == '}');
    }
}
