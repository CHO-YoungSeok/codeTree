import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] coin = new int[n];
        for (int i = 0; i < n; i++)
            coin[i] = sc.nextInt();
        // Please write your code here.
        int[] dp = new int[m + 1];
        for (int i = 0; i < m + 1; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;
        for (int i = 1; i < m + 1; i++) {
            for (int c = 0; c < n; c++) {
                if (i - coin[c] >= 0 && dp[i - coin[c]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin[c]] + 1);
                }
            }
        }
        int answer = 0;
        if (dp[m] == Integer.MAX_VALUE) {
            answer = -1;
        } else {
            answer = dp[m];
        }
        System.out.print(answer);
    }
}