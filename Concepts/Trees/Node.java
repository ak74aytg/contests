package Concepts.Trees;

import Concepts.Trees.Traversal.BFS;
import Concepts.Trees.Traversal.DFS;
import Concepts.Trees.Views.BottomView;
import Concepts.Trees.Views.LeftView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class Node {
    public int val;
    public Node left;
    public Node right;

    Node(int val, Node left, Node right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    Node(){}

    Node(int val){
        this.val = val;
    }


    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = bf.readLine()
                                .replace("]", "")
                                .replace("[", "")
                                .split(",");
        Node root = createBinaryTree(arr, 0);
//        BurnTree.burn(root, );
//        NodeDistanceK.printNodes(root, 5, 2);
//        System.out.println(MaximumWidth.maxWidth(root));
//        LowestCommonAncestors.lca(root, 7,6);
//        rootToNodePath.path(root, 1);
//        LeftView.leftView(root);
//        BottomView.bottomView(root);
//        TopView.topView(root);
//        VerticalOrderTraversal.vertical(root);
//        BoundaryTraversal.boundary(root);
//        zigzagTraversal.zigzag(root);
//        System.out.println(MaxPathSum.maxPath(root));
//        System.out.println(DiameterOfBinaryTree.findDiameter(root));
//        DFS.PreorderTraversal(root);
    }


    private static Node createBinaryTree(String[] arr, int idx){
        if(idx>=arr.length || Objects.equals(arr[idx], "null")){
            return null;
        }

        Node curr = new Node(Integer.parseInt(arr[idx]));
        curr.left = createBinaryTree(arr, idx*2+1);
        curr.right = createBinaryTree(arr, idx*2+2);
        return curr;
    }
}
