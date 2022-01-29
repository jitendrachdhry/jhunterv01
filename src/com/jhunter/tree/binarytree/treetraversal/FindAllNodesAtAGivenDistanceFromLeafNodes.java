package com.jhunter.tree.binarytree.treetraversal;

import com.jhunter.tree.binarytree.TreeNode;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class FindAllNodesAtAGivenDistanceFromLeafNodes {
    /*
        https://www.techiedelight.com/find-all-nodes-at-given-distance-from-leaf-nodes-in-a-binary-tree/
        Given a binary tree, write an efficient algorithm to find all nodes present at a given distance from any leaf node.
        We need to find only those nodes that are present in the root-to-leaf path for that leaf.
     */

    public static Set<Integer> findAllNodesAtAGivenDistanceFromLeafNodes(TreeNode root, int distance) {
        Set<Integer> resSet = new HashSet<>();
        Stack <TreeNode> stack = new Stack<>();
        TreeNode current_node = root;

        // Start post order traverse
        do{
            if(current_node!= null){
                stack.push(current_node);
                current_node = current_node.left;
            } else {
                if(stack.isEmpty())  break;
                current_node = stack.peek().right;
                if(current_node == null){
                    TreeNode last_node = null;
                    while(!stack.isEmpty() && stack.peek().right == last_node){
                        last_node = stack.peek();
                        // get distance value from stack once we find a leaf node
                        if(last_node.left == null && last_node.right == null && stack.size() > distance) {
                            resSet.add(stack.get(stack.size() - distance-1).val);
                        }
                        stack.pop();
                    }
                }
            }
        }while(true);

        return resSet;
    }
}
