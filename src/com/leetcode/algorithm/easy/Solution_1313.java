package com.leetcode.algorithm.easy;

/**
 * @author walker
 * @date 2020/01/31
 */
public class Solution_1313 {

	public int[] decompressRLElist(int[] nums) {
		int len = 0;
		// 先计算出数组长度
		for (int i = 0; i < nums.length; i += 2) {
			len += nums[i];
		}
		int[] result = new int[len];
		int index = 0;
		for (int i = 0; i < nums.length / 2; i++) {
			for (int j = 0; j < nums[2 * i]; j++) {
				result[index++] = nums[2 * i + 1];
			}
		}
		return result;
	}

}
