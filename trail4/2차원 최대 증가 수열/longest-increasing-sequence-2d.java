import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.

        int[][] dp = new int[n][m];
        dp[0][0] = 1;
        for (int cr = 1; cr < n; cr++) {
            for (int cc = 1; cc < m; cc++) {
                if (grid[0][0] >= grid[cr][cc]) continue;
                dp[cr][cc] = 2;
                for (int pr = cr -1; 0 < pr; pr--) {
                    for (int pc = cc-1; 0 < pc; pc--) {
                        if (grid[pr][pc] >= grid[cr][cc]) continue;
                        dp[cr][cc] = Math.max(dp[cr][cc], dp[pr][pc] + 1);
                    }
                }
            }
        }
        int answer = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                answer = Math.max(answer, dp[r][c]);
            }
        }
        System.out.print(answer);
        
    }
}