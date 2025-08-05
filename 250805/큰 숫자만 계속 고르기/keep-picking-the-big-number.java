import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        // Please write your code here.
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int n : nums) {
            pq.add(n);
        }

        for (int i  = 0; i < M; i++) {
            pq.add(pq.poll() - 1);
            // System.out.println(pq.peek());
        }

        System.out.println(pq.peek());

    }
}