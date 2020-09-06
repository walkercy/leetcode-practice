package com.leetcode.algorithm.easy;

import java.util.HashMap;
import java.util.Map;

public class Solution_1 {

    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        Map<Integer, Integer> map = new HashMap<>(nums.length, 1);
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(target - nums[i]);
            if (index != null && index != i) {
                ans[0] = i;
                ans[1] = index;
                return ans;
            }
        }
        return ans;
    }

}
