package com.leetcode.algorithm.easy;

public class Solution_LCP1 {

    public int game(int[] guess, int[] answer) {
        int result = 0;
        // �������飬�����Ϊ0˵����ͬ
        for (int i = 0; i < 3; i++) {
            if ((guess[i] ^ answer[i]) == 0)
                result++;
        }
        return result;
    }

}
