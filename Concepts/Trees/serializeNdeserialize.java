package Concepts.Trees;

import java.util.LinkedList;
import java.util.Queue;

public class serializeNdeserialize {
    public static String Serialize(Node root){
        StringBuilder s = new StringBuilder();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if(node!=null) s.append(node.val+"|");
                else s.append("#|");
                if(node!=null){
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
        }
        return s.toString();
    }


    public static Node DeSerialize(String s){
        Queue<Node> queue = new LinkedList<>();
        String[] data = s.split("|");
        Node root = new Node(Integer.parseInt(data[0]));
        queue.add(root);
        for (int i = 1; i < data.length; i++) {
            Node node = queue.poll();
            if(data[i]!="#"){
                Node left = new Node(Integer.parseInt(data[i]));
                node.left = left;
                queue.add(left);
            }
            if(data[++i]!="#"){
                Node right = new Node(Integer.parseInt(data[i]));
                node.right = right;
                queue.add(right);
            }
        }
        return root;
    }
}
