package com.jhunter.tree.binarytree.treetraversal;
import com.jhunter.tree.binarytree.TreeNode;
import java.util.*;

public class PrintNodesOfABinaryTreeInVerticalOrder {
    /*
        Print nodes of a binary tree in vertical order.
        Given a binary tree, print its nodes in vertical order. Assume that the left and right child of a node makes a 45–degree angle with the parent.

          1
       /     \
      2       3
           /     \
          5       6
       /     \
      7       8
           /     \
          9      10

    Output:
    [2, 7]
    [1, 5, 9]
    [3, 8]
    [10, 6]
     */

    public static void printNodeInVerticalOrder(TreeNode root) {
        if(root == null) return;

        Map<Integer, List<Integer>> map = new TreeMap<>();
        printNodeInVerticalOrder(root, map, 0);

        System.out.print("Print nodes of a binary tree in vertical order: ");

        // Print Level Values
        for(List<Integer> list : map.values()){
            System.out.print("[");
            for( Integer entry : list){
                System.out.print(" " + entry);
            }
            System.out.print("]");
        }

    }

    public static void printNodeInVerticalOrder(TreeNode node, Map<Integer, List<Integer>> map, int level) {
        if(node == null) return;

        if(!map.containsKey(level)) {
            List<Integer> list = new ArrayList<>();
            list.add(node.val);
            map.put(level, list);
        } else {
            map.get(level).add(node.val);
        }
        printNodeInVerticalOrder(node.left, map, level - 1);
        printNodeInVerticalOrder(node.right, map, level + 1);
    }

    public static void executeTestCases(){
        TreeNode bTree = new TreeNode(1);
        bTree.left = new TreeNode(2);
        bTree.right = new TreeNode(3);
        bTree.right.left = new TreeNode(5);
        bTree.right.right = new TreeNode(6);
        bTree.right.left.left = new TreeNode(7);
        bTree.right.left.right = new TreeNode(8);
        bTree.right.left.right.left = new TreeNode(9);
        bTree.right.left.right.right = new TreeNode(10);

        printNodeInVerticalOrder(bTree);
    }
}
