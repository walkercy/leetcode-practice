package com.leetcode.algorithm.easy;

public class Solution_1221 {

    public int balancedStringSplit(String s) {
        int result = 0;
        int r = 0;
        int l = 0;
        for (char c : s.toCharArray()) {
            if (c == 'R') {
                r++;
            } else {
                l++;
            }
            if (r == l) {
                result++;
                r = l = 0;
            }
        }
        return result;
    }

}
