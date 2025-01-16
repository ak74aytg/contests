package Concepts.stacks.monotonicStacks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StockSpannerIO {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String input = bf.readLine();
        input = input.replace("[", "").replace("]","");
        String[] s = input.split(",");
        StringBuilder result = new StringBuilder("");

        StockSpanner ss = new StockSpanner();
        for (int i = 1; i < s.length; i++) {
            result.append(ss.next(Integer.parseInt(s[i])));
            result.append(" ");
        }
        System.out.println(result);
    }
}
