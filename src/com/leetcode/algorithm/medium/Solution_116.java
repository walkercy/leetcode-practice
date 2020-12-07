package com.leetcode.algorithm.medium;

import com.leetcode.algorithm.TreeNode;

public class Solution_116 {

    public TreeNode connect(TreeNode root) {
        if (root == null) {
            return null;
        }
        connectTwoNode(root.left, root.right);
        return root;
    }

    /**
     * 连接两个节点
     *
     * @param node1
     * @param node2
     */
    public void connectTwoNode(TreeNode node1, TreeNode node2) {
        if (node1 == null) {
            return;
        }
        node1.next = node2;
        connectTwoNode(node1.left, node1.right);
        connectTwoNode(node1.right, node2.right);
        connectTwoNode(node2.left, node2.right);
    }

}
