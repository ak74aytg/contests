// package round999div2div1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Arithematic {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            solve();
        }
    }
    
    private static void solve() throws IOException {
        int n = Integer.parseInt(bf.readLine());
        int[] a = Arrays.stream(bf.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean hasEven = false;
        int oddCount = 0;
        for(int i=0;i<n;i++){
            if((a[i]&1)==0){
                hasEven = true;
            }else{
                oddCount++;
            }
        }
        if(!hasEven){
            System.out.println(n-1);
        }
        else System.out.println(oddCount+1);
    }
}
