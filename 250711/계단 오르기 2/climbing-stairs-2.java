import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        // Please write your code here.
        int[][] dp = new int[n + 1][3 + 1];
        dp[0][0] = 0;
        dp[1][0] = 0;
        dp[1][1] = coins[0];
        dp[2][0] = 0;
        dp[2][1] = Math.max(dp[1][0] + coins[1], dp[1][1]);
        dp[2][2] = dp[1][1] + coins[1];

        for (int i = 3; i < n + 1; i++) {
            for (int j = 1; j < 4; j++) {
                dp[i][j] = Math.max(dp[i - 1][j - 1] + coins[i - 1], dp[i - 2][j] + coins[i - 1]);
            }
        }
        // for (int[] row : dp) {
        //     for (int num : row) {
        //         System.out.print(num + " ");
        //     }
        //     System.out.println();
        // }
        int result = 0;
        for (int i = 1;  i < 4; i++) {
            result = Math.max(dp[n][i], result);
        }
        System.out.println(result);
        
    }
}