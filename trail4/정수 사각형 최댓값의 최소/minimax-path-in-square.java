import java.util.Scanner;
public class Main {
    static int n;
    static int[] dr = {0, 1};
    static int[] dc = {1, 0};
    static int[][] dp;
    static int[][] matrix;

    static void dfs(int r, int c, int max) {
        if (r == n-1 && c == n-1) {
            return;
        }

        for (int i = 0; i < 2; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];
            if (!(nr < n && nc < n)) continue;
            int nMax = Math.max(max, matrix[nr][nc]);
            if (dp[nr][nc] != 0 && dp[nr][nc] <= nMax) continue;
            dp[nr][nc] = nMax;
            dfs(nr, nc, nMax);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        dp = new int[n][n];
        matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        dp[0][0] = matrix[0][0];
        dfs(0, 0, matrix[0][0]);
        System.out.print(dp[n-1][n-1]);
    }
}