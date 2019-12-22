package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.ListNode;

public class Solution_237 {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
