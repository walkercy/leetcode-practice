package com.leetcode.algorithm.binarytree;

import com.leetcode.algorithm.TreeNode;

public class Solution_101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return compareTowNode(root.left, root.right);
    }

    /**
     * 比较两个节点的值，不要跳进递归的细节中
     * 该方法只关注两个节点的值，剩下的交给递归来做
     * @param node1
     * @param node2
     * @return
     */
    public boolean compareTowNode(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.val == node2.val && compareTowNode(node1.left, node2.right)
                && compareTowNode(node1.right, node2.left);
    }

}
