package com.leetcode.algorithm.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author walker
 * @date 2020/05/01
 */
public class Solution_202 {

	/**
	 * 12 + 92 = 82
	 * 82 + 22 = 68
	 * 62 + 82 = 100
	 * 12 + 02 + 02 = 1
	 * 最终 == 1 为true
	 * @param n
	 * @return
	 */
	public boolean isHappy(int n) {
		Set<Integer> set = new HashSet<>();
		while(n != 1 && !set.contains(n)) {
			set.add(n);
			int num = 0;
			while(n != 0) {
				int a = n % 10;
				n /= 10;
				num += a * a;
			}
			n = num;
		}
		return n == 1;
	}

}
