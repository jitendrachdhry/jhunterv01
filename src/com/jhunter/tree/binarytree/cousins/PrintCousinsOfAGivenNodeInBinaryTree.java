package com.jhunter.tree.binarytree.cousins;

import com.jhunter.tree.binarytree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PrintCousinsOfAGivenNodeInBinaryTree {
    /*
        Given a binary tree, print all cousins of a given node. Two nodes of a binary tree are cousins of each other only if they have different parents, but they are at the same level.
                    1
                 /     \
                2      3
              /  \   /   \
             4   5   6   7

         Output:
         - 6, 7 are cousins of node 4 or 5
         - 4, 5 are cousins of node 6 or 7
     */

    public static boolean findNodeLevel(TreeNode node, TreeNode parentNode, int level, int child, NodeInfo info) {
        if (node == null) return false;
        if (node.val == child) {
            info.parent = parentNode;
            info.level = level - 1;
            return true;
        }
        return findNodeLevel(node.left, node, level + 1, child, info) || findNodeLevel(node.right, node, level + 1, child, info);
    }

    public static void findCousins(TreeNode node, int level, NodeInfo info, List<Integer> cousinsList) {
        if (node == null) return;
        if (level == info.level) {
            if (node.val != info.parent.val) {
                if (node.left != null) cousinsList.add(node.left.val);
                if (node.right != null) cousinsList.add(node.right.val);
                return;
            }
        }
        findCousins(node.left, level + 1, info, cousinsList);
        findCousins(node.right, level + 1, info, cousinsList);
    }

    public static List<Integer> getCousinsOfAGivenNodeInBinaryTree(TreeNode node, int child) {
        List<Integer> cousinsList = new ArrayList<>();
        if (node == null) return cousinsList;
        NodeInfo info = new NodeInfo();
        if (!findNodeLevel(node, null, 0, child, info)) return cousinsList;
        findCousins(node, 0, info, cousinsList);
        return cousinsList;
    }

}
