package Concepts.Trees;

public class DFS {
    public static void PreorderTraversal(Node node){
        if(node==null) return;
        System.out.print(node.val+" ");
        PreorderTraversal(node.left);
        PreorderTraversal(node.right);
    }


    public static void PostorderTraversal(Node node){
        if(node==null) return;
        PreorderTraversal(node.left);
        PreorderTraversal(node.right);
        System.out.print(node.val+" ");
    }

    public static void InorderTraversal(Node node){
        if(node==null) return;
        PreorderTraversal(node.left);
        System.out.print(node.val+" ");
        PreorderTraversal(node.right);
    }
}
