package com.jhunter.tree.binarytree.balancedbinarytree;

import com.jhunter.tree.binarytree.TreeNode;

import java.util.concurrent.atomic.AtomicBoolean;

public class HeightBalancedBinaryTree {
    /*
        Given a binary tree, determine if it is height-balanced.
        For this problem, a height-balanced binary tree is defined as:
        a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

        Height Balanced Tree:
                  1
                /   \
              2       3
             / \     /
            4   5   6
          /  \
         7   8

        Not a Height Balanced Tree:
                  1
                /   \
              2       3
             / \
            4   5
          /  \
         7   8
     */

    public static boolean isItHeightBalancedTree(TreeNode root) {
        AtomicBoolean isBalanced = new AtomicBoolean(true);
        isItHeightBalanced(root, isBalanced);
        return isBalanced.get();
    }

    public static int isItHeightBalanced(TreeNode node, AtomicBoolean isBalanced) {
        if (node == null) {
            return 0;
        }
        int leftHeight = isItHeightBalanced(node.left, isBalanced);
        int rightHeight = isItHeightBalanced(node.right, isBalanced);
        if (Math.abs(leftHeight - rightHeight) > 1) {
            isBalanced.set(false);
        }
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
