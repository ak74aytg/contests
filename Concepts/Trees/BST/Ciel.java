package Concepts.Trees.BST;

import Concepts.Trees.Node;

public class Ciel {
    public static  Node ciel(Node root, int val){
        if(root.val==val) return root;
        if(root.val>val && (root.left==null || root.left.val<val)) return root;
        if(root.val<val && (root.right==null || root.right.val>val)) return root;
        return root.val > val ? ciel(root.left, val) : cile(root.right, val);  
    }
}
