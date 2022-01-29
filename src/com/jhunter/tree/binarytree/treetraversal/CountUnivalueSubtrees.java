package com.jhunter.tree.binarytree.treetraversal;

import com.jhunter.tree.binarytree.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

public class CountUnivalueSubtrees {
    /*
        https://leetcode.com/problems/count-univalue-subtrees/
        https://www.techiedelight.com/count-subtrees-value-nodes-binary-tree/
        Given the root of a binary tree, return the number of uni-value subtrees.
        A uni-value subtree means all nodes of the subtree have the same value.
     */

    // The main function to count all subtrees having the same value of nodes
    public static int getCountOfUnivalueSubtrees(TreeNode root) {
        // using `AtomicInteger` to get the result since `Integer` is passed by value
        // in Java
        AtomicInteger count = new AtomicInteger(0);
        countSubtrees(root, count);

        return count.get();
    }

    // The helper function to count all subtrees having the same value of nodes.
    // The function returns the root node's value if all nodes in the subtree
    // rooted at root have the same values; otherwise, it returns infinity
    public static int countSubtrees(TreeNode root, AtomicInteger count)
    {
        // base case: empty tree
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        // if the root is a leaf node, increase the count and return root node data
        if (root.left == null && root.right == null)
        {
            count.incrementAndGet();
            return root.val;
        }

        // recur for the left and right subtree
        int left = countSubtrees(root.left, count);
        int right = countSubtrees(root.right, count);

        // 1. The left subtree is empty, and the right subtree data matches the root
        // 2. The right subtree is empty, and the left subtree data matches the root
        // 3. Both left and right subtrees are non-empty, and their data matches root

        if ((left == Integer.MIN_VALUE && right == root.val) ||
                (right == Integer.MIN_VALUE && left == root.val) ||
                (left == right && left == root.val))
        {
            // increase the count and return root node data
            count.incrementAndGet();
            return root.val;
        }

        // return infinity if root's data doesn't match with left or right subtree
        return Integer.MAX_VALUE;
    }
}
