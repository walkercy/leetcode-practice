package com.leetcode.algorithm.easy;

public class Solution_5291 {

    public int findNumbers(int[] nums) {
        int result = 0;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 == 0)
                result++;
        }
        return result;
    }

}
