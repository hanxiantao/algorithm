package com.hand.algorithm.offer;

import java.util.HashMap;

/**
 * 复杂链表的复制：
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
 * 返回结果为复制后复杂链表的head
 * 注意：输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空
 */
public class Solution25 {
    /**
     * 思路：散列表
     *
     * @param pHead
     * @return
     */
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null) return null;
        RandomListNode p1 = pHead, p2 = pHead;
        //key为旧链表，value为新链表
        HashMap<RandomListNode, RandomListNode> map = new HashMap<>();
        while (p1 != null) {
            map.put(p1, new RandomListNode(p1.label));
            p1 = p1.next;
        }
        while (p2 != null) {
            if (p2.next != null) {
                map.get(p2).next = map.get(p2.next);
            } else {
                map.get(p2).next = null;
            }
            map.get(p2).random = map.get(p2.random);
            p2 = p2.next;
        }
        return map.get(pHead);
    }
}
