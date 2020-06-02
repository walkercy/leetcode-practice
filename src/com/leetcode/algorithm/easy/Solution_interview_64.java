package com.leetcode.algorithm.easy;

/**
 * 求1+2+3+...+n的和，不允许使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）
 * 1<=n<=10000
 */
public class Solution_interview_64 {

    /**
     * 采用递归的方式，累加结果，由于不能使用if, 递归的退出条件由 n > 0 和 && 控制，当递归到 n == 0时，返回累加结果
     * @param n
     * @return
     */
    public int sumNums(int n) {
        boolean temp = n > 0 && (n += sumNums(n - 1)) > 0;
        return n;
    }

}
