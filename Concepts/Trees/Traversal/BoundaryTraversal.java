package Concepts.Trees.Traversal;

import Concepts.Trees.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BoundaryTraversal {
    public static void boundary(Node root){
        //left traversal excluding leafs
        List<Integer> result = new ArrayList<>();
        leftTraversal(root, result);
        //leafs traversal
        leafTraversal(root, result);
        //right traversal excluding leafs
        Stack<Integer> stack = new Stack<>();
        rightTraversal(root, stack);
        while(!stack.isEmpty()){
            result.add(stack.pop());
        }
        result.removeLast();
        System.out.println(result);
    }

    private static void leftTraversal(Node root, List<Integer> list){
        if(root.left==null && root.right==null){
            return;
        }
        list.add(root.val);
        if(root.left!=null) leftTraversal(root.left, list);
        else leftTraversal(root.right, list);
    }
    private static void leafTraversal(Node root, List<Integer> list){
        if(root.left==null && root.right==null){
            list.add(root.val);
            return;
        }
        if(root.left!=null) leafTraversal(root.left, list);
        if(root.right!=null) leafTraversal(root.right, list);
    }
    private static void rightTraversal(Node root, Stack<Integer> list){
        if(root.left==null && root.right==null){
            return;
        }
        list.add(root.val);
        if(root.right!=null) leftTraversal(root.right, list);
        else leftTraversal(root.left, list);
    }
}
