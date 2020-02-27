package com.leetcode.algorithm.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author walker
 * @date 2020/02/27
 */
public class Solution_349 {

	public int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set = new HashSet<>();
		for (int num : nums1) {
			set.add(num);
		}

		List<Integer> list = new ArrayList<>();
		for (int num : nums2) {
			if (set.remove(num)) {
				list.add(num);
			}
		}

		int[] result = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = list.get(i);
		}
		return result;
	}

}
