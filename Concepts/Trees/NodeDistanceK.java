package Concepts.Trees;

import java.util.*;

public class NodeDistanceK {
    public static void printNodes(Node root, int target, int k){
        HashMap<Node, Node> map = new HashMap<>();
        traverse(root, map);
        Node targetNode = findTarget(root, target);
        HashSet<Node> visited = new HashSet<>();
        List<Node> ans = getNodes(targetNode, k, map, visited);
        for (Node an : ans) {
            System.out.print(an.val + " ");
        }
    }

    private static List<Node> getNodes(Node target, int k, HashMap<Node, Node> parents, HashSet<Node> visited){
        Queue<Node> queue = new LinkedList<>();
        queue.add(target);
        visited.add(target);
        while(k>0){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if(node.left!=null && !visited.contains(node.left)){
                    queue.add(node.left);
                    visited.add(node.left);
                }
                if(node.right!=null && !visited.contains(node.right)){
                    queue.add(node.right);
                    visited.add(node.right);
                }
                if(parents.containsKey(node) && parents.get(node)!=null && !visited.contains(parents.get(node))){
                    queue.add(parents.get(node));
                    visited.add(parents.get(node));
                }
            }
            k--;
        }
        List<Node> ans = new ArrayList<>(queue);
        return ans;
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

    private static void traverse(Node root, HashMap<Node, Node> map){
        if(root.left!=null) {
            map.put(root.left, root);
            traverse(root.left, map);
        }
        if(root.right!=null) {
            map.put(root.right, root);
            traverse(root.right, map);
        }
    }
}
