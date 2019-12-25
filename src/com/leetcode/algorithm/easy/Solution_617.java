package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.TreeNode;

/**
 * �ϲ�����������
 */
public class Solution_617 {

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        int val = t1 == null ? t2.val : t2 == null ? t1.val : t1.val + t2.val;
        // û��Ҫ��newһ��node
        TreeNode node = new TreeNode(val);
        TreeNode l1 = t1 == null ? null : t1.left;
        TreeNode r1 = t1 == null ? null : t1.right;
        TreeNode l2 = t2 == null ? null : t2.left;
        TreeNode r2 = t2 == null ? null : t2.right;
        node.left = mergeTrees(l1, l2);
        node.right = mergeTrees(r1, r2);
        return node;
    }

    /**
     * �ٷ����
     * @param t1
     * @param t2
     * @return
     */
    public TreeNode mergeTrees1(TreeNode t1, TreeNode t2) {
        // t1Ϊ�շ���t2��t2Ϊ�շ���t1
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        // t1 t2 ����Ϊ��
        t1.val += t2.val;
        t1.left = mergeTrees1(t1.left, t2.left);
        t1.right = mergeTrees1(t1.right, t2.right);
        return t1;
    }

}
