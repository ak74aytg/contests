package Concepts.Trees;

public class MaxPathSum {
    public static int maxPath(Node root){
        int[] dp = new int[1];
        maxPath(root, dp);
        return dp[0];
    }

    private static int maxPath(Node root, int[] dp){
        if(root==null){
            return 0;
        }
        int left = maxPath(root.left, dp);
        int right = maxPath(root.right, dp);
        dp[0] = Math.max(dp[0], left+right+root.val);
        return root.val+Math.max(left, right);
    }
}
