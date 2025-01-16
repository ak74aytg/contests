package Concepts.stacks.practise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class removeDupLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(removeDuplicateLetters(s));
    }

    public static String removeDuplicateLetters(String s) {
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            frequency.put(s.charAt(i), frequency.getOrDefault(s.charAt(i), 0)+1);
        }
        HashSet<Character> set = new HashSet<>();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            frequency.put(s.charAt(i), frequency.get(s.charAt(i))-1);
            if(set.contains(s.charAt(i))) continue;
            while(!stack.isEmpty() && stack.peek()>s.charAt(i) && frequency.get(stack.peek())>0){
                set.remove(stack.pop());
            }
            stack.push(s.charAt(i));
            set.add(s.charAt(i));
        }
        StringBuilder ans = new StringBuilder();
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}
