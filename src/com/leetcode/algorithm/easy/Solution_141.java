package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.ListNode;

/**
 * 判断链表是否有环，快慢指针
 */
public class Solution_141 {

    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow.equals(fast)) {
                return true;
            }
        }
        return false;
    }

}
