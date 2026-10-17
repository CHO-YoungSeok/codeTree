import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int u = sc.nextInt();
        int d = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        int[] roomSizes = new int[n*n];
        int roomHead = 0;
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        boolean[][] visited = new boolean[n][n];
        int[] que = new int[n*n];

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (visited[r][c]) continue;
                int size = 1; visited[r][c] = true;
                int head = 0, tail = 0;

                que[tail++] = r * n + c;
                while(head < tail) {
                    int curr = que[head++];
                    int cr = curr / n;
                    int cc = curr % n;
                    for (int di = 0; di < 4; di++) {
                        int nr = cr + dr[di];
                        int nc = cc + dc[di];
                        if (!(0 <= nr && nr < n && 0 <= nc && nc < n)) continue;
                        int gap = Math.abs(grid[cr][cc] - grid[nr][nc]);
                        if (visited[nr][nc] || !(u <= gap && gap <= d)) continue;
                        size++; visited[nr][nc] = true;
                        que[tail++] = nr * n + nc;
                    }
                }
                roomSizes[roomHead++] = size;
                // System.out.println(String.format("(%d, %d) => %d", r, c, size));
            }
        }
        Arrays.sort(roomSizes);
        int answer = 0;
        for (int i = 0; i < k; i++) {
            answer += roomSizes[n * n -1 -i];
        }
        System.out.println(answer);
    

    }
}