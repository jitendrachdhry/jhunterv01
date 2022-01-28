package com.jhunter.tree.binarytree.treetraversal;

import com.jhunter.tree.binarytree.TreeNode;

import java.util.Stack;

public class PrintAllPathsFromLeaf2RootNode {
    /*
        https://www.techiedelight.com/print-all-paths-from-leaf-to-root-binary-tree/
        Given a binary tree, write a recursive algorithm to print all paths from every leaf node to root node in the binary tree.
                   1
                 /   \
                /     \
               /       \
              2         3
             / \       / \
            /   \     /   \
           4     5   6     7
                    / \
                   /   \
                  8     9

      Output:
        4 —> 2 —> 1
        5 —> 2 —> 1
        8 —> 6 —> 3 —> 1
        9 —> 6 —> 3 —> 1
        7 —> 3 —> 1

        Approach:
        - start post order traversal.
        - print stack whenever we find leaf node.
     */

    public static void printAllPathsFromLeaf2RootNode(TreeNode root) {
        if (root == null) return;

        Stack<TreeNode> s = new Stack<TreeNode>();
        TreeNode current_node = root;
        do {
            if (current_node != null) {
                s.push(current_node);
                current_node = current_node.left;
            } else {
                if (s.isEmpty()) {
                    break;
                }
                current_node = s.peek().right;
                if (current_node == null) {
                    TreeNode last_node = null;
                    while (!s.isEmpty() && s.peek().right == last_node) {
                        last_node = s.peek();
                        if (last_node.left == null && last_node.right == null) {
                            for (TreeNode node : s) {
                                System.out.print(node.val);
                                if (node != s.peek()) {
                                    System.out.print("->");
                                }
                            }
                            System.out.println();
                        }
                        s.pop();
                    }
                }
            }
        } while (true);

    }

}
