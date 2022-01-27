package com.jhunter.tree.binarytree.cousins;

import com.jhunter.tree.binarytree.TreeNode;

class NodeInfo {
    int level;
    TreeNode parent;

    public NodeInfo() {
        this.parent = null;
        this.level = -1;
    }

    public NodeInfo(TreeNode parent, int level) {
        this.parent = parent;
        this.level = level;
    }
}

public class NodesAreCousinsOfEachOther {
    /*
        Given a binary tree, determine if two given nodes are cousins of each other or not. Two nodes of a binary tree are cousins of each other only if they have different parents, but they are at the same level.
                    1
                 /     \
                2      3
              /  \   /   \
             4   5   6   7

        Result:
        (4, 6), (4, 7), (5, 6) and (5, 7) are cousins of each other.
        (2, 3), (4, 5), (6, 7), (4, 3), etc., are not cousins of each other.
     */

    public static boolean findNodeLevel(TreeNode node, TreeNode parent, int val, int level, NodeInfo info) {
        if (node == null) return false;
        if (node.val == val) {
            info.parent = parent;
            info.level = level - 1;
            return true;
        }
        return findNodeLevel(node.left, node, val, level + 1, info) || findNodeLevel(node.right, node, val, level + 1, info);
    }

    public static boolean isNodesAreCousinsOfEachOther(TreeNode root, int child1, int child2) {
        if (root == null) return false;
        NodeInfo node1 = new NodeInfo(), node2 = new NodeInfo();
        if (!findNodeLevel(root, null, child1, 0, node1)) return false;
        if (!findNodeLevel(root, null, child2, 0, node2)) return false;

        return node1.parent != null && node2.parent != null && node1.level == node2.level && node1.parent.val != node2.parent.val;
    }

}
