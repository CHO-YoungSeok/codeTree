import java.util.*;

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
        for (int i = 1; i < m + 1; i++) {
            dp[i] = -1;
        }
        List<Integer> buffer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int num = m; 0 < num; num--) {
                if (
                    num - arr[i] >= 0 &&
                    dp[num - arr[i]] != -1
                ) {
                    dp[num] = 1;
                }
            }
        }
        if (dp[m] == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}