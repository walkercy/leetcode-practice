package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.TreeNode;

public class Solution_938 {

    /**
     * 递归深度优先遍历
     * @param root 二叉搜索树
     * @param L 左范围
     * @param R 右范围
     * @return 在L,R范围内的数值和(包含)
     */
    public int rangeSumBST(TreeNode root, int L, int R) {
        int result = 0;
        if (root == null) {
            return result;
        }
        // val在范围内直接累加，并向下搜所左、右子树
        if (root.val >= L && root.val <= R) {
            result += root.val;
        }
        // 大于R的搜索左子树
        if (root.val >= L) {
            result += rangeSumBST(root.left, L, R);
        }
        // 小于L的搜索右子树
        if (root.val <= R) {
            result += rangeSumBST(root.right, L, R);
        }
        return result;
    }

}
