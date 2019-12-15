package com.leetcode.algorithm.easy;

public class Solution_1281 {

    public int subtractProductAndSum(int n) {
        int product = 1;
        int add = 0;
        while (n > 0) {
            int num = n % 10;
            product *= num;
            add += num;
            n /= 10;
        }
        return product - add;
    }

}
