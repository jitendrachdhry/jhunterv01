package com.jhunter.tree.binarytree;

public class BinaryTreeNode {
    // Definition for a binary tree node.
    public int val;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode() {
    }

    public BinaryTreeNode(int val) {
        this.val = val;
    }

    public BinaryTreeNode(int val, BinaryTreeNode left, BinaryTreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
