import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        int[] dist = new int[n];
        Arrays.fill(dist, -1);
        dist[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int step = 1; step <= arr[i]; step++) {
                if (i + step >= n) continue;
                if (dist[i + step] != -1) 
                    dist[i+step] = Math.min(dist[i] + 1, dist[i + step]);
                else
                    dist[i+step] = dist[i] + 1;
            }
        }

        System.out.println(dist[n-1]);


    }
}