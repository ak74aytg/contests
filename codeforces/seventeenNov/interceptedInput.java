

import java.util.*;

public class interceptedInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0;j<t;j++){
            int n = sc.nextInt();
            int target = n-2;
            int[] array = new int[n];
            HashSet<Integer> set = new HashSet<>();
            for(int i=0;i<n;i++){
                array[i] = sc.nextInt();
            }
            for(int i=0;i<n;i++){
                if(target%array[i]==0 && set.contains(target/array[i])){
                    System.out.println(array[i]+"  "+target/array[i]);
                    break;
                }
                set.add(array[i]);
            }

        }
        sc.close();
    }

}
