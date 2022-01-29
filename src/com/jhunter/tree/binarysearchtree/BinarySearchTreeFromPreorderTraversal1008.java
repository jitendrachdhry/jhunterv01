package com.jhunter.tree.binarysearchtree;

import com.jhunter.tree.binarytree.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

public class BinarySearchTreeFromPreorderTraversal1008 {
    /*
        https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
        Given an array of integers preorder, which represents the preorder traversal of a BST (i.e., binary search tree), construct the tree and return its root.
        It is guaranteed that there is always possible to find a binary search tree with the given requirements for the given test cases.
        A binary search tree is a binary tree where for every node, any descendant of Node.left has a value strictly less than Node.val, and any descendant of Node.right has a value strictly greater than Node.val.
        A preorder traversal of a binary tree displays the value of the node first, then traverses Node.left, then traverses Node.right.

        Input: preorder = [8,5,1,7,10,12]
        Output: [8,5,10,1,7,null,12]
        BST:
             8
          /    \
         5     10
       /  \      \
      1   7      12
     */

    public static TreeNode constructBSTFromPreorder(int[] preOrderArr) {
        if (preOrderArr == null || preOrderArr.length == 0) return null;
        AtomicInteger currentIdx = new AtomicInteger(0);
        TreeNode root = constructBSTFromPreorder(preOrderArr, currentIdx, Integer.MAX_VALUE);
        return root;

    }

    public static TreeNode constructBSTFromPreorder(int[] preOrderArr, AtomicInteger currentIdx, int upperBound) {
        if (currentIdx.get() >= preOrderArr.length || preOrderArr[currentIdx.get()] > upperBound) return null;
        TreeNode nextNode = new TreeNode(preOrderArr[currentIdx.getAndIncrement()]);
        nextNode.left = constructBSTFromPreorder(preOrderArr, currentIdx, nextNode.val);
        nextNode.right = constructBSTFromPreorder(preOrderArr, currentIdx, upperBound);
        return nextNode;
    }

    public static void executeTestCases() {
        System.out.println("Binary Search Tree From Preorder Traversal - BEGIN ");
        TreeNode root = constructBSTFromPreorder(new int[]{8, 5, 1, 7, 10, 12});
        System.out.println("BinarySearchTreeFromPreorderTraversal - END ");

    }
}
