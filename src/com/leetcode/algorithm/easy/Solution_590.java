package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * @author walker
 * @date 2020/02/08
 */
public class Solution_590 {

	/**
	 * n叉数递归后序遍历
	 * @param root
	 * @return
	 */
	public List<Integer> postorder(Node root) {
		List<Integer> result = new ArrayList<>();
		if (root != null) {
			if (root.children != null) {
				root.children.forEach(child -> result.addAll(postorder(child)));
			}
			result.add(root.val);
		}
		return result;
	}

}
