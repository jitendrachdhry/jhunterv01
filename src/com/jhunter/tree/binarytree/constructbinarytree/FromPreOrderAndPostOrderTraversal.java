package com.jhunter.tree.binarytree.constructbinarytree;

import com.jhunter.tree.binarytree.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class FromPreOrderAndPostOrderTraversal {
    /*
        https://www.youtube.com/watch?v=5lWJpTEnyow
        https://www.techiedelight.com/construct-full-binary-tree-from-preorder-postorder-sequence/
        https://leetcode.com/problems/construct-binary-tree-from-preorder-and-postorder-traversal/
        Input:
        Preorder traversal : { 1, 2, 4, 5, 3, 6, 8, 9, 7 }
        Postorder traversal: { 4, 5, 2, 8, 9, 6, 7, 3, 1 }

        Output:
               1
            /     \
           2       3
         /  \    /   \
        4   5   6     7
              /   \
             8    9
    */

    public static TreeNode constructTree(int[] pre, int[] post) {
        if (pre == null || pre.length <= 0 || post == null || post.length <= 0 || pre.length != post.length)
            return null;
        Map<Integer, Integer> postOrderMap = new HashMap<>();
        // put inorder array into map
        for (int i = 0; i < post.length; i++) {
            postOrderMap.put(post[i], i);
        }
        AtomicInteger preOrderIdx = new AtomicInteger(0);
        return constructTree(pre, 0, pre.length - 1, preOrderIdx, postOrderMap);
    }

    public static TreeNode constructTree(int[] pre, int startIdx, int endIdx, AtomicInteger preOrderIdx, Map<Integer, Integer> postOrderMap) {
        if (startIdx > endIdx) return null;
        TreeNode root = new TreeNode(pre[preOrderIdx.getAndIncrement()]);
        if (startIdx == endIdx) return root;
        int indexInPostOrderArr = postOrderMap.get(pre[preOrderIdx.get()]);
        root.left = constructTree(pre, startIdx, indexInPostOrderArr, preOrderIdx, postOrderMap);
        root.right = constructTree(pre, indexInPostOrderArr + 1, endIdx - 1, preOrderIdx, postOrderMap);
        return root;
    }
}
