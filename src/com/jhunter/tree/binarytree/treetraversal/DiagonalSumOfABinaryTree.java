package com.jhunter.tree.binarytree.treetraversal;

import com.jhunter.tree.binarytree.TreeNode;

import java.util.*;

public class DiagonalSumOfABinaryTree {
    /*
        https://www.techiedelight.com/find-diagonal-sum-given-binary-tree/
        Given a binary tree, calculate the sum of all nodes for each diagonal having negative slope . Assume that the left and right child of a node makes a 45–degree angle with the parent.
        /* Construct the following tree
                   1
                 /   \
                /     \
               2       3
              /      /  \
             /      /    \
            4      5      6 sum: 1+3+6 = 10
                  / \
                 /   \
                7     8 sum: 2+5+8 = 15
                sum: 4+7 = 11
        Approach:
        We can easily solve this problem with the help of hashing. The idea is to create an empty map where each key in the map represents a diagonal in the binary tree,
        and its value maintains the sum of all nodes present in the diagonal. Then perform a preorder traversal on the tree and update the map. For each node, recur for
        its left subtree by increasing the diagonal by one and recur for the right subtree with the same diagonal.
     */

    public static List<Integer> findDiagonalSumOfABinaryTree(TreeNode root) {
        List<Integer> resList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        diagonalSumOfABinaryTree(root, map, 0);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            resList.add(entry.getValue());
        }
        return resList;
    }

    public static void diagonalSumOfABinaryTree(TreeNode node, Map<Integer, Integer> map, int diagonal) {
        if (node == null) return;
        map.put(diagonal, map.getOrDefault(diagonal, 0) + node.val);
        if (node.left != null) diagonalSumOfABinaryTree(node.left, map, diagonal + 1);
        if (node.right != null) diagonalSumOfABinaryTree(node.right, map, diagonal);
    }

    /*
        https://www.youtube.com/watch?v=cTQphmYnWOI
        Solution:
        - We start binary tree traversal from right side diagonally
        - We take a sum = 0 & keep on adding the all value till right node is null
        - If any node has left node, then we add the element in queue
        - So using this, we traverse diagonal level wise & add sum for a diagonal level

        Time Complexity: O(n)
        Space Complexity: O(n)
     */
    public static List<Integer> findDiagonalSumOfABinaryTreeNonRecursive(TreeNode root) {
        List<Integer> resList = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int length = q.size();
            int diagonalSum = 0;
            for (int i = 0; i < length; i++) {
                TreeNode current_node = q.poll();
                diagonalSum += current_node.val;
                if (current_node.left != null) q.add(current_node.left);
                while (current_node.right != null) {
                    diagonalSum += current_node.right.val;
                    current_node = current_node.right;
                    if (current_node.left != null) q.add(current_node.left);
                }
            }
            resList.add(diagonalSum);
        }
        return resList;
    }
}
