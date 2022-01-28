package com.jhunter.tree.binarytree.treetraversal;

import com.jhunter.tree.binarytree.TreeNode;

import java.util.*;

public class AllNodesDistanceKInBinaryTree {
    /*
        https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/
        https://www.youtube.com/watch?v=pMYN_j4FD2M
        Given the root of a binary tree, the value of a target node target, and an integer k, return an constructbinarytree of the values of all nodes that have a distance k from the target node.
        You can return the answer in any order.
        Input: root = [3,5,1,6,2,0,8,null,null,7,4], target = 5, k = 2
        Output: [7,4,1]
        Explanation: The nodes that are a distance 2 from the target node (with value 5) have values 7, 4, and 1.

        The algorithm is :
        1) Store the parents of each node in hash map(hashing)
        2) Reach the target node
        3) Perform the  bfs from this node, considering left, right and parent node connected to a give node.
     */
    public static List<Integer> findAllNodesDistanceKInBinaryTree(TreeNode root, TreeNode target, int k) {
        List<Integer> resNodes = new ArrayList<>();
        if (root == null || target == null || k < 0) return resNodes;
        Map<TreeNode, TreeNode> parentMap = new HashMap<>();

        // Assign parent to each node and insert into map as a key(node) , value(parent) pair.
        initializeParent(root, null, parentMap);

        if (parentMap.containsKey(target)) {
            Queue<TreeNode> q = new LinkedList<>();
            Set<TreeNode> set = new HashSet<>();
            int level = 0;
            q.add(target);

            while (!q.isEmpty() && level <= k) {
                if (level == k) {
                    for (TreeNode node : q) {
                        resNodes.add(node.val);
                    }
                    return resNodes;
                }
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    TreeNode temp = q.poll();
                    set.add(temp);
                    if (temp.left != null && !set.contains(temp.left)) {
                        q.add(temp.left);
                    }
                    if (temp.right != null && !set.contains(temp.right)) {
                        q.add(temp.right);
                    }
                    TreeNode parent = parentMap.get(temp);
                    if (parent != null && !set.contains(parent)) {
                        q.add(parent);
                    }
                }

                ++level;
            }
        }
        return resNodes;
    }

    public static void initializeParent(TreeNode node, TreeNode parent, Map<TreeNode, TreeNode> parentMap) {
        if (node == null) return;
        parentMap.put(node, parent);
        if (node.left != null) initializeParent(node.left, node, parentMap);
        if (node.right != null) initializeParent(node.right, node, parentMap);
    }
}
