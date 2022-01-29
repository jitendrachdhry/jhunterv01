package com.jhunter.tree.binarytree.constructbinarytree;

import com.jhunter.tree.binarytree.TreeNode;

import java.util.concurrent.atomic.AtomicInteger;

public class ConstructFullBinaryTreeFomThePreorderSequenceWithLeafNodeInformation {
    /*
        https://www.techiedelight.com/construct-full-binary-tree-from-preorder-sequence-with-leaf-information/
        Construct a full binary tree from the preorder sequence with leaf node information
        Write an efficient algorithm to construct a full binary tree from a sequence of keys representing preorder traversal
        and a boolean array that determines if the value at the corresponding index in the preorder sequence is a leaf node
        or an internal node. A full binary tree is a tree in which every node has either 0 or 2 children.

        Input:
        Preorder traversal : { 1, 2, 4, 5, 3, 6, 8, 9, 7 }
        Boolean array      : { 0, 0, 1, 1, 0, 0, 1, 1, 1 }
        (1 represents a leaf node, and 0 represents an internal node)

               1
            /     \
           2       3
         /   \   /   \
        4     5 6     7
              /   \
             8     9
     */

    public static TreeNode constructTree(int []preOrder, int isLeaf[]) {
        if(preOrder==null || preOrder.length <=0 || isLeaf==null || isLeaf.length <=0 || preOrder.length != isLeaf.length) return null;

        AtomicInteger idx = new AtomicInteger(0);
        return constructTree(preOrder, isLeaf, idx);
    }

    public static TreeNode constructTree(int []preOrder, int []isLeaf, AtomicInteger idx) {
        if(idx.get() >= isLeaf.length) return null;

        TreeNode root = new TreeNode(preOrder[idx.get()]);
        int isLeafNode = isLeaf[preOrder[idx.get()]];
        if(isLeafNode == 1) return root;

        idx.getAndIncrement();
        root.left = constructTree(preOrder, isLeaf, idx);
        idx.getAndIncrement();
        root.left = constructTree(preOrder, isLeaf, idx);
        return root;
    }

    public static void executeTestCases() {
        System.out.println("Binary Search Tree From Preorder Traversal - BEGIN ");
        TreeNode root = constructTree(new int[]{1, 2, 4, 5, 3, 6, 8, 9, 7}, new int[]{0, 0, 1, 1, 0, 0, 1, 1, 1 });
        System.out.println("BinarySearchTreeFromPreorderTraversal - END ");

    }
}
