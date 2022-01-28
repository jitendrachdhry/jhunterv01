package com.jhunter.tree.binarytree.constructbinarytree;

import com.jhunter.tree.binarytree.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class FromInOrderAndPreOrderTraversal {
    /*
        https://www.techiedelight.com/construct-binary-tree-from-inorder-preorder-traversal/
        Input:
        Inorder Traversal : { 4, 2, 1, 7, 5, 8, 3, 6 }
        Preorder Traversal: { 1, 2, 4, 3, 5, 7, 8, 6 }
        Output: Below binary tree
               1
             /   \
           2       3
         /       /   \
        4       5     6
              /   \
             7     8
     */

    public static TreeNode constructTree(int []in, int pre[]) {
        if(in == null || in.length <= 0 || pre == null || pre.length <= 0 || in.length != pre.length) return null;
        Map<Integer, Integer> inOrderMap = new HashMap<>();

        // put inorder array into map
        for(int i=0 ;i<pre.length; i++){
            inOrderMap.put(in[i], i);
        }

        // `pIndex` stores the index of the next unprocessed node in a preorder
        // sequence. We start with the root node (present at 0th index).
        AtomicInteger preOrderIndex = new AtomicInteger(0);
        return constructTree(pre, 0, pre.length-1, preOrderIndex, inOrderMap );
    }

    public static TreeNode constructTree(int []pre, int startIdx, int endIdx, AtomicInteger preOrderIndex, Map<Integer, Integer> inOrderMap) {
        if(startIdx > endIdx ) return null;

        // The next element in `preorder[]` will be the root node of subtree
        // formed by sequence represented by `inorder[start, end]`
        TreeNode root = new TreeNode(pre[preOrderIndex.getAndIncrement()]);

        // get the root node index in sequence `inorder[]` to determine the
        // left and right subtree boundary
        int rootIdxInInOrderArr = inOrderMap.get(root.val);
        // recursively construct the left subtree
        root.left = constructTree(pre, startIdx, rootIdxInInOrderArr - 1, preOrderIndex, inOrderMap);
        // recursively construct the right subtree
        root.right = constructTree(pre, rootIdxInInOrderArr + 1, endIdx, preOrderIndex, inOrderMap);

        // return current node
        return root;
    }
}
