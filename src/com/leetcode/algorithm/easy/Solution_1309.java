package com.leetcode.algorithm.easy;

/**
 * @author walker
 * @date 2020/01/06
 */
public class Solution_1309 {

	public String freqAlphabets(String s) {
		StringBuilder result = new StringBuilder();
		String[] array = s.split("#");
		for (int i = 0; i < array.length; i++) {
			if(i >= 1 && i == array.length - 1 && !s.endsWith("#")) {
				for (String c : array[i].split("")) {
					result.append((char) ('a' + Integer.parseInt(c) - 1));
				}
				break;
			}
			int length = array[i].length();
			if (length == 2) {
				result.append((char) ('a' + Integer.parseInt(array[i]) - 1));
			} else {
				for (String c : array[i].substring(0, length - 2).split("")) {
					result.append((char) ('a' + Integer.parseInt(c) - 1));
				}
				result.append((char) ('a' + Integer.parseInt(array[i].substring(length - 2, length)) - 1));
			}
		}
		return result.toString();
	}

}
