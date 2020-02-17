package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.TreeNode;

import java.util.Arrays;

/**
 * @author walker
 * @date 2020/02/17
 */
public class Solution_108 {

	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums.length == 0) {
			return null;
		}
		int mid = nums.length / 2;
		TreeNode head = new TreeNode(nums[mid]);
		if (nums.length > 1) {
			head.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
			if (mid + 1 < nums.length) {
				head.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, nums.length));
			}
		}
		return head;
	}

}
