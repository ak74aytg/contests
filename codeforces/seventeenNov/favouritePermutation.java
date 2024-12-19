import java.util.Scanner;

public class favouritePermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if(n<5){
                System.out.println(-1);
                continue;
            }
            int[] result = new int[n];
            result[n/2] = 5;
            result[n/2-1] = 4;
            int even = 0;
            int odd = n/2+1;
            for(int i=1;i<=n;i++){
                if(i%2==0 && i!=4){
                    result[even++] = i;
                }
                if(i%2!=0 && i!=5){
                    result[odd++] = i;
                }
            }
            for(int num : result){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
