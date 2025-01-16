package Concepts.bitManipulation;

public class division {
    public static void main(String[] args) {
        int nem = -2147483648;
        int den = -1;

        System.out.println(divide(nem, den));
    }


    public static int divide(int nem, int den) {
        long qutient = 0;
        if(nem==den) return 1;
        boolean sign = (nem > 0) == (den > 0);

        long n = Math.abs((long)nem);
        long d = Math.abs((long)den);
        while(n>=d){
            long count = 0;
            while(n>=d<<(count+1)){
                count++;
            }
            qutient += 1L <<count;
            n -= d<<count;
        }
        if(qutient>=Integer.MAX_VALUE && sign) return Integer.MAX_VALUE;
        if(qutient>=Integer.MAX_VALUE && !sign) return Integer.MIN_VALUE;
        if(!sign) return -1*(int)qutient;
        return (int)qutient;
    }
}
