package Concepts.Trees;

import java.util.Stack;

public class FlattenTree {
    public static Node flatten(Node root){
        Node curr = root;
        while(curr!=null){
            if(curr.left!=null){
                Node pred = curr.left;
                while(pred.right!=null &&pred.right!=curr){
                    pred = pred.right;
                }
                if(pred.right==curr){
                    pred.right = curr.right;
                    curr.right = null;
                }
                if(pred.right == null){
                    pred.right = curr;
                }
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
        return curr;
    }


    private static Node prev = null;

    public static void recFlatten(Node root){
        if(root==null)return;
        recFlatten(root.right);
        recFlatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }


    public static void stackFlatten(Node root){
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node curr = stack.pop();
            if(curr.right != null) stack.push(curr.right);
            if(curr.left != null) stack.push(curr.left);
            if(!stack.isEmpty()) curr.right = stack.peek(); 
            curr.left = null;
        }
    }

}
