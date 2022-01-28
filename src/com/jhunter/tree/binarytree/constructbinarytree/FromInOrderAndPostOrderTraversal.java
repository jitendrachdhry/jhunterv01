package com.jhunter.tree.binarytree.constructbinarytree;

import com.jhunter.tree.binarytree.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class FromInOrderAndPostOrderTraversal {
/*
    https://www.youtube.com/watch?v=LgLRTaEMRVc
    https://www.techiedelight.com/construct-full-binary-tree-from-postorder-postorder-sequence/
    https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
    Input:
    Inorder Traversal   : { 4, 2, 1, 7, 5, 8, 3, 6 }
    Postorder Traversal : { 4, 2, 7, 8, 5, 6, 3, 1 }
    Output: Below binary tree
           1
        /     \
       2       3
     /       /   \
    4       5     6
          /   \
         7     8
 */

    public static TreeNode constructTree(int[] in, int[] post) {
        if (in == null || in.length <= 0 || post == null || post.length <= 0 || in.length != post.length) return null;
        Map<Integer, Integer> inOrderMap = new HashMap<>();

        // put inorder array into map
        for (int i = 0; i < post.length; i++) {
            inOrderMap.put(in[i], i);
        }

        AtomicInteger postOrderIdx = new AtomicInteger(post.length - 1);
        return constructTree(post, 0, post.length - 1, postOrderIdx, inOrderMap);
    }

    public static TreeNode constructTree(int[] post, int startIdx, int endIdx, AtomicInteger postOrderIdx, Map<Integer, Integer> inOrderMap) {
        if (startIdx > endIdx) return null;

        TreeNode root = new TreeNode(post[postOrderIdx.getAndDecrement()]);
        int rootIdxInInOrderArr = inOrderMap.get(root.val);
        root.right = constructTree(post, rootIdxInInOrderArr + 1, endIdx, postOrderIdx, inOrderMap);
        root.left = constructTree(post, startIdx, rootIdxInInOrderArr - 1, postOrderIdx, inOrderMap);
        return root;
    }
}
