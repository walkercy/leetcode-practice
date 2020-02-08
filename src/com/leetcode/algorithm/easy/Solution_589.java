package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author walker
 * @date 2020/02/08
 */
public class Solution_589 {

	/**
	 * N叉树递归前序遍历
	 * @param root
	 * @return
	 */
	public List<Integer> preorder(Node root) {
		List<Integer> result = new ArrayList<>();
		if (root != null) {
			result.add(root.val);
			if (root.children != null) {
				root.children.forEach(child -> result.addAll(preorder(child)));
			}
		}
		return result;
	}

}
