package Concepts.Trees.Traversal;

import Concepts.Trees.Node;

import java.util.*;

public class VerticalOrderTraversal {

    static class Pair{
        Node node;
        int pos;
        Pair(Node node, int pos){
            this.node = node;
            this.pos = pos;
        }
    }
    public static void vertical(Node root){
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                Pair pair = queue.poll();
                Node node = pair.node;
                int pos = pair.pos;
                if(map.containsKey(pos)){
                    map.get(pos).add(node.val);
                }else{
                    map.put(pos, new ArrayList<>());
                    map.get(pos).add(node.val);
                }
                Collections.sort(map.get(pos));
                if(node.left!=null) queue.add(new Pair(node.left, pos-1));
                if(node.right!=null) queue.add(new Pair(node.right, pos+1));
            }
        }
        for(Map.Entry<Integer, List<Integer>> item : map.entrySet()){
            System.out.println(item.getValue());
        }

    }
}
