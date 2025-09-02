import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.

        int[] dx = {1, 1, -1, -1};
        int[] dy = {-1, 1, 1, -1};
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = grid[i][j];
                max = Math.max(max, sum);

                for (int k = 1; k <= n; k++) {
                    int currX = i - k;
                    int currY = j;
                    for (int dir = 0; dir < 4; dir++) {
                        for (int step = 0;  step < k; step++) {
                            if (
                                0 <= currX && currX < n
                                && 0 <= currY && currY < n
                            ) {
                                sum += grid[currX][currY];
                            }
                            
                            currX += dx[dir];
                            currY += dy[dir];
                        }
                    }
                    if (sum * m >= Math.pow(k,2) + Math.pow(k+1, 2)) {
                        max = Math.max(max, sum);
                    }
                }
            }
        }

        System.out.println(max);
    }
}