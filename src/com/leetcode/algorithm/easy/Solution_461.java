package com.leetcode.algorithm.easy;

/**
 * @author walker
 * @date 2020/01/07
 */
public class Solution_461 {

	public int hammingDistance(int x, int y) {
		int result = 0;
		int num = x ^ y;
		while (num != 0) {
			result += num & 1;
			num >>= 1;
		}
		return result;
	}

}
