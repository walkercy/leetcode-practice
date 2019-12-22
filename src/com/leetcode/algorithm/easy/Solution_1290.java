package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.ListNode;

public class Solution_1290 {

    public int getDecimalValue(ListNode head) {
        int result = 0;
        while(head != null) {
            result = (result << 1) + head.val;
            head = head.next;
        }
        return result;
    }

}
