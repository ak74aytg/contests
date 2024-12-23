package Concepts.stacks;

import java.util.Stack;

public class InfixTopostfix {
    public static void main(String[] args) {
        String eq = "(p−q/r)*(s+t^u)";
        System.out.println(convert(eq));
    }

    private static String convert(String eq){
        StringBuilder s = new StringBuilder(eq);
        int n = s.length();
        StringBuilder ans = new StringBuilder("");
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9')){
                ans.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while(!stack.isEmpty() && stack.peek()!='('){
                    ans.append(stack.pop());
                }
                if(!stack.isEmpty()) stack.pop();
            }else {
                while(!stack.isEmpty() && priority(c)<=priority(stack.peek())){
                    ans.append(stack.pop());
                }
                stack.push(c);
            }
        }
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.toString();
    }

    private static int priority(Character c){
        if(c=='^') return 3;
        if(c=='*' || c=='/') return 2;
        if(c=='-' || c=='+') return 1;
        return -1;
    }
}
