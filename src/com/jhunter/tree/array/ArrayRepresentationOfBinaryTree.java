package com.jhunter.tree.array;

public class ArrayRepresentationOfBinaryTree {
    /*
        https://www.youtube.com/watch?v=zDlTxrEwxvg
        https://www.codewithharry.com/videos/data-structures-and-algorithms-in-hindi-64/

        Problem Statement:
        1. convert binary tree into an array.
        2. construct binary tree from array

        The formulae for calculating the array indices of the various relatives of a node are as follows. The total number of nodes in the tree is n. The index of the node in question is r, which must fall in the range 0 to n−1.
        Parent(r) =⌊(r−1)/2⌋ if r≠0.
        Left child(r) =2r+1 if 2r+1<n.
        Right child(r) =2r+2 if 2r+2<n.
        Left sibling(r) =r−1 if r is even and r≠0.
        Right sibling(r) =r+1 if r is odd and r+1<n.
     */
}
