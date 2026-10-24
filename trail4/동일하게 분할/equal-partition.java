import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        // Please write your code here.
        if (sum % 2 == 1) {
            System.out.print("No");
            return;
        }
        int half = sum / 2;
        boolean[] dp = new boolean[half + 1];
        Arrays.sort(arr);
        for (int i = 0; i  < n; i++) {
            if (arr[i] > half) {
                System.out.print("No");
                return;
            }
        }
        dp[0] = true; 
        for (int i = 0;  i < n; i++) {
            for (int j = half;  0 <= j; j--) {
                if (dp[j] && j + arr[i] <= half) {
                    dp[j + arr[i]] = true;
                }
            }
        }

        if (dp[half]) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}