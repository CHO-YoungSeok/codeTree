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

        boolean[] dp = new boolean[m + 1];
        boolean[] buffer = new boolean[m + 1];
        dp[0] = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (
                    dp[j] && 
                    arr[i] + j < m + 1
                ) {
                    buffer[arr[i] + j] = true;
                }
            }
            dp = Arrays.copyOf(buffer, m + 1);
        }
        String answer = new String();
        if (dp[m]) {
            answer = "Yes";
        } else {
            answer = "No";
        }
        System.out.println(answer);

        // for (boolean b : dp) {
        //     System.out.print(b + " ");
        // }
    }
}