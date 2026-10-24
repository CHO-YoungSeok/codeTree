import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int[] dp = new int[n+4];
        dp[1] = 1;
        dp[2] = 3;
        dp[3] = dp[2] + dp[1] * 2;
        for (int i = 4; i < n + 1; i++) {
            dp[i] = dp[i-1] + dp[i-2] * 2;
            dp[i] %= 10007;
        }
        System.out.print(dp[n]);
        
    }
}