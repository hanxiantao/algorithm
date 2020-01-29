package com.hand.algorithm.leetcode.linkedList;

/**
 * [206. 反转链表](https://leetcode-cn.com/problems/reverse-linked-list/)
 */
public class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
    }
}
