package Concepts.Trees;

import java.util.ArrayList;
import java.util.List;

public class rootToNodePath {
    public static List<Node> path(Node root, int target){
        if(root==null) new ArrayList<>();
        List<Node> list = new ArrayList<>();
        printPath(root, target, list);

        return list;
    }

    private static boolean printPath(Node root, int target, List<Node> list){
        if(root==null) return false;
        list.add(root);
        if(root.val == target){
            return true;
        }
        if(printPath(root.left, target, list) || printPath(root.right, target, list)) return true;
        list.remove(root);
        return false;
    }
}
