package com.jhunter.tree.binarytree.constructbinarytree;

import java.util.TreeMap;

public class ArrayRepresentationOfBinaryTree {
    /*
        https://www.youtube.com/watch?v=zDlTxrEwxvg
        https://www.codewithharry.com/videos/data-structures-and-algorithms-in-hindi-64/

        Problem Statement:
        1. convert binary tree into an constructbinarytree.
        2. construct binary tree from constructbinarytree

        The formulae for calculating the constructbinarytree indices of the various relatives of a node are as follows. The total number of nodes in the tree is n. The index of the node in question is r, which must fall in the range 0 to n−1.
        Parent(r) =⌊(r−1)/2⌋ if r≠0.
        Left child(r) =2r+1 if 2r+1<n.
        Right child(r) =2r+2 if 2r+2<n.
        Left sibling(r) =r−1 if r is even and r≠0.
        Right sibling(r) =r+1 if r is odd and r+1<n.
     */
            /*
            // Creating an empty TreeMap

            TreeMap<Integer, String> tree_map
                    = new TreeMap<Integer, String>();

            // Mapping string values to int keys
            tree_map.put(10, "Geeks");
            tree_map.put(15, "4");
            tree_map.put(20, "Geeks");
            tree_map.put(25, "Welcomes");
            tree_map.put(30, "You");

            // Printing the elements of TreeMap
            System.out.println("TreeMap: " + tree_map);

            Output:
            TreeMap using TreeMap() constructor:
            TreeMap: {10=Geeks, 15=4, 20=Geeks, 25=Welcomes, 30=You}
             */

}


