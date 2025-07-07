import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        // Please write your code here.

        int[] dp = new int[n];
        for (int i = 1; i < n; i++) {
            dp[i] = Integer.MIN_VALUE;
        }
        dp[0] = nums[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i -1] + nums[i], nums[i]);
        }
        int max = dp[0];
        for (int i : dp) {
            max = Math.max(i, max);
        }

        System.out.print(max);
        
    }
}