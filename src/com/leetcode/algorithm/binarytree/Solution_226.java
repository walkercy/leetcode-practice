package com.leetcode.algorithm.binarytree;

import com.leetcode.algorithm.TreeNode;

/**
 * 翻转二叉树
 */
public class Solution_226 {

    public TreeNode invertTree(TreeNode root) {
        // 递归交换左右子树，直到子树为null
        if (root != null) {
            TreeNode left = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(left);
        }
        return root;
    }

}
