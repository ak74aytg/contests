package Concepts.stacks.monotonicStacks;

import java.util.Scanner;
import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeKdigits(s, 1));
    }


    public static String removeKdigits(String num, int k) {
        if(num.length()==k) return "0";
        StringBuilder s = new StringBuilder(num);
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        int n = s.length();
        for(int i=1;i<n;i++){
            if(!stack.isEmpty() && stack.peek()-s.charAt(i)>0){
                while(!stack.isEmpty() && k>0 && stack.peek()-s.charAt(i)>0){
                    stack.pop();
                    k--;
                }
            }
            stack.push(s.charAt(i));
        }
        while(k>0){
            stack.pop();
            k--;
        }
        StringBuilder ans = new StringBuilder("");
        if(stack.isEmpty()) return "0";
        while(!stack.isEmpty()){
            ans.insert(0, stack.pop());
        }

        while(!ans.isEmpty() && ans.charAt(0)=='0'){
            ans.deleteCharAt(0);
        }
        if(ans.isEmpty()) return "0";
        return ans.toString();
    }
}
