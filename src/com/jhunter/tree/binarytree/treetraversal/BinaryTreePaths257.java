package com.jhunter.tree.binarytree.treetraversal;

import com.jhunter.tree.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths257 {
    /*
        https://leetcode.com/problems/binary-tree-paths/
        Given the root of a binary tree, return all root-to-leaf paths in any order. A leaf is a node with no children.
        Example:
                  1
                /   \
               /     \
              2       3
             / \     / \
            4   5   6   7
                   /     \
                  8       9
         Output:
         {[1->2->4],[1->2->5],[1->3->6->8],[1->3->7->9]}
     */

    public static List<String> getBinaryTreePaths(TreeNode root) {

        List<String> paths = new ArrayList<>();
        if (root == null) return paths;

        pathFinder(root, "", paths);
        return paths;
    }

    public static void pathFinder(TreeNode current_node, String current_path, List<String> paths) {
        if (current_path.length() == 0) {
            current_path += current_node.val;
        } else {
            current_path += "->" + current_node.val;
        }
        if (current_node.left == null && current_node.right == null) {
            paths.add(current_path);
            return;
        }

        if (current_node.left != null)
            pathFinder(current_node.left, current_path, paths);

        if (current_node.right != null)
            pathFinder(current_node.right, current_path, paths);
    }

}
