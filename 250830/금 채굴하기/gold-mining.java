import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                for (int k = 0; k <= 2 * (n - 1); k++) {
                    int sum = 0;
                    for (int a = 0; a <= k; a++) {
                        for (int b = 0; b <= k; b++) {
                            if (Math.abs(a + b) <= k) {
                                if (i + a < n && j + b < n) {
                                    sum += grid[i + a][j + b];
                                }
                                if (i - a >= 0 && j - b >= 0) {
                                    sum += grid[i - a][j - b];
                                }
                            }
                        }
                    }
                    sum -= grid[i][j];

                    if (Math.pow(k, 2) + Math.pow(k + 1, 2) <= sum * m) {
                        max = Math.max(max, sum);
                    }
                }
            }
        }

        System.out.println(max);
    }
}