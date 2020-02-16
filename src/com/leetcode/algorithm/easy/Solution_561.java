package com.leetcode.algorithm.easy;

import java.util.Arrays;

/**
 * @author walker
 * @date 2020/02/16
 */
public class Solution_561 {

	public int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int result = 0;
		for (int i = 0; i < nums.length; i += 2) {
			result += nums[i];
		}
		return result;
	}

}
