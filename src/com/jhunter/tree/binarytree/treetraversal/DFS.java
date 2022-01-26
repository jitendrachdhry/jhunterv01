package com.jhunter.tree.binarytree.treetraversal;

import com.jhunter.tree.binarytree.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
    Traverse A Tree:
    Understand the difference between different tree traversal methods;
    1. DFS
       - Be able to solve preorder (ROOT, LEFT, RIGHT), inorder(LEFT,ROOT, RIGHT) and postorder(LEFT, RIGHT, ROOT) traversal recursively;
       - Be able to solve preorder, inorder and postorder traversal iteratively;
    2. BFS
       - Be able to do level traversal using BFS.
 */
public class DFS {
    public static List<Integer> getTreeWayPreOrder(BinaryTreeNode root) {
        List<Integer> preOrderList = new ArrayList<>();
        preOrder(root, preOrderList);
        return preOrderList;
    }

    /* Pre Order ( ROOT, LEFT, RIGHT ) */
    public static void preOrder(BinaryTreeNode node, List<Integer> preOrderList) {
        if (node == null) return;

        preOrderList.add(node.val);
        preOrder(node.left, preOrderList);
        preOrder(node.right, preOrderList);
    }

    public static List<Integer> getTreeWayPostOrder(BinaryTreeNode root) {
        List<Integer> preOrderList = new ArrayList<>();
        postOrder(root, preOrderList);
        return preOrderList;
    }

    /* Post Order ( LEFT, RIGHT, ROOT ) */
    public static void postOrder(BinaryTreeNode node, List<Integer> postOrderList) {
        if (node == null) return;

        postOrder(node.left, postOrderList);
        postOrder(node.right, postOrderList);
        postOrderList.add(node.val);
    }

    public static List<Integer> getTreeWayInOrder(BinaryTreeNode root) {
        List<Integer> inOrderList = new ArrayList<>();
        inOrder(root, inOrderList);
        return inOrderList;
    }

    /* In Order ( LEFT, ROOT, RIGHT ) */
    public static void inOrder(BinaryTreeNode node, List<Integer> inOrderList) {
        if (node == null) return;

        inOrder(node.left, inOrderList);
        inOrderList.add(node.val);
        inOrder(node.right, inOrderList);
    }

    /* In Order ( LEFT, ROOT, RIGHT )
        1. Create an empty stack of BinaryTreeNode.
        2. initialize current_node as root
        3. Push the current_node to stack and set current_node current_node = current_node->left until current_node is NULL.
        4. if current_node is null and stack is not empty.
            a) pop node from stack
            b) add node info to the List and set current_node to current_node->right.
            c) Go to step 3.
        5. we are done, if current_node is null and stack is empty.
     */
    public static List<Integer> inOrderUsingStack(BinaryTreeNode root) {
        List<Integer> inOrderList = new ArrayList<>();
        if (root == null) return inOrderList;
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode node = root;
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

    /* Pre Order ( ROOT, LEFT, RIGHT )
        1. Create an empty stack of BinaryTreeNode.
        2. initialize current_node as root
        3. add current_node info to the List and push the current_node to stack. set current_node current_node = current_node->left until current_node is NULL.
        4. if current_node is null and stack is not empty.
            a) pop node from stack
            b) set current_node to current_node->right.
            c) Go to step 3.
        5. we are done, if current_node is null and stack is empty.
    */
    public static List<Integer> preOrderUsingStack(BinaryTreeNode root) {
        List<Integer> inOrderList = new ArrayList<>();
        if (root == null) return inOrderList;
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode node = root;
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

    /* Post Order ( LEFT, RIGHT, ROOT )
        1. Create an empty stack of BinaryTreeNode.
        2. initialize current_node as root
        3. add current_node info to the List and push the current_node to stack. set current_node current_node = current_node->left until current_node is NULL.
        4. if current_node is null:
            a) check for stack size and break if stack is empty.
            b) initialize last node as null.
            c) start a loop until stack is empty and last node is equal to stack peek node right.
            d) peek stack node and set it to last node.
            d) pop stack node and add it into postOrderList.
    */
    public static List<Integer> postOrderUsingStack(BinaryTreeNode root) {
        List<Integer> postOrderList = new ArrayList<>();
        if (root == null) return postOrderList;
        Stack<BinaryTreeNode> stack = new Stack<>();
        BinaryTreeNode current_node = root;
        do {
            if (current_node != null) {
                stack.push(current_node);
                current_node = current_node.left;
            } else if (current_node == null) {
                if (stack.isEmpty()) break;
                current_node = stack.peek().right;
                if (current_node == null) {
                    BinaryTreeNode last = null;
                    while (!stack.isEmpty() && stack.peek().right == last) {
                        last = stack.peek();
                        postOrderList.add(stack.pop().val);
                    }
                }
            }
        } while (true);
        return postOrderList;
    }
}
