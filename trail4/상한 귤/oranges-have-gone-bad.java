import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[][] grid = new int[n][n];
        int[][] gone = new int[n][n];
        int[] que = new int[n*n];
        int head = 0, tail = 0, time = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
                if (grid[i][j] == 0) {
                    gone[i][j] = -1;
                } else if (grid[i][j] == 1) { 
                    gone[i][j] = -2;
                } else {
                    gone[i][j] = 0;
                    que[tail++] = i * n  + j;
                }
            }
        // Please write your code here.

        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};
        
        while (head < tail) {
            int currTail = tail;
            time++;
            while (head < currTail) {
                int currNode = que[head++];
                int cr = currNode / n;
                int cc = currNode % n;
                for (int di = 0; di < 4; di++) {
                    int nr = cr + dr[di];
                    int nc = cc + dc[di];
                    if (!(0 <= nr && nr < n && 0 <= nc && nc < n)) continue;
                    if (grid[nr][nc] != 1) continue;
                    grid[nr][nc] = 2;
                    gone[nr][nc] = time;
                    que[tail++] = nr * n + nc;
                }
            }
        }

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                System.out.print(gone[r][c] + " ");
            }
            System.out.println();
        }
        
    }
}