package com.leetcode.algorithm.easy;

import com.leetcode.algorithm.TreeNode;

public class Solution_938 {

    /**
     * �ݹ�������ȱ���
     * @param root ����������
     * @param L ��Χ
     * @param R �ҷ�Χ
     * @return ��L,R��Χ�ڵ���ֵ��(����)
     */
    public int rangeSumBST(TreeNode root, int L, int R) {
        int result = 0;
        if (root == null) {
            return result;
        }
        // val�ڷ�Χ��ֱ���ۼӣ�������������������
        if (root.val >= L && root.val <= R) {
            result += root.val;
        }
        // ����R������������
        if (root.val >= L) {
            result += rangeSumBST(root.left, L, R);
        }
        // С��L������������
        if (root.val <= R) {
            result += rangeSumBST(root.right, L, R);
        }
        return result;
    }

}
