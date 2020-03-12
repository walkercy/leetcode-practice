package com.leetcode.algorithm.easy;

/**
 * @author walker
 * @date 2020/03/12
 */
public class Solution_1365 {

	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] result = new int[nums.length];
		int num = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int value : nums) {
				if (nums[i] > value) {
					num++;
				}
			}
			result[i] = num;
			num = 0;
		}
		return result;
	}

}
