package Concepts.stacks.practise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BeautifulTowerII {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] input = bf.readLine().replace("[", "").replace("]", "").split(",");
        List<Integer> list = new ArrayList<>();
        for (String s : input) {
            list.add(Integer.parseInt(s));
        }
        System.out.println(maximumSumOfHeights(list));
    }

    public static long maximumSumOfHeights(List<Integer> maxHeights) {
        long[] left = maximumSumOfLeftHeights(maxHeights);
        long[] right = maximumSumOfRightHeights(maxHeights);
        long ans = -1;
        for (int i = 0; i < left.length; i++) {
            long sum = left[i]+right[i]-maxHeights.get(i);
            ans = Math.max(ans, sum);
        }
        return ans;
    }

    //5,1,6,5,3,9,2,7
    private static long[] maximumSumOfLeftHeights(List<Integer> arr){
        long[] prefix = new long[arr.size()];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.size(); i++) {
            while(!stack.isEmpty() && arr.get(stack.peek())>arr.get(i)){
                stack.pop();
            }
            if(stack.isEmpty()){
                prefix[i] = (long) (i + 1) *arr.get(i);
            }else{
                prefix[i] = prefix[stack.peek()]+ (long) (i - stack.peek()) *arr.get(i);
            }
            stack.push(i);
        }
        return prefix;
    }

    //5,1,6,5,3,9,2,7
    private static long[] maximumSumOfRightHeights(List<Integer> arr){
        long[] suffix = new long[arr.size()];
        Stack<Integer> stack = new Stack<>();
        int n = arr.size();
        for (int i = n-1; i > -1; i--) {
            while(!stack.isEmpty() && arr.get(stack.peek())>arr.get(i)){
                stack.pop();
            }
            if(stack.isEmpty()){
                suffix[i] = (long) (n - i) * arr.get(i);
            }else{
                suffix[i] = suffix[stack.peek()] + (long) (stack.peek()-i) * arr.get(i);
            }
            stack.push(i);
        }
        return suffix;
    }
}
