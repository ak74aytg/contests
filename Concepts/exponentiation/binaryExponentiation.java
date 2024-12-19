package Concepts.exponentiation;

public class binaryExponentiation {
    public static void main(String[] args) {
        System.out.println(BinaryExpo(2, 62));
    }

    private static long BinaryExpo(long num, int pow){
        if(pow==1){
            return num;
        }
        if(pow==0){
            return 1;
        }
        long sqr = BinaryExpo(num, pow/2);
        sqr = sqr*sqr;
        if(pow%2==0){
            return sqr;
        }else{
            return sqr*num;
        }
    }
}
