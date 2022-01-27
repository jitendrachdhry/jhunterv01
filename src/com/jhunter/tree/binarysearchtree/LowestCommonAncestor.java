package com.jhunter.tree.binarysearchtree;

import com.jhunter.tree.binarytree.TreeNode;

public class LowestCommonAncestor {
    /*
        Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
        According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”
     */

    TreeNode findLowestCommonAncestorRecursive(TreeNode root, TreeNode nodeA, TreeNode nodeB) {
        if (root == null) return null;
        if (nodeA.val > root.val && nodeB.val > root.val)
            return findLowestCommonAncestorRecursive(root.right, nodeA, nodeB);
        else if (nodeA.val < root.val && nodeB.val < root.val)
            return findLowestCommonAncestorRecursive(root.left, nodeA, nodeB);
        else return root;
    }

    TreeNode findLowestCommonAncestorNonRecursive(TreeNode root, TreeNode nodeA, TreeNode nodeB) {
        if (root == null) return null;
        TreeNode ancestor = root;
        while (root != null) {
            if (nodeA.val > root.val && nodeB.val > root.val) {
                root = root.right;
                ancestor = root.right;
            } else if (nodeA.val < root.val && nodeB.val < root.val) {
                root = root.left;
                ancestor = root.left;
            } else {
                return root;
            }
        }
        return ancestor;
    }
}
