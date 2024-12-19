import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BBQbuns {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            List<Integer> result = solution(n);
            for (int num : result){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        sc.close();
    }


    private static List<Integer> solution(int n) {
        List<Integer> list = new ArrayList<>();
        if(n%2==0){
            for(int i=1;i<=n/2;i+=1){
                list.add(i);
                list.add(i);
            }
            return list;
        }
        if(n<27){
            list.add(-1);
            return list;
        }
        list = new ArrayList<>(List.of(1, 2, 2, 3, 3, 4, 4, 5, 5, 1, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 13, 13, 1, 12));
        if(n==27) return list;
        for(int i=27;i<n;i+=2){
            list.add(i);
            list.add(i);
        }
        return list;
    }
}

