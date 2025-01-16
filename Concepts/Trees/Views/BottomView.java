package Concepts.Trees.Views;

import Concepts.Trees.Node;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BottomView {

    public static void bottomView(Node root){
        TreeMap<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Pair pair = queue.poll();
                Node node = pair.node;
                int pos = pair.pos;

                map.put(pos, node.val);
                if(node.left!=null) queue.add(new Pair(node.left, pos-1));
                if(node.right!=null) queue.add(new Pair(node.right, pos+1));
            }
        }
        for (Map.Entry<Integer, Integer> item : map.entrySet()){
            System.out.print(item.getValue()+" ");
        }
    }
}
