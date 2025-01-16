package Concepts.Trees;

import Concepts.Trees.Views.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidth {
    public static int maxWidth(Node root){
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));
        int ans = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            int mmin = queue.peek().pos;
            int front = 0, end = 0;
            for (int i = 0; i < size; i++) {
                Pair pair = queue.poll();
                Node curr_node = pair.node;
                int curr_pos = pair.pos-mmin;
                if(i==0) front = curr_pos;
                if(i==size-1) end = curr_pos;
                if(curr_node.left!=null) queue.add(new Pair(curr_node.left, 2*curr_pos+1));
                if(curr_node.right!=null) queue.add(new Pair(curr_node.right, 2*curr_pos+2));
            }
            ans = Math.max(ans, end-front+1);
        }
        return ans;
    }
}
