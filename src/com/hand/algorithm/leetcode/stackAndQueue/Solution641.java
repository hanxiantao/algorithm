package com.hand.algorithm.leetcode.stackAndQueue;

/**
 * 641. 设计循环双端队列
 */
public class Solution641 {
}

class MyCircularDeque {
    private int[] array;
    private int front;
    private int rear;
    private int capacity;

    public MyCircularDeque(int k) {
        this.capacity = k + 1;
        this.array = new int[capacity];
        //头部指向第1个存放元素的位置
        //插入时，先减，再赋值
        //删除时，索引+1（注意取模）
        this.front = 0;
        //尾部指向下一个插入元素的位置
        //插入时，先赋值，再加
        //删除时，索引-1（注意取模）
        this.rear = 0;
    }

    public boolean insertFront(int value) {
        if (isFull()) return false;
        front = (front - 1 + capacity) % capacity;
        array[front] = value;
        return true;
    }

    public boolean insertLast(int value) {
        if (isFull()) return false;
        array[rear] = value;
        rear = (rear + 1) % capacity;
        return true;
    }

    public boolean deleteFront() {
        if (isEmpty()) return false;
        front = (front + 1) % capacity;
        return true;
    }

    public boolean deleteLast() {
        if (isEmpty()) return false;
        rear = (rear - 1 + capacity) % capacity;
        return true;
    }

    public int getFront() {
        if (isEmpty()) return -1;
        return array[front];
    }

    public int getRear() {
        if (isEmpty()) return -1;
        return array[(rear - 1 + capacity) % capacity];
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public boolean isFull() {
        return (rear + 1) % capacity == front;
    }
}