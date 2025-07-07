import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] coin = new int[n];
        for (int i = 0; i < n; i++) {
            coin[i] = sc.nextInt();
        }
        // Please write your code here.

        int[] dp = new int[m + 1];
        for (int i = 1; i < m + 1; i++) {
            dp[i] = -1;
        }

        for (int i = 1; i < m + 1; i++) {
            for (int c = 0; c < coin.length; c++) {
                if (
                    i - coin[c] >= 0 &&
                    dp[i - coin[c]] != -1
                ) {
                    dp[i] = Math.max(dp[i], dp[i - coin[c]] + 1);
                }
            }
        }
        System.out.println(dp[m]);        
    }
}