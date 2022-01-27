package com.jhunter.tree.binarytree.treetraversal;

import com.jhunter.tree.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;

class NodeInfo {
    int sum;
    TreeNode leaf;

    NodeInfo(int sum, TreeNode leaf) {
        this.sum = sum;
        this.leaf = leaf;
    }
}

public class FindMaximumSumRootToLeafPathInABinaryTree {
    /*
        https://www.techiedelight.com/find-maximum-sum-root-to-leaf-path-binary-tree/
        Given a binary tree, write an efficient algorithm to find the maximum sum root-to-leaf path, i.e., the maximum sum path from the root node to any leaf node in it.
                  1
               /     \
              2       3
             / \     / \
            8   4   5   6
               /   / \   \
             10   7   9   5
       Result:
       The maximum sum is 18. The maximum sum path is 9 5 3 1.
     */

    public static int findMaximumSumRootToLeafPathInABinaryTree(TreeNode root) {
        List<Integer> resList = new ArrayList<>();
        NodeInfo nodeInfo = findMaximumSumRootToLeaf(root);
        System.out.println("findMaximumSumRootToLeafPathInABinaryTree: sum: " + nodeInfo.sum + " , leafNode: " + nodeInfo.leaf.val);
        return nodeInfo.sum;
    }

    public static NodeInfo findMaximumSumRootToLeaf(TreeNode node) {
        if (node == null) return new NodeInfo(0, null);
        if (node.left == null && node.right == null) {
            NodeInfo info = new NodeInfo(node.val, node);
            return info;
        }
        NodeInfo leftNodeInfo = findMaximumSumRootToLeaf(node.left);
        NodeInfo rightNodeInfo = findMaximumSumRootToLeaf(node.right);

        NodeInfo maxNodeInfo = leftNodeInfo.sum > rightNodeInfo.sum ? leftNodeInfo : rightNodeInfo;
        maxNodeInfo.sum += node.val;
        return maxNodeInfo;
    }
}
