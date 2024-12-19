import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            result.add(new ArrayList<>());
            for(int j=0;j<i+1;j++){
                if(j==0 || j==i){
                    result.get(i).add(1);
                }else{
                    int num1 = result.get(i-1).get(j-1);
                    int num2 = result.get(i-1).get(j);
                    result.get(i).add(num2+num1);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int r = 5; // row number
        List<List<Integer>> ans = generate(r);
        for(int i=0;i<ans.size();i++){
            for(int j=0;j<ans.get(i).size();j++){
                System.out.print(ans.get(i).get(j));
            }
            System.out.println();
        }
    }
}
