package com.jhunter.tree.binarytree.constructbinarytree;

import com.jhunter.tree.binarytree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class FromInOrderAndLevelOrderTraversal {
    /*
        https://www.youtube.com/watch?v=7eBndROfUnw
        https://www.techiedelight.com/construct-binary-tree-from-inorder-level-order-traversals/
        Write an efficient algorithm to construct a binary tree from the given inorder and level order sequence.

        For example,
        Input:
        Inorder Traversal     : { 4, 2, 5, 1, 6, 3, 7 }
        level order traversal : { 1, 2, 3, 4, 5, 6, 7 }

        Output: Below binary tree
               1
             /   \
            2     3
          /  \   / \
         4   5  6   7

       Time: BigO(n^2)
     */

    public static TreeNode constructTree(int[] in, int[] level) {
        if (in == null || in.length <= 0 || level == null || level.length <= 0 || in.length != level.length)
            return null;
        Map<Integer, Integer> levelOrderMap = new HashMap<>();

        // put inorder array into map
        for (int i = 0; i < level.length; i++) {
            levelOrderMap.put(level[i], i);
        }

        return constructTree(in, 0, in.length - 1, levelOrderMap);
    }

    public static TreeNode constructTree(int[] in, int startIdx, int endIdx, Map<Integer, Integer> levelOrderMap) {
        if (startIdx > endIdx) return null;

        int index = startIdx;
        for (int j = startIdx + 1; j < endIdx; j++) {
            if (levelOrderMap.get(in[index]) > levelOrderMap.get(in[j])) {
                index = j;
            }
        }

        TreeNode root = new TreeNode(in[index]);
        root.left = constructTree(in, startIdx, index - 1, levelOrderMap);
        root.right = constructTree(in, index + 1, endIdx, levelOrderMap);
        return root;
    }

}
