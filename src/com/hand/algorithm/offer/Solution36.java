package com.hand.algorithm.offer;

/**
 * 两个链表的第一个公共结点：
 * 输入两个链表，找出它们的第一个公共结点
 */
public class Solution36 {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if (pHead1 == null || pHead2 == null) return null;
        ListNode p1 = pHead1, p2 = pHead2;
        while (p1 != p2) {
            p1 = p1 == null ? pHead1 : p1.next;
            p2 = p2 == null ? pHead2 : p2.next;
        }
        return p1;
    }
}
