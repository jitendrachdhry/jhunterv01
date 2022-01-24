package com.jhunter.tree.binarytree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

        Traverse A Tree:
        Understand the difference between different tree traversal methods;
        1. DFS
           - Be able to solve preorder (ROOT, LEFT, RIGHT), inorder(LEFT,ROOT, RIGHT) and postorder(LEFT, RIGHT, ROOT) traversal recursively;
           - Be able to solve preorder, inorder and postorder traversal iteratively;
        2. BFS
           - Be able to do level traversal using BFS.
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

    public List<Integer> getTreeWayPreOrder() {
        List<Integer> preOrderList = new ArrayList<>();
        preOrder(treeNode, preOrderList);
        return preOrderList;
    }

    /* Pre Order ( ROOT, LEFT, RIGHT ) */
    void preOrder(BinaryTreeNode node, List<Integer> preOrderList) {
        if (node == null) return;

        preOrderList.add(node.val);
        preOrder(node.left, preOrderList);
        preOrder(node.right, preOrderList);
    }

    public List<Integer> getTreeWayPostOrder() {
        List<Integer> preOrderList = new ArrayList<>();
        postOrder(treeNode, preOrderList);
        return preOrderList;
    }

    /* Post Order ( LEFT, RIGHT, ROOT ) */
    void postOrder(BinaryTreeNode node, List<Integer> postOrderList) {
        if (node == null) return;

        postOrder(node.left, postOrderList);
        postOrder(node.right, postOrderList);
        postOrderList.add(node.val);
    }

    public List<Integer> getTreeWayInOrder() {
        List<Integer> inOrderList = new ArrayList<>();
        inOrder(treeNode, inOrderList);
        return inOrderList;
    }

    /* In Order ( LEFT, ROOT, RIGHT ) */
    void inOrder(BinaryTreeNode node, List<Integer> inOrderList) {
        if (node == null) return;

        inOrder(node.left, inOrderList);
        inOrderList.add(node.val);
        inOrder(node.right, inOrderList);
    }

    /* In Order ( LEFT, ROOT, RIGHT ) */
    public List<Integer> inOrderUsingStack() {
        List<Integer> inOrderList = new ArrayList<>();
        if (treeNode == null) return inOrderList;
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode node = treeNode;
        do {
            if (node == null) {
                node = stack.pop();
                inOrderList.add(node.val);
                node = node.right;
            } else {
                stack.push(node);
                node = node.left;
            }
        } while (!stack.isEmpty() || node != null);
        return inOrderList;
    }

    /* Pre Order ( ROOT, LEFT, RIGHT ) */
    public List<Integer> preOrderUsingStack() {
        List<Integer> inOrderList = new ArrayList<>();
        if (treeNode == null) return inOrderList;
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode node = treeNode;
        do {
            if (node == null) {
                node = stack.pop();
                node = node.right;
            } else {
                inOrderList.add(node.val);
                stack.push(node);
                node = node.left;
            }
        } while (!stack.isEmpty() || node != null);
        return inOrderList;
    }

    /* Post Order ( LEFT, RIGHT, ROOT ) */
    public List<Integer> postOrderUsingStack() {
        List<Integer> inOrderList = new ArrayList<>();
        if (treeNode == null) return inOrderList;
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode node = treeNode;
        do {
            if (node == null) {
                node = stack.peek();
                if (node.right == null) {
                    inOrderList.add(stack.pop().val);
                }

                if (stack.peek().right != node)
                    node = node.right;
                else
                    inOrderList.add(stack.pop().val);
            } else {
                stack.push(node);
                node = node.left;
            }
        } while (!stack.isEmpty());
        return inOrderList;
    }
}
