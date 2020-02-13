package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.ListNode;

/**
 * @author walker
 * @date 2020/02/13
 */
public class Solution_206 {

	public ListNode reverseList(ListNode head) {
		ListNode node = null;
		ListNode next;
		while (head != null) {
			next = head.next;
			head.next = node;
			node = head;
			head = next;
		}
		return node;
	}

}
