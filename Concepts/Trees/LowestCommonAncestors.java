package Concepts.Trees;

import java.util.List;

public class LowestCommonAncestors {
    public static void lca(Node root, int node1, int node2){
        List<Node> path1 = rootToNodePath.path(root, node1);
        List<Node> path2 = rootToNodePath.path(root, node2);

        int size1 = path1.size();
        int size2 = path2.size();
        int i = 0;
        int j = 0;
        while(i<size1 && j<size2){
            if(path1.get(i)!=path2.get(j)){
                break;
            }
            i++;
            j++;
        }
        if(i==0 && j==0){
            System.out.println("null");
        }else{
            System.out.println(path1.get(i-1).val);
        }
    }
}
