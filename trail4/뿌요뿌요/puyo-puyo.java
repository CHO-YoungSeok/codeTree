import java.util.Scanner;

public class Main {
    static int n;
    static int[][] grid;
    static boolean[][] visited;
    static int[] dr = {-1, 0, 1, 0};
    static int[] dc = {0, 1, 0, -1};
    static int blockSize = 0;
    static int maxBlockSize = 0;
    static int blockCount = 0;

    static void dfs (int r, int c) {
        for (int di = 0; di < 4; di++) {
            int nr = r + dr[di];
            int nc = c + dc[di];

            if (!(0 <= nr && nr < n && 0 <= nc && nc < n)) continue;
            if (visited[nr][nc]) continue;
            if (grid[r][c] != grid[nr][nc]) continue;
            visited[nr][nc] = true;
            blockSize++;
            dfs(nr, nc);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        visited  =  new boolean[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        // Please write your code here.
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (visited[r][c]) continue;
                visited[r][c] = true;
                blockSize = 1;
                dfs(r, c);
                if (blockSize >= 4) {
                    blockCount++;
                }
                maxBlockSize = Math.max(maxBlockSize, blockSize);
            }
        }
        System.out.println(blockCount + " " + maxBlockSize);
    }
}