package com.hand.algorithm.leetcode.stackAndQueue;

import java.util.Stack;

/**
 * 155. 最小栈
 */
public class Solution155 {
}

class MinStack {

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.empty() || x <= minStack.peek()) {
            minStack.push(x);
        } else {
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        if (stack.empty()) return;
        stack.pop();
        minStack.pop();
    }

    public int top() {
        if (stack.empty()) throw new RuntimeException("栈为空");
        return stack.peek();
    }

    public int getMin() {
        if (stack.empty()) throw new RuntimeException("栈为空");
        return minStack.peek();
    }
}
