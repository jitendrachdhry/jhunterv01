package com.jhunter.tree.binarytree;

import java.util.Stack;

public class IdenticalBinaryTree {
    /*
        Write an efficient algorithm to check if two binary trees are identical or not. Two binary trees are identical if they have identical structure and their contents are also the same.
        Input:
               1                        1
            /     \                  /     \
           2       3                2       3
         /   \   /   \            /   \   /   \
        4     5 6     7          4     5 6     7

        Output: True
        Explanation: Both binary trees have the same structure and contents.

        Input:
                   1                        1
                /     \                  /     \
               2       3                2       3
             /   \   /   \            /   \   /
            4     5 6     7          4     5 6

        Output: False
        Explanation: Both binary trees have different structures.

        Input:
                   1                        1
                /     \                  /     \
               2       3                2       3
             /   \   /   \            /   \   /   \
            4     5 6     7          4     5 6     8

        Output: False
        Explanation: Both binary trees have the same structure but differ in nodes’ values.
     */

    public static boolean isIdentical(BinaryTreeNode x, BinaryTreeNode y) {
        if (x == null && y == null) return true;
        if (x == null || y == null) return false;

        Stack<BinaryTreeNode> stackX = new Stack<BinaryTreeNode>();
        Stack<BinaryTreeNode> stackY = new Stack<BinaryTreeNode>();

        stackX.push(x);
        stackY.push(y);

        while (!stackX.isEmpty() || !stackY.isEmpty()) {
            BinaryTreeNode nodeX = stackX.pop();
            BinaryTreeNode nodeY = stackY.pop();

            if(nodeX.val != nodeY.val) return false;

            if((nodeX.left == null && nodeY.left != null) || (nodeX.right == null && nodeY.right != null) || (nodeY.left == null && nodeX.left != null) || (nodeY.right == null && nodeX.right != null)) {
                return false;
            }
            if(nodeX.left != null) {
                stackX.push(nodeX.left);
                stackY.push(nodeY.left);
            }

            if(nodeX.right != null) {
                stackX.push(nodeX.right);
                stackY.push(nodeY.right);
            }
        }
        return true;
    }
}
