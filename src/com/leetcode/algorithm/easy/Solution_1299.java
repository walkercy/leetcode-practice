package com.leetcode.algorithm.easy;

/**
 * @author walker
 * @date 2020/02/07
 */
public class Solution_1299 {

	/**
	 * 按照题意暴力循环法
	 * @param arr
	 * @return
	 */
	public int[] replaceElements(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
			for (int j = i + 2; j < arr.length; j++) {
				if (arr[j] > arr[i]) {
					arr[i] = arr[j];
				}
			}
		}
		arr[arr.length - 1] = -1;
		return arr;
	}

	/**
	 * 大佬题解
	 * @param arr
	 * @return
	 */
	public int[] replaceElements2(int[] arr) {
		// 当前元素（length - 1）右边最大值
		int rmax = arr[arr.length - 1];
		arr[arr.length - 1] = -1;
		for (int i = arr.length - 2; i >= 0; i--) {
			// 暂存当前元素
			int temp = arr[i];
			// 当前元素替换为其右边最大值
			arr[i] = rmax;
			// 如果当前元素大于其右边最大值，则更新rmax
			if (temp > rmax) {
				rmax = temp;
			}
		}
		return arr;
	}

}
