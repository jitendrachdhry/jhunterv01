package com.jhunter.tree.binarytree.treetraversal;

import com.jhunter.tree.binarytree.BinaryTreeNode;

import java.util.Stack;

public class DistanceBetweenGivenPairsOfNodesInABinaryTree {
    /*
        https://www.techiedelight.com/distance-between-given-pairs-of-nodes-binary-tree/
        Given a binary tree, determine the distance between given pairs of nodes in it. The distance between two nodes is defined as the total number of edges in the shortest path from one node to other.

        Tree: The distance between node 7 and node 6 is 3.
          1
       /     \
      2       3
       \     / \
        4   5   6
           /     \
          7       8

      1. Find lca of nodeA and nodeB
      2. find distance of nodeA and nodeB from lca.
      3. add distance of nodeA and nodeB from lca and return as a result.
    */

    public static int findDistanceBetweenGivenPairsOfNodesInABinaryTree(BinaryTreeNode root, int nodeA, int nodeB) {
        if (root == null) return -1;
        // find LCA of nodeA, and nodeB
        BinaryTreeNode lca = lca(root, nodeA, nodeB);
        if (lca == null) return -1;
        return findPathFromNode(lca, nodeA) + findPathFromNode(lca, nodeB);
    }

    public static int findPathFromNode(BinaryTreeNode lca, int node) {
        Stack<BinaryTreeNode> s = new Stack<>();
        BinaryTreeNode current_node = lca;
        do {
            if (current_node != null) {
                s.push(current_node);
                current_node = current_node.left;
            } else {
                if (s.isEmpty()) break;
                current_node = s.peek().right;
                if (current_node == null) {
                    BinaryTreeNode last = null;
                    while (!s.isEmpty() && last == s.peek().right) {
                        last = s.pop();
                    }
                }
            }
        } while (!s.isEmpty() && s.peek().val != node);
        return s.size() - 1;
    }

    public static BinaryTreeNode lca(BinaryTreeNode node, int nodeA, int nodeB) {
        if (node == null) return null;
        if (node.val == nodeA || node.val == nodeB) {
            return node;
        }

        BinaryTreeNode leftNode = lca(node.left, nodeA, nodeB);
        BinaryTreeNode rightNode = lca(node.right, nodeA, nodeB);
        if (leftNode != null && rightNode != null) {
            return node;
        }
        return (leftNode != null) ? leftNode : rightNode;
    }
}
