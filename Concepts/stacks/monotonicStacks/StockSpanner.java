package Concepts.stacks.monotonicStacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StockSpanner {

    private Stack<Pair> stack;
   private int idx;
    private class Pair{
        int val;
        int idx;
        Pair(int val, int idx){
            this.val = val;
            this.idx = idx;
        }
    }
    public StockSpanner() {
        this.stack = new Stack<>();
        this.idx = 0;
    }

    public int next(int price) {
        while(!this.stack.isEmpty() && this.stack.peek().val<=price){
            this.stack.pop();
        }
        int ans = this.idx - (stack.isEmpty() ? -1 : stack.peek().idx) ;
        this.stack.push(new Pair(price, this.idx));
        this.idx++;
        return ans;
    }
}