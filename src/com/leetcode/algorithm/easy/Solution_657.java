package com.leetcode.algorithm.easy;

/**
 * @author walker
 * @date 2020/02/01
 */
public class Solution_657 {

	public boolean judgeCircle(String moves) {
		int result = 0;
		for (char c : moves.toCharArray()) {
			result = result + ((c == 'U' || c == 'L') ? 1 : -1);
		}
		return result == 0;
	}

}
