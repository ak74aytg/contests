package Concepts.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class candy
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] s = bf.readLine().split(",");
        int n = s.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(s[i]);
        }
        int i = 1;
        int ans = 1;
        while(i<n)
        {
            if(arr[i]==arr[i-1])
            {
                ans+=1;
                i++;
                continue;
            }
            int peak = 1;
            while(i<n && arr[i]>arr[i-1])
            {
                peak+=1;
                ans+=peak;
                i++;
            }
            int down = 1;
            while(i<n && arr[i]<arr[i-1])
            {
                ans+=down;
                i++;
                down+=1;
            }
            if(down>peak)
            {
                ans+=down-peak;
            }
        }
        System.out.println(ans);
    }
}
