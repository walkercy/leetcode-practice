package com.leetcode.algorithm.easy;

import java.util.Arrays;

/**
 * @author walker
 * @date 2020/02/13
 */
public class Solution_1051 {

	/**
	 * 暴力法，copy数组，排序原数组，比较不同的元素个数
	 * @param heights
	 * @return
	 */
	public int heightChecker(int[] heights) {
		int[] copy = Arrays.copyOf(heights, heights.length);
		Arrays.sort(heights);
		int result = 0;
		for (int i = 0; i < heights.length; i++) {
			if (heights[i] != copy[i]) {
				result++;
			}
		}
		return result;
	}

	/**
	 * 评论题解
	 * @param heights
	 * @return
	 */
	public int heightChecker2(int[] heights) {
		// 题目指明了范围1 <= heights[i] <= 100，1 <= heights.length <= 100
		int[] array = new int[101];
		// 按递增顺序统计heights数组各元素有几个
		// array数组的下标就是heights数组的元素，下标的元素就是heights数组元素的个数
		for (int height : heights) {
			array[height]++;
		}
		int result = 0;
		int j = 0;
		for (int i = 1; i < array.length; i++) {
			while (array[i]-- > 0) {
				if (heights[j++] != i) {
					result++;
				}
			}
		}
		return result;
	}

}
