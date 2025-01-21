// package round997div2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;

public class FindPermutation {
    static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        int t = Integer.parseInt(bf.readLine());
        while (t-- > 0) {
            solve();
        }
    }
    
    private static void solve() throws IOException {
        int n = Integer.parseInt(bf.readLine());
        String[][] adj = new String[n][n];
        for (int i = 0; i < n; i++) {
            adj[i] = bf.readLine().split("");
        }
        int[] l = new int[n];
        int[] r = new int[n];
        Arrays.fill(l, 0);
        Arrays.fill(r, n-1);

        int ans[] = new int[n];
        for(int i = 0; i < n; i++) {
            int cnt = 0;
            for(int j=0;j<n;j++){
                if(l[i]==l[j] &&r[i]==r[j] && Objects.equals(adj[i][j], "1")){
                    cnt++;
                }
            }
            int pos = r[i]-cnt;
            ans[pos] = i+1;
            for(int j=0;j<n;j++){
                if(l[i]==l[j] && r[i]==r[j] && i!=j){
                    if(Objects.equals(adj[i][j], "1")){
                        l[j] = pos+1;
                    }else{
                        r[j] = pos-1;
                    }
                }
            }
            l[i] = r[i] = pos;
        }
        for(int i=0;i<n;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
}
