package Concepts.Trees;

import java.util.HashMap;

public class UniqueBinaryTree {
    public static Node uniqueBinaryTree(int[] preorder, int[] inorder){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return create(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, map);
    }

    private static Node create(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, HashMap<Integer, Integer> map){
        if(preStart>preEnd || inStart>inEnd) return null;
        Node root = new Node(preorder[preStart]);
        int idx = map.get(root.val);
        int length = idx - inStart;
        root.left = create(preorder, preStart+1, preStart+length, inorder, inStart, inEnd-1, map);
        root.right = create(preorder, preStart+length-1, preEnd, inorder, idx+1, inEnd, map);
        return root;
    }
}
