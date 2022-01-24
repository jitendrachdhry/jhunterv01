package com.jhunter.tree.binarytree;

public class ConvertBinaryTreeToItsMirror {
    /*
        https://www.techiedelight.com/convert-binary-tree-to-its-mirror/
        Given a binary tree, write an efficient algorithm to convert the binary tree into its mirror.
                  1                         1
               /     \                   /     \
              2       3                 3      2
             / \     / \               / \    / \
            4   5   6   7             7   6  5   4
     */

    public static void swapNode(BinaryTreeNode node) {
        if (node == null) return;
        BinaryTreeNode tempNode = node.left;
        node.left = node.right;
        node.right = tempNode;
        swapNode(node.left);
        swapNode(node.right);
    }

    public static void convertBinaryTreeToItsMirror(BinaryTreeNode root) {
        if (root == null) return;
        swapNode(root);
        System.out.println(" swap tree done. ");
    }
}
