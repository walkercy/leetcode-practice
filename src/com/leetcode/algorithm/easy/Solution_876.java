package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 返回链表的中间节点
 * @author walker
 * @date 2020/03/23
 */
public class Solution_876 {

	public ListNode middleNode(ListNode head) {
		List<ListNode> list = new ArrayList<>();
		while (head != null) {
			list.add(head);
			head = head.next;
		}
		return list.get(list.size() / 2);
	}

	/**
	 * 快慢指针法
	 * @param head
	 * @return
	 */
	public ListNode slowFastNode(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

}
