package com.jhunter.tree.binarytree.treetraversal;

import com.jhunter.tree.binarytree.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

public class MaximumDifferenceBetweenANodeAndItsDescendants {
    /*
        Given a binary tree, find the maximum difference between a node and its descendants in it. Assume that the binary tree contains at-least two nodes.

        Binary Tree:
          6
        /   \
       /     \
      3       8
            /   \
           /     \
          2       4
        /   \
       /     \
      1       7

      Output: 8 - 1 = 7
     */

    public static int findMaximumDifferenceBetweenANodeAndItsDescendants(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) { // check if tree is null or tree have less than two nodes.
            return 0;
        }
        AtomicInteger max = new AtomicInteger(Integer.MIN_VALUE);
        findMaximumDifference(root, max);
        return max.get();
    }

    public static int findMaximumDifference(TreeNode node, AtomicInteger max) {
        if (node == null) return Integer.MAX_VALUE;

        int left = findMaximumDifference(node.left, max);
        int right = findMaximumDifference(node.right, max);

        if (Math.min(left, right) != Integer.MAX_VALUE) {
            max.set(Math.max(max.get(), node.val - Math.min(left, right)));
        }
        return Math.min(Math.min(left, right), node.val);
    }
}
