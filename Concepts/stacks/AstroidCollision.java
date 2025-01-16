package Concepts.stacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class AstroidCollision {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(",");
        int[] arr = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int[] ans = asteroidCollision(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int n = asteroids.length;
        for (int i = 0; i < n; i++) {
            int num = asteroids[i];
            if(num<0){
                while(!stack.isEmpty() && stack.peek()>0 && stack.peek()<Math.abs(num)){
                    stack.pop();
                }
                if(stack.isEmpty()) stack.push(num);
                else if(stack.peek()>Math.abs(num)) continue;
                else if(stack.peek()+num==0) stack.pop();
            }else{
                stack.push(num);
            }
        }
        int[] ans = new int[stack.size()];
        for (int i = stack.size()-1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}
