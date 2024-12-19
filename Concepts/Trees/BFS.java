package Concepts.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void bfs(Node node){
        if(node==null) return;
        Queue<Node> list = new LinkedList<>();
        list.add(node);
        while(!list.isEmpty()){
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Node temp = list.poll();
                System.out.print(temp.val);
                if(temp.left!=null) list.add(temp.left);
                if(temp.right!=null) list.add(temp.right);
            }
            System.out.println();
        }
    }
}
