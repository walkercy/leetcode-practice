package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.ListNode;

/**
 * @author walker
 * @date 2020/05/01
 */
public class Solution_21 {

	/**
	 * 合并两个递增有序链表
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		// 先初始化最终链表的头节点，不要为null，否则得先给其赋值再进行遍历，或者遍历时需要判断是否为空
		ListNode head = new ListNode(0);
		// node节点一直向后移动
		ListNode node = head;
		while(l1 != null && l2 != null) {
			// 指向两个链表中更小的那个节点
			if (l1.val <= l2.val) {
				node.next = l1;
				l1 = l1.next;
			} else {
				node.next = l2;
				l2 = l2.next;
			}
			// 向后移动
			node = node.next;
		}
		// 至少一个链表遍历完成，因为递增，直接指向另外一个链表
		node.next = l1 == null ? l2 : l1;
		// 初始化了无用的头节点，所以返回next
		return head.next;
	}

}
