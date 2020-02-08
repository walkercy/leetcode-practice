package com.leetcode.algorithm.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author walker
 * @date 2020/02/08
 */
public class Solution_728 {

	public List<Integer> selfDividingNumbers(int left, int right) {
		List<Integer> result = new ArrayList<>();
		for (int i = left; i <= right; i++) {
			int num = i;
			boolean flag = true;
			while (num != 0) {
				if (num % 10 == 0 || i % (num % 10) != 0) {
					flag = false;
				}
				num /= 10;
			}
			if (flag) {
				result.add(i);
			}
		}
		return result;
	}

}
