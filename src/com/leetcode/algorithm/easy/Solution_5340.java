package com.leetcode.algorithm.easy;

/**
 * @author walker
 * @date 2020/02/16
 */
public class Solution_5340 {

	public int countNegatives(int[][] grid) {
		int result = 0;
		for (int i = 0; i < grid.length; i++) {
			int row = 0;
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] >= 0) {
					row++;
				} else {
					result += (grid[i].length - row);
					break;
				}
			}
		}
		return result;
	}

}
