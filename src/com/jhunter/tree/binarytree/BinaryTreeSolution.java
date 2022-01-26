package com.jhunter.tree.binarytree;

public class BinaryTreeSolution {
    /*
        YouTube: https://www.youtube.com/watch?v=_ANrF3FJm7I&list=PLgUwDviBIf0q8Hkd7bK2Bpryj2xVJk8Vk&index=2
         Medium: https://medium.com/techie-delight/binary-tree-interview-questions-and-practice-problems-439df7e5ea1f

        A Binary Tree is one of the most typical tree structure. As the name suggests, a binary tree is a tree data structure in which each node has at most two children, which are referred to as the left child and the right child.

                   1                        1
                /     \                  /     \
               2       3                2       3
             /   \   /   \            /   \   /
            4     5 6     7          4     5 6

        Type of Tree:
        1. Full Binary Tree
        2. Complete Binary Tree
        3. Perfect Binary Tree
        4. Balanced Binary Tree
        5. Degenerate Binary Tree
   */

    BinaryTreeNode treeNode = null;

    public BinaryTreeSolution(int[] arr) {
        if (arr != null && arr.length > 0) {
            int halfLength = arr.length / 2;
            for (int left = halfLength, right = halfLength + 1; left >= 0; left--, right++) {
                if (treeNode == null) {
                    treeNode = new BinaryTreeNode(arr[left]);
                } else {
                    insert(arr[left]);
                }

                if (right < arr.length) {
                    insert(arr[right]);
                }
            }
        }
        System.out.println("BinaryTree Constructed !!!!");
    }

    public BinaryTreeNode getBinaryTreeRoot() {
        return treeNode;
    }

    void insert(int info) {
        BinaryTreeNode tempNode = treeNode;
        while (tempNode != null) {
            if (info < tempNode.val) {
                if (tempNode.left == null) {
                    tempNode.left = new BinaryTreeNode(info);
                    return;
                } else {
                    tempNode = tempNode.left;
                }
            } else {
                if (tempNode.right == null) {
                    tempNode.right = new BinaryTreeNode(info);
                    return;
                } else {
                    tempNode = tempNode.right;
                }
            }
        }
    }
}
