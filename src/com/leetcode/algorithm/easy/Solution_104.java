package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * 计算二叉树最大深度
 */
public class Solution_104 {

    /**
     * DFS深度优先遍历
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        // 每一层都+1, 递归每个节点的左右子树
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    /**
     * 广度优先遍历
     * @param root
     * @return
     */
    public int maxDepthBFS(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 0;
        LinkedList<TreeNode> list = new LinkedList<>();
        list.add(root);
        while (!list.isEmpty()) {
            depth++;
            int length = list.size();
            // 把每一层的元素从队列中移除，并将其子树添加到队列中
            for (int i = 0; i < length; i++) {
                TreeNode node = list.pollFirst();
                if (node.left != null) {
                    list.add(node.left);
                }
                if (node.right != null) {
                    list.add(node.right);
                }
            }
        }
        return depth;
    }

}
