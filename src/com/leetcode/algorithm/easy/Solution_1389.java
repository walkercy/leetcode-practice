package com.leetcode.algorithm.easy;

public class Solution_1389 {

    public int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (index[i] < i) {
                System.arraycopy(ans, index[i], ans, index[i] + 1, i - index[i]);
            }
            ans[index[i]] = nums[i];
        }
        return ans;
    }

}
