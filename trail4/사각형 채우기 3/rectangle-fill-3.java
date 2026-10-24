import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        long[] dp = new long[1001];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 7;
        long sum = 0;
        for (int  i = 0; i < 3; i++) {
            sum += dp[i];
        }
        for (int i = 3; i < n+1; i++) {
            dp[i] = 2*sum + dp[i-2];
            dp[i] %= 1000000007l;
            sum += dp[i] % 1000000007l;
        }
        System.out.println(dp[n]);      
    }
}