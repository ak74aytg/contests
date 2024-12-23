import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PreparingForExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder result = new StringBuilder();

        while(t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            List<Integer> missingQuestions = new ArrayList<>();
            for (int i = 0; i < m; i++) {
                missingQuestions.add(sc.nextInt());
            }
            boolean[] knownQuestions = new boolean[n + 1];
            for (int i = 0; i < k; i++) {
                knownQuestions[sc.nextInt()] = true;
            }
            if (k == n) {
                result.append("1".repeat(m)).append("\n");
                continue;
            }
            if (n - k > 1) {
                result.append("0".repeat(m)).append("\n");
                continue;
            }
            int unknownQuestion = -1;
            for (int i = 1; i <= n; i++) {
                if (!knownQuestions[i]) {
                    unknownQuestion = i;
                    break;
                }
            }
            for (int i = 0; i < m; i++) {
                result.append(missingQuestions.get(i) == unknownQuestion ? "1" : "0");
            }
            result.append("\n");
        }
        System.out.print(result);
    }
}