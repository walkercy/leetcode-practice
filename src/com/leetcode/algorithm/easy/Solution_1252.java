package com.leetcode.algorithm.easy;

/**
 * @author walker
 * @date 2020/01/02
 */
public class Solution_1252 {

	public int oddCells(int n, int m, int[][] indices) {
		int[][] array = new int[n][m];
		int result = 0;
		for (int i = 0; i < indices.length; i++) {
			// 行自增
			for (int j = 0; j < m; j++) {
				array[indices[i][0]][j]++;
				result += array[indices[i][0]][j] % 2 != 0 ? 1 : -1;
			}
			// 列自增
			for (int j = 0; j < n; j++) {
				array[j][indices[i][1]]++;
				result += array[j][indices[i][1]] % 2 != 0 ? 1 : -1;
			}
		}
		return result;
	}

}
