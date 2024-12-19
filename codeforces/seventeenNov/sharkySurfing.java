

import java.util.*;

public class sharkySurfing {

    private static class Info implements Comparable<Info> {
        int x;
        int y;
        int type;

        Info(int x, int y, int type) {
            this.x = x;
            this.y = y;
            this.type = type;
        }

        @Override
        public int compareTo(Info o) {
            return this.x - o.x;
        }

        @Override
        public String toString() {
            return "Info{" +
                    "x=" + x +
                    ", y=" + y +
                    ", type=" + type +
                    '}';
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int j = 0; j < t; j++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int L = sc.nextInt();

            List<Info> changes = new ArrayList<>();

            //hurdles
            for (int i = 0; i < n; i++) {
                changes.add(new Info(sc.nextInt(), sc.nextInt(), 1));
            }

            //powerUps
            for (int i = 0; i < m; i++) {
                changes.add(new Info(sc.nextInt(), sc.nextInt(), 0));
            }

            Queue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

            Collections.sort(changes);
            int currentPower = 1;
            int totalPowerUps = 0;
            boolean possible = true;
            for (Info item : changes) {
                if(item.type==0){
                    maxHeap.add(item.y);
                }
                if (item.type==1){
                    while (currentPower<item.y-item.x+2 && !maxHeap.isEmpty()){
                        currentPower+=maxHeap.poll();
                        totalPowerUps++;
                    }
                    if(currentPower<item.y-item.x+2){
                        possible=false;
                        System.out.println(-1);
                        break;
                    }
                }
            }
            if (possible) System.out.println(totalPowerUps);
        }
        sc.close();
    }
}
