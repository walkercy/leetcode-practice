package com.leetcode.algorithm.easy;

public class Solution_771 {

    public int numJewelsInStones(String J, String S) {
        int result = 0;
        for (int i = 0; i < S.length(); i++) {
            if (J.indexOf(S.charAt(i)) != -1)
                result++;
        }
        return result;
    }

}
