import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][n];
        for(int r = 0; r < n; r++) {
            for(int c = 0; c < n; c++){
                grid[r][c] = sc.nextInt();
            }
        }

        int[] dr = {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] dc = {0, 1, 1, 1, 0, -1, -1, -1};

        while(0 < m) {
            int num = 1;
            while(num <= n * n) {
                int row = -1;
                int col = -1;
                for(int r = 0; r < n; r++) {
                    for(int c = 0; c < n; c++){
                        if(num == grid[r][c]) {
                            row = r;
                            col = c;
                        }
                    }
                }
                int max = 0;
                int dir = -1;
                for(int d = 0; d < 8; d++){
                    if(0 <= row + dr[d] && row + dr[d] < n && 0 <= col + dc[d] && col + dc[d] < n){
                        if(max < grid[row + dr[d]][col + dc[d]]){
                            max = grid[row + dr[d]][col + dc[d]];
                            dir = d;
                        }
                    }
                }
                
                int temp = grid[row][col];
                grid[row][col] = grid[row + dr[dir]][col + dc[dir]];
                grid[row + dr[dir]][col + dc[dir]] = temp;
                        
                num++;
            }
            m--;
        }


        for(int r = 0; r < n; r++){
            for(int c = 0; c < n; c++){
                System.out.print(grid[r][c]);
                System.out.print(' ');
            }
            System.out.println();
        }

    }
}
