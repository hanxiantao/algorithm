package com.hand.algorithm.offer;

/**
 * 链表中环的入口结点：
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null
 */
public class Solution55 {
    /**
     * 快慢指针
     *
     * @param pHead
     * @return
     */
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ListNode fast = pHead, slow = pHead;
        boolean flag = false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                flag = true;
                break;
            }
        }
        if (!flag) return null;
        fast = pHead;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
