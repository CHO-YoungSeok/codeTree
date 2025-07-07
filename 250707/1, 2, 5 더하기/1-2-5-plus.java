import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        dp[4] = 5;
        dp[5] = 9;
        int[] nums = {1, 2, 5};
        for (int i = 6; i < n + 1; i++) {
            for (int j = 0; j < 3; j++) {
                if (
                    i - nums[j] >= 0
                ) {
                    dp[i] += dp[i - nums[j]];
                    dp[i] %= 10007;
                }
            }
        }
        System.out.println(dp[n]);
    }
}