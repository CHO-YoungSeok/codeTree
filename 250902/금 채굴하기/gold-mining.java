import java.util.Scanner;

public class Main {

    static int getGoldNum(int[][] grid, int r, int c, int k) {
        if (k == 0) {
            return grid[r][c];
        }

        int[] dx = {1, 1, -1, -1};
        int[] dy = {-1, 1, 1, -1};
        int currX = r - k;
        int currY = c;
        int sum = 0;
        for (int dir = 0; dir < 4; dir++) {
            for (int step = 0; step < k; step++) {
                if (
                    0 <= currX && currX < grid.length
                    && 0 <= currY && currY < grid.length
                ) {
                    sum += grid[currX][currY];
                }

                currX += dx[dir];
                currY += dy[dir];
            }
        }

        return sum;
    }

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
                int sum = 0;

                for (int k = 0; k < 2 * (n - 1); k++) {
                    sum += getGoldNum(grid, i, j, k);

                    if (sum * m >= Math.pow(k, 2) + Math.pow(k+1, 2)) {
                        max = Math.max(max, sum);
                    }
                }
            }
        }

        System.out.println(max);


    }
}