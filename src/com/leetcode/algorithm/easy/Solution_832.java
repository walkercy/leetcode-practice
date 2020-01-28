package com.leetcode.algorithm.easy;

/**
 * @author walker
 * @date 2020/01/26
 */
public class Solution_832 {

	public int[][] flipAndInvertImage(int[][] A) {
		int len = A[0].length;
		int[][] result = new int[A.length][len];
		for (int i = 0; i < A.length; i++) {
			for (int j = len - 1; j >= 0; j--) {
				result[i][len - 1 - j] = A[i][j] ^ 1;
			}
		}
		return result;
	}

}
