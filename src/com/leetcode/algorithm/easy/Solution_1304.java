package com.leetcode.algorithm.easy;

/**
 * @author walker
 * @date 2020/01/01
 */
public class Solution_1304 {

	public int[] sumZero(int n) {
		int[] result = new int[n];
		for (int i = 1; i <= n; i += 2) {
			if (i + 1 <= n) {
				result[i - 1] = i;
				result[i] = -i;
			}
		}
		return result;
	}

}
