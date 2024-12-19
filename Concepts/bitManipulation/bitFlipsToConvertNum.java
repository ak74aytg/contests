package Concepts.bitManipulation;

public class bitFlipsToConvertNum {
    public static void main(String[] args) {
        countFlips(10, 7);
    }

    private static void countFlips(int n1, int n2){
        int n = n1^n2;
        int ans = 0;
//        for (int i = 0; i < 31; i++) {
//            if((n & (1<<i))!=0){
//                ans++;
//            }
//        }
        while(n!=0){
            if((n&1)!=0){
                ans++;
            }
            n = n>>1;
        }
        System.out.println(ans);
    }
}
