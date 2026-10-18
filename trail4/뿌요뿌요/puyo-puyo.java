import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();

        // Please write your code here.

        boolean[][] visited = new boolean[n][n];
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        int[] que = new int[n*n];
        int head = 0, tail = 0;
        int maxSize = 0, size = 0, countBlock = 0;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (visited[r][c]) continue;
                head = 0; tail = 0; size = 0;
                visited[r][c] = true; size++;
                que[tail++] = r * n + c;
                while (head < tail) {
                    int currPoint = que[head++];
                    int cr = currPoint / n;
                    int cc = currPoint % n;
                    for (int di = 0; di <4; di++) {
                        int nr = cr + dr[di];
                        int nc = cc + dc[di];
                        if (!(0 <= nr && nr < n && 0<= nc && nc < n)) continue;
                        if (visited[nr][nc]) continue;
                        if (grid[cr][cc] != grid[nr][nc]) continue;
                        visited[nr][nc] = true; size++;
                        que[tail++] = nr * n + nc; 
                    }
                }
                if (size >= 4) {
                    countBlock++;                    
                }
                maxSize = Math.max(maxSize, size);
            }
        }
        System.out.println(countBlock + " " + maxSize);


    }
}