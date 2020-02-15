package com.leetcode.algorithm.easy;

/**
 * @author walker
 * @date 2020/02/15
 */
public class Solution_977 {

	/**
	 * 冒泡排序
	 * @param A
	 * @return
	 */
	public int[] sortedSquares(int[] A) {
		for (int i = 0; i < A.length; i++) {
			A[i] = A[i] * A[i];
		}
		if (A[0] > 0) {
			int tmp;
			for (int i = 0; i < A.length - 1; i++) {
				for (int j = i + 1; j < A.length; j++) {
					if (A[i] > A[j]) {
						tmp = A[i];
						A[i] = A[j];
						A[j] = tmp;
					}
				}
			}
		}
		return A;
	}

}
