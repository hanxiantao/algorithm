package com.hand.algorithm.leetcode.linkedList;

/**
 * 142. 环形链表 II
 */
public class Solution142 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        Boolean flag = false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                flag = true;
                break;
            }
        }
        if (!flag) return null;
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
