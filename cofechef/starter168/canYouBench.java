package cofechef.starter168;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class canYouBench {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bf.readLine());
        System.out.println(x+10*2);
    }
}
