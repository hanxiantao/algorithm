package com.hand.algorithm;

import java.util.ArrayList;

/**
 * 从尾到头打印链表：
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList
 */
public class Solution03 {
    /**
     * 解法1：非递归
     *
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<>();
        ListNode tmp = listNode;
        while (tmp != null) {
            result.add(0, tmp.val);
            tmp = tmp.next;
        }
        return result;
    }

    ArrayList<Integer> result = new ArrayList<>();

    /**
     * 解法2：递归
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        if (listNode != null) {
            printListFromTailToHead2(listNode.next);
            result.add(listNode.val);
        }
        return result;
    }
}
