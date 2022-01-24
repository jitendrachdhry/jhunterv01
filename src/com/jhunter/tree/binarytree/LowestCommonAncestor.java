package com.jhunter.tree.binarytree;

public class LowestCommonAncestor {
    /*
        Given a binary tree and two nodes, x and y, find the lowest common ancestor (LCA) of x and y in it.
        The solution should return null if either x or y is not the actual node in the tree.

        The lowest common ancestor (LCA) of two nodes x and y in a binary tree is the lowest (i.e., deepest) node that has both x and y as descendants,
        where each node can be a descendant of itself (so if x is reachable from w, w is the LCA). In other words, the LCA of x and y is the shared ancestor
        of x and y that is located farthest from the root.

        For example, consider the following binary tree. Let x = 6 and y = 7.
        The common ancestors of nodes x and y are 1 and 3. Out of nodes 1 and 3, the LCA is 3 as it is farthest from the root.
        LCA(6,7) = 3
        LCA(3,6) = 3
        LCA(2,5) = 1

        Tree:
              1
           /     \
          2       3
           \     / \
            4   5   6
               / \
              7   8
     */

    BinaryTreeNode findLowestCommonAncestor(BinaryTreeNode root, BinaryTreeNode nodeA, BinaryTreeNode nodeB) {
        if (root == null) {
            return null;
        }
        if (nodeA == root || nodeB == root) return root;
        BinaryTreeNode left = findLowestCommonAncestor(root.left, nodeA, nodeB);
        BinaryTreeNode right = findLowestCommonAncestor(root.right, nodeA, nodeB);

        if (left != null && right != null) return root;
        return (left != null) ? left : right;
    }
}
