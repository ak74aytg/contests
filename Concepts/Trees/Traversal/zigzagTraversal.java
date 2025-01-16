package Concepts.Trees.Traversal;

import Concepts.Trees.Node;

import java.util.*;

public class zigzagTraversal {
    public static void zigzag(Node root){
        if(root==null){
            return;
        }
        List<int[]> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        boolean leftToright = false;
        while(!queue.isEmpty()){
            int size = queue.size();
            int[] list = new int[size];
            for (int i = 0; i < size; i++) {
                Node tempNode = queue.poll();
                if(tempNode.left!=null) queue.add(tempNode.left);
                if(tempNode.left!=null) queue.add(tempNode.right);
                if (leftToright){
                    list[size-i-1] = tempNode.val;
                }else{
                    list[i] = tempNode.val;
                }
            }
            result.add(list);
            leftToright = !leftToright;
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(Arrays.toString(result.get(i)));
        }
    }
}
