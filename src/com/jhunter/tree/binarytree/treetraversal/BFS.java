package com.jhunter.tree.binarytree.treetraversal;

import com.jhunter.tree.binarytree.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    /*
        https://leetcode.com/problems/binary-tree-level-order-traversal/
        https://www.youtube.com/watch?v=AxpHRktS7Yw

        Example 1:
            3
          /  \
         9   20
            /  \
           15  7

        Input: root = [3,9,20,null,null,15,7]
        Output: [[3],[9,20],[15,7]]
     */

    public static List<List<Integer>> levelOrderTraverse(BinaryTreeNode root) {
        List<List<Integer>> bfsList = new ArrayList<>();
        if (root == null) return bfsList;
        levelOrderTraverseRecursive(root, bfsList, 0);
        return bfsList;
    }

    public static void levelOrderTraverseRecursive(BinaryTreeNode node, List<List<Integer>> bfsList, int level) {
        if (node == null) return;
        if (bfsList.size() == level) {
            bfsList.add(new ArrayList<Integer>());
        }

        bfsList.get(level).add(node.val);
        if (node.left != null)
            levelOrderTraverseRecursive(node.left, bfsList, level + 1);
        if (node.right != null)
            levelOrderTraverseRecursive(node.right, bfsList, level + 1);
    }

    /*
        1. Use a queue to store our starting node.
        2. Maintain a level of three.
        3. Process the numbers of nodes on each level and adds its children into the queue.
     */
    public static List<List<Integer>> levelOrderTraverseNonRecursive(BinaryTreeNode root) {
        List<List<Integer>> bfsList = new ArrayList<>();
        if (root == null) return bfsList;
        Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
        q.add(root);
        int level = 0;
        while (!q.isEmpty()) {
            bfsList.add(new ArrayList<>());
            int size = q.size();
            for (int i = 0; i < size; i++) {
                BinaryTreeNode node = q.remove();
                bfsList.get(level).add(node.val);
                if (node.left != null) {
                    q.add(node.left);
                }
                if (node.right != null) {
                    q.add(node.right);
                }
            }
            level += 1;
        }
        return bfsList;
    }
}
