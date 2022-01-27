package com.jhunter.tree.binarytree.sumtree;

import com.jhunter.tree.binarytree.TreeNode;

public class ConvertBinaryTreeToItsSumTree {
    /*
        https://www.techiedelight.com/inplace-convert-a-tree-sum-tree/
        Given a binary tree, in-place replace each node’s value to the sum of all elements present in its left and right subtree. You may assume the value of an empty child node to be 0.
                1                               11
              /   \                           /    \
             5    3          ==>             3     0
           /  \                            /  \
          2   1                           0   0
     */

    public static void convertBinaryTreeToItsSumTree(TreeNode btNode) {
        sumTreeNode(btNode);
    }

    public static int sumTreeNode(TreeNode bt) {
        if (bt == null) return 0;
        int copyVal = bt.val;
        bt.val = sumTreeNode(bt.left) + sumTreeNode(bt.right);
        return bt.val + copyVal;
    }
}
