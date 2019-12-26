package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.TreeNode;

/**
 * ��ת������
 */
public class Solution_226 {

    public TreeNode invertTree(TreeNode root) {
        // �ݹ齻������������ֱ������Ϊnull
        if (root != null) {
            TreeNode left = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(left);
        }
        return root;
    }

}
