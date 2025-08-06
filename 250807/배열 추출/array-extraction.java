import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            Comparator.comparingInt((Integer i) -> -i)
        );

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            // Please write your code here.

            if (x == 0) {
                if (pq.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(pq.poll());
                }
            } else {
                pq.add(x);
            }            
        }

        
    }
}