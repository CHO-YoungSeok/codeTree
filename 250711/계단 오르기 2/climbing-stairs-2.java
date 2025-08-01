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
        dp[2][0] = coins[1];
        dp[2][1] = 0;
        dp[2][2] = dp[1][1] + coins[1];

        for (int i = 3; i < n + 1; i++) {
            if (i % 2 == 0) {
                dp[i][0] = dp[i - 2][0] + coins[i - 1];
            }

            for (int  j = 1; j < 4; j++) {
                if (dp[i - 1][j - 1] == 0){
                    continue;
                }

                dp[i][j] = Math.max(dp[i- 1][j - 1], dp[i - 2][j]) + coins[i - 1];
            }
        }

        // for(int[] arr : dp) {
        //     for (int num : arr) {
        //         System.out.print(num + " ");
        //     }
        //     System.out.println();
        // }

        int result = 0;
        for(int num : dp[n]) {
            result = Math.max(result, num);
        }
        System.out.println(result);

    }
}