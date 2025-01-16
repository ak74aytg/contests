package Concepts.Trees;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class BurnTree {
    public static void burn(Node root, int start){
        HashMap<Node, Node> parent = new HashMap<>();
        findParent(root, parent);
        Node Start = findTarget(root, start);
        System.out.println(traverse(Start, parent));
    }

    private static int traverse(Node start, HashMap<Node, Node> parent){
        Queue<Node> queue = new LinkedList<>();
        HashSet<Node> visited = new HashSet<>();
        queue.add(start);
        visited.add(start);
        int time = 0;
        while(!queue.isEmpty()){
            Node node = queue.poll();
            if(parent.containsKey(node) && !visited.contains(parent.get(node))){
                queue.add(parent.get(node));
                visited.add(parent.get(node));
            }
            if(node.left!=null && visited.add(node.left)){
                queue.add(node.left);
                visited.add(node.left);
            }
            if(node.right!=null && visited.add(node.right)){
                queue.add(node.right);
                visited.add(node.right);
            }
            time++;
        }
        return time;
    }

    private static Node findTarget(Node root, int target){
        if(root.val==target) return root;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node targetNode = queue.poll();
                if(targetNode.val==target) return targetNode;
                if(targetNode.left!=null) queue.add(targetNode.left);
                if(targetNode.right!=null) queue.add(targetNode.right);
            }
        }
        return null;
    }

    private static void findParent(Node root, HashMap<Node, Node> parent){
        if(root==null) return;
        if(root.left!=null){
            parent.put(root.left, root);
            findParent(root.left, parent);
        }
        if(root.right!=null){
            parent.put(root.right, root);
            findParent(root.right, parent);
        }
    }
}
