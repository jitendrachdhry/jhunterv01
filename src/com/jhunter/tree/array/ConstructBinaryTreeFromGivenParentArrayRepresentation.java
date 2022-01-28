package com.jhunter.tree.array;

import com.jhunter.tree.binarytree.TreeNode;

public class ConstructBinaryTreeFromGivenParentArrayRepresentation {
    /*
    https://www.youtube.com/watch?v=BuM5rSaMeVM
    https://www.techiedelight.com/build-binary-tree-given-parent-array/

    Given an array that represents a tree in such a way that array indexes are values in tree nodes and array values give the parent node of that particular index (or node). The value of the root node index would always be -1 as there is no parent for root. Construct the standard linked representation of given Binary Tree from this given representation.
    Examples:
    Input: parent[] = {1, 5, 5, 2, 2, -1, 3}
    Output: root of below tree
              5
            /  \
           1    2
          /    / \
         0    3   4
             /
            6
    Explanation:
    Index of -1 is 5.  So 5 is root.
    5 is present at indexes 1 and 2.  So 1 and 2 are
    children of 5.
    1 is present at index 0, so 0 is child of 1.
    2 is present at indexes 3 and 4.  So 3 and 4 are
    children of 2.
    3 is present at index 6, so 6 is child of 3.

    Input: parent[] = {-1, 0, 0, 1, 1, 3, 5};
    Output: root of below tree
             0
           /   \
          1     2
         / \
        3   4
       /
      5
     /
    6
    Expected time complexity is O(n) where n is number of elements in given array.
     */

    public static TreeNode constructBinaryTreeFromGivenParentArrayRepresentation(int[] arr) {
        if (arr == null || arr.length <= 0) return null;
        TreeNode root = null;
        TreeNode[] parentNodes = new TreeNode[arr.length];
        for (int i = 0; i < arr.length; i++) {
            parentNodes[i] = new TreeNode(i);
        }
        //Input: parent[] = {1, 5, 5, 2, 2, -1, 3}
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == -1) {
                root = parentNodes[i];
                continue;
            }
            if (parentNodes[arr[i]].left == null) {
                parentNodes[arr[i]].left = parentNodes[i];
            } else {
                parentNodes[arr[i]].right = parentNodes[i];
            }
        }
        return root;
    }

}
