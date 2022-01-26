package com.jhunter.tree.binarytree.treetraversal;

import com.jhunter.tree.binarytree.BinaryTreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public static List<Integer> findDiagonalSumOfABinaryTree(BinaryTreeNode root) {
        List<Integer> resList = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        diagonalSumOfABinaryTree(root, map, 0);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            resList.add(entry.getValue());
        }
        return resList;
    }

    public static void diagonalSumOfABinaryTree(BinaryTreeNode node, Map<Integer, Integer> map, int diagonal) {
        if (node == null) return;
        map.put(diagonal, map.getOrDefault(diagonal, 0) + node.val);
        if (node.left != null) diagonalSumOfABinaryTree(node.left, map, diagonal + 1);
        if (node.right != null) diagonalSumOfABinaryTree(node.right, map, diagonal);
    }
}
