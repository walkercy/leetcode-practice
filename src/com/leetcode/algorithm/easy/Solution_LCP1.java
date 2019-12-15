package com.leetcode.algorithm.easy;

public class Solution_LCP1 {

    public int game(int[] guess, int[] answer) {
        int result = 0;
        // 遍历数组，异或结果为0说明相同
        for (int i = 0; i < 3; i++) {
            if ((guess[i] ^ answer[i]) == 0)
                result++;
        }
        return result;
    }

}
