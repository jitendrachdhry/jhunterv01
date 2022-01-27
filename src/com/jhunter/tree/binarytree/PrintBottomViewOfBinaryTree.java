package com.jhunter.tree.binarytree;

import com.jhunter.utility.Pair;

import java.util.*;

public class PrintBottomViewOfBinaryTree {
    /*
        https://www.techiedelight.com/print-bottom-view-of-binary-tree/
        Given a binary tree, print the bottom view of it. For example, the bottom view of the following tree is 7, 5, 8, 6:

                 1
              /    \
             2      3
                  /   \
                 5     6
               /   \
             7      8
     */

    public static List<Integer> getBottomViewOfBinaryTree(TreeNode nodeBT) {
        List<Integer> result = new ArrayList<>();
        if (nodeBT == null) return result;

        // stack for Pre-order traverse and keep the vertical idx value.
        Stack<Pair<Integer, TreeNode>> st = new Stack<>();

        //Keep list of bottom view of binary tree
        Map<Integer, Integer> map = new TreeMap<>();
        TreeNode node = nodeBT;
        int level = 0;
        do {
            if (node == null) {
                Pair<Integer, TreeNode> pair = st.pop();
                node = pair.second.right;
                level = pair.first + 1;
            } else {
                map.put(level, node.val);
                st.push(Pair.of(level, node));
                level -= 1;
                node = node.left;
            }
        } while (!st.isEmpty() || node != null);

        for (Map.Entry<Integer, Integer> iterator : map.entrySet()) {
            result.add(iterator.getValue());
        }
        return result;
    }
}
