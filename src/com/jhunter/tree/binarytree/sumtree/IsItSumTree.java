package com.jhunter.tree.binarytree.sumtree;

import com.jhunter.tree.binarytree.TreeNode;

public class IsItSumTree {
    /*
        https://www.techiedelight.com/check-given-binary-tree-sum-tree-not/
        Given a binary tree, check if it is a sum tree or not. In a sum tree, each non-leaf node’s value is equal to the sum of all elements present in its left and right subtree.
        The value of a leaf node can be anything and the value of an empty child node is considered to be 0.

        Construct the following tree.
                 44 (4+5+9) + (6+7+13)
                /  \
               /    \
        (4+5) 9     13 (6+7)
             / \    / \
            4   5  6   7
     */
    public static int findSumTreeOfANode(TreeNode node, boolean[] res) {
        if (node == null || res[0] == false) return 0;
        if (node.left == null && node.right == null) return node.val;
        int leftSum = findSumTreeOfANode(node.left, res);
        int rightSum = findSumTreeOfANode(node.right, res);
        if (leftSum + rightSum != node.val) {
            res[0] = false;
            return 0;
        }
        return node.val + leftSum + rightSum;
    }

    public static boolean isItSumTree(TreeNode root) {
        if (root == null) return false;
        boolean[] res = {true};
        findSumTreeOfANode(root, res);
        return res[0];
    }
}
