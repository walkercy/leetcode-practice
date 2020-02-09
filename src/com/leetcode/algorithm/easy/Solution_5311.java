package com.leetcode.algorithm.easy;

/**
 * @author walker
 * @date 2020/02/09
 */
public class Solution_5311 {

	public int numberOfSteps (int num) {
		int result = 0;
		while (num > 0) {
			num = num % 2 == 0 ? num / 2 : num - 1;
			result++;
		}
		return result;
	}

}
