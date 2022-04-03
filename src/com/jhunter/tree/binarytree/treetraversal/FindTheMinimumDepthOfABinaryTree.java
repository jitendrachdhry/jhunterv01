package com.jhunter.tree.binarytree.treetraversal;

import com.jhunter.tree.binarytree.TreeNode;

import javax.swing.text.html.ListView;
import java.util.HashMap;
import java.util.Stack;

public class FindTheMinimumDepthOfABinaryTree {
    /*
        https://www.techiedelight.com/find-minimum-depth-binary-tree/
        Given a binary tree, find its minimum depth. The minimum depth is the total number of nodes along the shortest path from the root node down to the nearest leaf node.
        For example, the minimum depth of the following binary tree is 3. The shortest path is 1 —> 3 —> 6.

          1
        /   \
      2       3
     / \     /  \
    4   5   6   7
     \   \     /  \
     8   9    10  11
      \
      12
      Solution:
      Use postorder traversal.
     */

    public static int findTheMinimumDepthOfABinaryTree(TreeNode root) {
        if (root == null) return -1;

        Stack<TreeNode> s = new Stack();
        TreeNode current = root;
        int minDepth = Integer.MAX_VALUE;
        Object[] resArr = null;

        do {
            if (current != null) {
                s.add(current);
                current = current.left;
            } else {
                if (s.isEmpty()) break;
                current = s.peek().right;
                if (current == null) {
                    TreeNode previous = null;
                    while (!s.isEmpty() && previous == s.peek().right) {
                        previous = s.peek();
                        // check if the node is leaf node or not.
                        if (previous.left == null && previous.right == null) {
                            // check if current leaf node depth is lesser than last shortest leaf node depth.
                            if (minDepth > s.size()) {
                                resArr = s.toArray();
                                // replace last leaf depth with current leaf node depth.
                                minDepth = s.size();
                            }
                        }
                        s.pop();
                    }
                }
            }
        } while (true);

        System.out.print("\nFindTheMinimumDepthOfABinaryTree [output : 3]: " + minDepth + " tree nodes are: ");
        for (Object node : resArr) {
            System.out.print(" " + ((TreeNode) node).val);
        }
        return minDepth;
    }

    public static void executeTestCases() {
        TreeNode bTree = new TreeNode(1);
        bTree.left = new TreeNode(2);
        bTree.right = new TreeNode(3);
        bTree.left.left = new TreeNode(4);
        bTree.left.right = new TreeNode(5);
        bTree.right.left = new TreeNode(6);
        bTree.right.right = new TreeNode(7);
        bTree.left.left.right = new TreeNode(8);
        bTree.left.left.right.right = new TreeNode(12);
        bTree.left.right.right = new TreeNode(9);
        bTree.right.right.left = new TreeNode(10);
        bTree.right.right.right = new TreeNode(11);

        findTheMinimumDepthOfABinaryTree(bTree);
    }
}
