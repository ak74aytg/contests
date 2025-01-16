package Concepts.Trees;

public class checkBalancedBinaryTree {
    public static boolean isBalanced(Node root){
        return check(root) !=-1;
    }

    private static int check(Node root){
        if(root==null){
            return 0;
        }
        int left = check(root.left);
        int right = check(root.right);
        if(left==-1 || right==-1 || Math.abs(left - right)>1) return -1;
        return 1+Math.max(left, right);
    }
}
