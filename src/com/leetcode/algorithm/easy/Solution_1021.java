package com.leetcode.algorithm.easy;

/**
 * @author walker
 * @date 2020/01/04
 */
public class Solution_1021 {

	public String removeOuterParentheses(String S) {
		int l = 0;
		int r = 0;
		StringBuilder result = new StringBuilder();
		StringBuilder sb = new StringBuilder();
		for (char c : S.toCharArray()) {
			if (c == '(') {
				l++;
			}
			if (c == ')') {
				r++;
			}
			if (l == r) {
				sb.deleteCharAt(0);
				result.append(sb);
				sb.delete(0, sb.length());
			} else {
				sb.append(c);
			}
		}
		return result.toString();
	}

}
