import java.util.*;

public class pspspsps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt();
            scanner.nextLine(); // consume newline
            String s = scanner.nextLine();
            System.out.println(isPossible(s, n) ? "YES" : "NO");
        }
    }

    private static boolean isPossible(String s, int n) {
        int sCount = 0;
        int pCount = 0;
        int lastPosOfS = -1;
        int firstPosOfP = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 's') {
                sCount++;
                lastPosOfS = i;
            }
            if (s.charAt(i) == 'p') {
                pCount++;
                if(firstPosOfP==-1) firstPosOfP = i;
            }
        }
        if(sCount==0 || pCount==0 || lastPosOfS==0 || firstPosOfP==n-1){
            return true;
        }
        return false;
    }
}
