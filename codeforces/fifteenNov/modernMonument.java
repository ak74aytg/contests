import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class modernMonument {

    public static int solution(int n, int[] heights){
//        int result = 0;
//        for(int i=0;i<n-1;i++){
//            if(heights[i]>heights[i+1]){
//                heights[i+1] = heights[i];
//                result++;
//            }
//        }
//        return result;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int height : heights){
            map.put(height, map.getOrDefault(height, 0)+1);
        }
        int freq = 0;
        for(Map.Entry<Integer, Integer> items : map.entrySet()){
            freq = Math.max(freq, items.getValue());
        }
        return n-freq;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i=0;i<t;i++){
            int n = scanner.nextInt();
            int[] heights = new int[n];

            // Read the heights of the pillars
            for (int j = 0; j < n; j++) {
                heights[j] = scanner.nextInt();
            }
            System.out.println();
            System.out.println(solution(n, heights));
        }
        // Close the scanner
        scanner.close();
    }
}

