import java.util.*;

public class Math {
    static int n;
    static int k;
    static int[] nums;
    static HashMap<Integer, Integer> memo;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();  // number of test cases
        
        while (t-- > 0) {
            n = scanner.nextInt();
            k = scanner.nextInt();
            nums = new int[n];
            
            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }
            
            memo = new HashMap<>();
            System.out.println(solve());
        }
    }
    
    static int solve() {
        for(int i=0;i<n;i++){
            memo.put(nums[i], memo.getOrDefault(nums[i], 0)+1);
        }
        int diff = 0;
        for(Map.Entry<Integer, Integer> item : memo.entrySet()){
            if(!memo.containsKey(k-item.getKey())){
                diff += item.getValue();
            }else{
                if(memo.get(k-item.getKey()) < item.getValue()){
                    diff += item.getValue() - memo.get(k-item.getKey());
                }
            }
        }
        return n/2 - diff/2;
    }
}