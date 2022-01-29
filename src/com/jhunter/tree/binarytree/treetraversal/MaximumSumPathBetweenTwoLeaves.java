package com.jhunter.tree.binarytree.treetraversal;

import com.jhunter.tree.binarytree.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

public class MaximumSumPathBetweenTwoLeaves {
    /*
        Given a binary tree, write an efficient algorithm to find the maximum sum of a path between any two leaves in it.
        Assume that the binary tree is not skewed and contains at-least two nodes.
        For example, the maximum sum path in the following binary tree is [8->5->3->6] 22:
        Binary Tree:
              1
            /   \
          2       3
           \     / \
           -4   5   6
               / \
              7   8
     */
    public static int getMaximumSumPathBetweenTwoLeaves(TreeNode root) {
        AtomicInteger maxSum = new AtomicInteger(Integer.MIN_VALUE);
        maximumSumPathBetweenTwoLeaves(root, maxSum);
        return maxSum.get();
    }

    public static int maximumSumPathBetweenTwoLeaves(TreeNode node, AtomicInteger maxSum) {
        if (node == null) return Integer.MIN_VALUE;

        int leftSum = maximumSumPathBetweenTwoLeaves(node.left, maxSum);
        int rightSum = maximumSumPathBetweenTwoLeaves(node.right, maxSum);

        int currentMax = Math.max(leftSum, rightSum);
        int current_sum = 0;
        if (currentMax == Integer.MIN_VALUE) {
            maxSum.set(Math.max(maxSum.get(), node.val));
            return node.val;
        } else if (currentMax != Integer.MIN_VALUE) {
            current_sum = node.val + leftSum + rightSum;
        } else {
            current_sum = node.val + leftSum != Integer.MIN_VALUE ? leftSum : rightSum;
        }
        maxSum.set(Math.max(maxSum.get(), current_sum));
        return node.val + currentMax;
    }
}
