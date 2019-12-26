package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * ���������������
 */
public class Solution_104 {

    /**
     * DFS������ȱ���
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        // ÿһ�㶼+1, �ݹ�ÿ���ڵ����������
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    /**
     * ������ȱ���
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
            // ��ÿһ���Ԫ�شӶ������Ƴ���������������ӵ�������
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
