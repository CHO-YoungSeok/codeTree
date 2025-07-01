import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        int[] dp = new int[m + 1];
        for (int i = 0; i < m + 1; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        dp[0] = 0;

        for (int i = 0; i < n; i++) {
            for (int j = m; 0 < j; j--) {
                if (j - arr[i] >= 0 && dp[j - arr[i]] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], dp[j - arr[i]] + 1);
                }
            }
        }

        int answer = 0;
        if (dp[m] == Integer.MAX_VALUE) {
            answer = -1;
        } else {
            answer = dp[m];
        }
        System.out.println(answer);

    }
}