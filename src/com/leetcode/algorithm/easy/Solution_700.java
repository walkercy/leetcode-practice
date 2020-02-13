package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.TreeNode;

/**
 * @author walker
 * @date 2020/02/13
 */
public class Solution_700 {

	public TreeNode searchBST(TreeNode root, int val) {
		return root == null || root.val == val ? root : val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
	}

}
