package com.hand.algorithm;

/**
 * 链表中倒数第k个结点：
 * 输入一个链表，输出该链表中倒数第k个结点
 */
public class Solution14 {
    /**
     * 思路：快慢指针
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode FindKthToTail(ListNode head, int k) {
        ListNode fast = head, slow = head;
        for (int i = 0; i < k; ++i) {
            if (fast == null) return null;
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
