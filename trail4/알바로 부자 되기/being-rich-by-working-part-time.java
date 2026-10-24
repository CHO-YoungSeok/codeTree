import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        int[] e = new int[n];
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = sc.nextInt();
            e[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }
        // Please write your code here.
        int answer = 0;
        int[] dp = new int[n+1];
        for (int i = 0; i < n; i++) {
            dp[i] = p[i];
            for (int j = 0; j < n; j++) {
                if (e[j] >= s[i]) continue;
                dp[i] = Math.max(dp[i], dp[j] + p[i]);
            }
            answer = Math.max(answer, dp[i]);
        }

        System.out.println(answer);
    }
}