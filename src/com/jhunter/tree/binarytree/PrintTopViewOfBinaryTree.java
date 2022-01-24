package com.jhunter.tree.binarytree;

import com.jhunter.utility.Pair;

import java.util.*;

public class PrintTopViewOfBinaryTree {
    /*
        https://www.techiedelight.com/print-top-view-binary-tree/
        Given a binary tree, print the top view of it. Assume the left and right child of a node makes a 45–degree angle with the parent.
        For example, the top view of the following tree is 2, 1, 3, 6:

                    1
                 /     \
                2      3
                     /   \
                    5    6
                  /  \
                 7   8
     */

    public static List<Integer> getTopViewOfBinaryTree(BinaryTreeNode nodeBT) {
        List<Integer> result = new ArrayList<>();
        if (nodeBT == null) return result;

        Map<Integer, Integer> map = new TreeMap<>();
        Stack<Pair<Integer, BinaryTreeNode>> st = new Stack<>();
        BinaryTreeNode node = nodeBT;
        int level = 0;
        do {
            if (node == null) {
                Pair<Integer, BinaryTreeNode> pair = st.pop();
                node = pair.second.right;
                level = pair.first + 1;
            } else {
                if (!map.containsKey(level)) {
                    map.put(level, node.val);
                }
                st.push(Pair.of(level, node));
                level -= 1;
                node = node.left;
            }
        } while (!st.isEmpty() || node != null);

        // Pull result from map to List.
        for (Map.Entry<Integer, Integer> it : map.entrySet()) {
            result.add(it.getValue());
        }
        return result;
    }
}
