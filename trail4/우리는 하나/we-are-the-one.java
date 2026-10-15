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
        int[] roomSizes = new int[n * n];
        int roomHead = 0;
        int[] que = new int[n * n];
        boolean[][] visited = new boolean[n][n];
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        for (int r = 0;  r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (visited[r][c]) continue;
                int size = 0, head = 0, tail = 0;
                size++; visited[r][c] = true;
                que[tail++] = r * n + c;
                while (head < tail) {
                    int curr = que[head++];
                    int cr = curr / n;
                    int cc = curr % n;

                    for (int de = 0; de < 4; de++) {
                        int nr = cr + dr[de];
                        int nc = cc + dc[de];
                        if (!(0<= nr && nr < n && 0<= nc && nc<n)) continue;
                        int gap = Math.abs(grid[cr][cc] - grid[nr][nc]);
                        if (visited[nr][nc] || !(u <= gap && gap <= d)) continue;
                        // System.out.println(r +" " + c + ", " + nr + " " + nc + " :gap= " + gap);
                        size++; visited[nr][nc] = true;
                        que[tail++] = nr * n + nc;
                    }
                }
                roomSizes[roomHead++] = size;
                // System.out.print(roomSizes[roomHead-1] + " ");
            }
        }

        Arrays.sort(roomSizes);
        int answer = 0;
        for (int i = 0; i < k; i++) {
            answer+=roomSizes[n*n-i-1];
            // System.out.println(roomSizes[n*n-i-1]);
        }

        System.out.println(answer);
    }
}