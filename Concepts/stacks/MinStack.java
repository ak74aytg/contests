package Concepts.stacks;

import java.util.Stack;

public class MinStack {
    private static Stack<Integer> stack;
    private static int min;
    public static void main(String[] args) {
        stack = new Stack<>();
        push(12);
        push(15);
        push(10);
        getMin();
        pop();
        getMin();
        System.out.println(top());
        push(10);
        System.out.println(top());
    }

    private static void push(int val){
        if(stack.isEmpty()){
            min = val;
            stack.push(val);
        }else{
            if(val>min) stack.push(val);
            else {
                stack.push(2*val-min);
                min = val;
            }
        }
    }

    private static void pop(){
        if(stack.isEmpty()){
            return;
        }
        int x = stack.pop();
        if(x<min){
            min = 2*min-x;
        }

    }

    private static int top(){
        if(stack.isEmpty()){
            return -1;
        }
        int x = stack.peek();
        if(min<x) return x;
        else return min;
    }

    private static void getMin(){
        System.out.println(min);
    }
}
