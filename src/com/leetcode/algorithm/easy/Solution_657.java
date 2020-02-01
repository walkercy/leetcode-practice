package com.leetcode.algorithm.easy;

/**
 * @author walker
 * @date 2020/02/01
 */
public class Solution_657 {

	public boolean judgeCircle(String moves) {
		int horizontal = 0;
		int vertical = 0;
		for (char c : moves.toCharArray()) {
			if (c == 'L') {
				vertical++;
			} else if (c == 'R') {
				vertical--;
			} else if (c == 'U') {
				horizontal++;
			} else if (c == 'D') {
				horizontal--;
			}
		}
		return horizontal == 0 && vertical == 0;
	}

}
