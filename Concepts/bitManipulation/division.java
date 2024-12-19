package Concepts.bitManipulation;

public class division {
    public static void main(String[] args) {
        int nem = 18;
        int den = 3;

        System.out.println(nem/den);
        int qutient = 0;
        while(nem>=den){
            int count = 0;
            while(nem>=den<<count){
                count++;
            }
            qutient += 1<<count;
            nem -= den<<count;
        }
        System.out.println(qutient);
    }
}
