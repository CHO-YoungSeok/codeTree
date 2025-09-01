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

                    for (int r = 0; r < n; r++) {
                        for (int c = 0; c < n; c++) {
                            if (Math.abs(i - r) + Math.abs(j - c) <= k) {
                                sum += grid[r][c];
                            }
                        }
                    }
                    if (sum * m >= Math.pow(k,2) + Math.pow((k+1), 2)) {
                        max = Math.max(max, sum);
                    }
                }                
            }
        }

        System.out.println(max);



    }
}