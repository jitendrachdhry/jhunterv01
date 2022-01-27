package com.jhunter.tree.binarytree.treetraversal;

import com.jhunter.tree.binarytree.TreeNode;

public class TruncateABinaryTreeHavingSumLessThanK {
    /*
        https://www.techiedelight.com/truncate-given-binary-tree-remove-nodes-lie-path-sum-less-k/
        https://leetcode.com/problems/insufficient-nodes-in-root-to-leaf-paths/submissions/
        Given a binary tree and a number k, remove nodes from the tree which lie on a complete path having a sum less than k.
        A complete path in a binary tree is defined as a path from the root to a leaf. The sum of all nodes on that path is defined as the sum of that path.

                  6                                             6
                /   \                                            \
              3       8                                           8
                    /   \           k=20 ==>                     /
                  4       2                                    4
                /   \      \                                    \
              1       7      3                                  7
     */
    public static TreeNode truncateABinaryTreeHavingSumLessThanK(TreeNode root, int k) {
        if (root == null) return root;
        root = truncate(root, 0, k);
        return root;
    }

    public static TreeNode truncate(TreeNode node, int sum, int k) {
        if (node == null) return null;
        sum += node.val;
        if (node.left == null && node.right == null) {
            if (sum >= k) {
                return node;
            }
            return null;
        }

        node.left = truncate(node.left, sum, k);
        node.right = truncate(node.right, sum, k);
        if (node.left != null || node.right != null)
            return node;
        return null;
    }
}
