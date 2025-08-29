import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int sum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i - 1 >= 0 && j + 1 < m) {
                    sum = Math.max(grid[i][j] + grid[i][j+1] + grid[i-1][j], sum);
                }
                if (i-1 >= 0 && j-1 >= 0) {
                    sum = Math.max(grid[i][j] + grid[i-1][j] + grid[i][j-1], sum);
                }
                if (i + 1 < n && j-1 >= 0) {
                    sum = Math.max(grid[i][j] + grid[i+1][j] + grid[i][j-1], sum);
                }
                if (i + 1 < n && j + 1 < m) {
                    sum = Math.max(grid[i][j] + grid[i+1][j] + grid[i][j+1], sum);
                }

                if (j + 2 < m) {
                    sum = Math.max(grid[i][j] + grid[i][j+1] + grid[i][j+2], sum);
                }
                if (i + 2 < n) {
                    sum = Math.max(grid[i][j] + grid[i+1][j] + grid[i+2][j], sum);
                }

                // System.out.println(i + ", " + j + ": " + sum);
            }
        }

        System.out.println(sum);
    }
}