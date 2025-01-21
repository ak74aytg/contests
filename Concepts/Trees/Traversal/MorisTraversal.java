package Concepts.Trees.Traversal;

import java.util.ArrayList;
import java.util.List;

import Concepts.Trees.Node;

//Threaded binary tree
public class MorisTraversal {
    public static void InoderTraverse(Node root){
        List<Integer> list = new ArrayList<>();
        Node cur = root;
        while(cur!=null){
            if(cur.left==null){
                list.add(cur.val);
                cur = cur.right;
            }else{
                Node pred = cur.left;
                while(pred.right!=null && pred.right!=cur){
                    pred = pred.right;
                }
                if(pred.right==null){
                    pred.right = cur;
                    cur = cur.left;
                }else{
                    pred.right = null;
                    list.add(cur.val);
                    cur = cur.right;
                }
            }
        }
        System.out.println(list);
    }


    public static void PreoderTraversal(Node root){
        List<Integer> list = new ArrayList<>();
        Node cur = root;
        while(cur!=null){
            if(cur.left==null){
                cur = cur.right;
                list.add(cur.val);
            }else{
                Node pred = cur.left;
                while(pred.right!=null && pred.right!=cur){
                    pred = pred.right;
                }
                if(pred.right==null){
                    pred.right = cur;
                    cur = cur.left;
                    list.add(cur.val);
                }else{
                    pred.right = null;
                    cur = cur.right;
                }
            }
        }
        System.out.println(list);
    }
}
