package com.jhunter.tree.binarytree.treetraversal;

import com.jhunter.tree.binarytree.TreeNode;

public class BinaryTreeMaximumPathSum125 {
    /*
        https://leetcode.com/problems/binary-tree-maximum-path-sum/
        https://www.youtube.com/watch?v=mOdetMWwtoI
        https://www.youtube.com/watch?v=Osz-Vwer6rw
        A path in a binary tree is a sequence of nodes where each pair of adjacent nodes in the sequence has an edge connecting them. A node can only appear in the sequence at most once. Note that the path does not need to pass through the root.
        The path sum of a path is the sum of the node's values in the path.
        Given the root of a binary tree, return the maximum path sum of any non-empty path.

        Example 1:
                 1
              /    \
             2     3
        Input: root = [1,2,3]
        Output: 6
        Explanation: The optimal path is 2 -> 1 -> 3 with a path sum of 2 + 1 + 3 = 6.

        Example 2:
        Input: root = [-10,9,20,null,null,15,7]
        Output: 42
        Explanation: The optimal path is 15 -> 20 -> 7 with a path sum of 15 + 20 + 7 = 42.
     */
    public static int maxPathSum(TreeNode root) {
        int[] max = new int[1];
        max[0] = Integer.MIN_VALUE;
        if (root.left == null && root.right == null) {
            return root.val;
        }
        findMaxPathSum(root, max);
        return max[0];
    }

    public static int findMaxPathSum(TreeNode node, int[] max) {
        if (node == null) return 0;
        int leftMax = findMaxPathSum(node.left, max);
        int rightMax = findMaxPathSum(node.right, max);

        int temp = Math.max(Math.max(leftMax, rightMax) + node.val, node.val);
        int res = Math.max(leftMax + rightMax + node.val, temp);
        max[0] = Math.max(max[0], res);
        return temp;
    }
}
