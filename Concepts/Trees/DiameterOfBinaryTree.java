package Concepts.Trees;

public class DiameterOfBinaryTree {
    private static int ans;
    public static int findDiameter(Node root){
        ans = 0;
        Diameter(root);
        return ans;
    }

    private static int Diameter(Node root){
        if(root==null){
            return 0;
        }
        int left = Diameter(root.left);
        int right = Diameter(root.right);
        ans = Math.max(ans, left+right);
        return 1+Math.max(left, right);
    }
}
