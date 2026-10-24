import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        long[] dp = new long[n+4];
        dp[1] = 2;
        dp[2] = 7;
        dp[3] = 22;
        int sum = 2 + 7 + 22 + 1;
        for (int i = 4; i <= n; i++) {
            dp[i] = 2 * sum + dp[i-2];
            dp[i] %= 1000000007;
            sum += dp[i]; sum %= 1000000007;
        }

        System.out.println(dp[n]);
    }
}