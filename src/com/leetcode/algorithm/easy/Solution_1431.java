package com.leetcode.algorithm.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 拥有糖果最多的孩子
 */
public class Solution_1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // 第一次遍历找到最大值
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        // 第二次遍历判断每个元素加上extraCandies是否大于max
        List<Boolean> ans = new ArrayList<>(candies.length);
        for (int candy : candies) {
            ans.add(candy + extraCandies >= max);
        }
        return ans;
    }

}
