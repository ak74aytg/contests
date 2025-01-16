package cofechef.starter168;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class BigAchiever {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bf.readLine());
        StringBuilder result = new StringBuilder();
        while(t-->0){
            int n = Integer.parseInt(bf.readLine());
            int[] scores = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            Stack<Integer> stack = new Stack<>();
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                while(!stack.isEmpty() && stack.peek()<scores[i]){
                    stack.pop();
                }
                res[i] = stack.isEmpty() ? 1 : 0;
                stack.push(scores[i]);
            }
            result.append(Arrays.stream(res).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
            result.append("\n");
        }
        System.out.println(result);
    }
}
