package Concepts.dynamic_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseRobber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(houseRobber(arr));
        }
        sc.close();
    }

    public static long houseRobber(int[] valueInHouse) {
        if(valueInHouse.length==1){
            return valueInHouse[0];
        }
        List<Integer> temp1 = new ArrayList<>();
        List<Integer> temp2 = new ArrayList<>();
        // Write your code here.
        for (int i = 0; i < valueInHouse.length; i++) {
            if(i!=0) temp1.add(valueInHouse[i]);
            if(i!=valueInHouse.length-1) temp2.add(valueInHouse[i]);
        }
        return Math.max(minNonAdjSum(temp1), minNonAdjSum(temp2));
    }

    public static long minNonAdjSum(List<Integer> valueInHouse){
        int[] arr1 = new int[valueInHouse.size()];
        arr1[0] = valueInHouse.get(0);

        for(int i=1;i<valueInHouse.size();i++){
            int pickThisHouse = valueInHouse.get(i); if(i>1) pickThisHouse+=arr1[i-2];
            int doNotPickThisHouse = arr1[i-1];
            arr1[i] = Math.max(pickThisHouse, doNotPickThisHouse);
        }
        return arr1[arr1.length-1];
    }
}
