package com.leetcode.algorithm.easy;

/**
 * 顺时针打印矩阵
 */
public class Solution_interview_29 {

    public int[] spiralOrder(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return new int[0];
        }
        int length = matrix.length * matrix[0].length;
        int[] ans = new int[length];
        int top = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        int left = 0;
        int i = 0;
        while (true) {
            for (int j = left; j <= right; j++) {
                ans[i++] = matrix[top][j];
            }
            if (++top > bottom) {
                break;
            }
            for (int j = top; j <= bottom; j++) {
                ans[i++] = matrix[j][right];
            }
            if (--right < left) {
                break;
            }
            for (int j = right; j >= left; j--) {
                ans[i++] = matrix[bottom][j];
            }
            if (--bottom < top) {
                break;
            }
            for (int j = bottom; j >= top; j--) {
                ans[i++] = matrix[j][left];
            }
            if (++left > right) {
                break;
            }
        }
        return ans;
    }

}
