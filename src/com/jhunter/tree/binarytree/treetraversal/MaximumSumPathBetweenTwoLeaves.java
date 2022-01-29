package com.jhunter.tree.binarytree.treetraversal;

import com.jhunter.tree.binarytree.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

public class MaximumSumPathBetweenTwoLeaves {
    /*
        https://www.techiedelight.com/find-maximum-sum-path-between-two-leaves-in-a-binary-tree/
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
        findMaximumSumPathBetweenTwoLeaves(root, maxSum);
        return maxSum.get();
    }

    // Recursive function to find the maximum sum path between two leaves
    // in a binary tree
    public static int findMaximumSumPathBetweenTwoLeaves(TreeNode node, AtomicInteger maxSum) {
        if (node == null) return Integer.MIN_VALUE;

        // find the maximum sum node-to-leaf path starting from the left child
        int leftSum = findMaximumSumPathBetweenTwoLeaves(node.left, maxSum);
        // find the maximum sum node-to-leaf path starting from the right child
        int rightSum = findMaximumSumPathBetweenTwoLeaves(node.right, maxSum);

        // find max sum from left and right node.
        int currentMax = Math.max(leftSum, rightSum);
        int current_sum = 0; // find the maximum sum path "through" the current node

        if (currentMax == Integer.MIN_VALUE) { // check if both node (left and right) are null
            maxSum.set(Math.max(maxSum.get(), node.val));
            return node.val;
        } else if (currentMax != Integer.MIN_VALUE) { // check if both node (left and right) are not null
            current_sum = node.val + leftSum + rightSum;
        } else { // check if one of the node is not null
            current_sum = node.val + leftSum != Integer.MIN_VALUE ? leftSum : rightSum;
        }

        // update the maximum sum path found so far (Note that maximum sum path "excluding" the current node in the subtree
        // rooted at the current node is already updated as we are doing postorder traversal)
        maxSum.set(Math.max(maxSum.get(), current_sum));

        // case 3: both left and right child exists
        return node.val + currentMax;
    }
}
