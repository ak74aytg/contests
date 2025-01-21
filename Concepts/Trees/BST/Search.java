package Concepts.Trees.BST;

import Concepts.Trees.Node;

public class Search {
    public static Node search(Node root, int val){
        if(root!=null && root.val != val){
            return val > root.val ? search(root.right, val) : search(root.left, val);
        }
        return root;
    }
}
