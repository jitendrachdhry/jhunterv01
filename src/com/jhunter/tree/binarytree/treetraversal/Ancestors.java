package com.jhunter.tree.binarytree.treetraversal;

import com.jhunter.tree.binarytree.TreeNode;

public class Ancestors {
    /*
        https://www.techiedelight.com/find-ancestors-of-given-node-binary-tree/
        Given a binary tree, find all ancestors of a given node in it.
        Ancestor of below tree for node 7 is 5->3->1.
          1
        /   \
       /     \
      2       3
       \     / \
        4   5   6
           / \
          7   8
     */
    public static String findAncestorsHistory(TreeNode root, int node) {
        return findAncestor(root, node, "");
    }

    public static String findAncestor(TreeNode current_node, int node, String history) {
        if (current_node == null) return "";
        else if (current_node.val == node) {
            return history;
        }
        if (history.length() == 0)
            history += current_node.val;
        else
            history = current_node.val + "->" + history;

        String left = "", right = "";
        if (current_node.left != null)
            left = findAncestor(current_node.left, node, history);
        if (current_node.right != null)
            right = findAncestor(current_node.right, node, history);
        return (left.length() == 0) ? right : left;
    }
}
