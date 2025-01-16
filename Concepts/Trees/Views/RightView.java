package Concepts.Trees.Views;

import Concepts.Trees.Node;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class RightView {
    public static void rightView(Node root){
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Stack<Pair> stack = new Stack<>();
        stack.push(new Pair(root, 0));
        while(!stack.isEmpty()){
            Pair pair = stack.pop();
            Node temp = pair.node;
            int pos = pair.pos;
            if(!map.containsKey(pos)) map.put(pos, temp.val);
            if(temp.left!=null) stack.push(new Pair(temp.left, pos+1));
            if(temp.right!=null) stack.push(new Pair(temp.right, pos+1));
        }
        for(Map.Entry<Integer, Integer> item : map.entrySet()){
            System.out.print(item.getValue()+" ");
        }
    }
}
