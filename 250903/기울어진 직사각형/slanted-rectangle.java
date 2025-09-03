import java.util.Scanner;
public class Main {

    static int getSum(int[][] grid, int i, int j, int k, int l) {
        int[] dx = {1, 1, -1, -1};
        int[] dy = {-1, 1, 1, -1};
        int[] stepSize = {k, l, k, l};

        int sum = 0;
        int currX = i;
        int currY = j;
        for (int dir = 0; dir < 4; dir++) {
            for (int step = 0; step < stepSize[dir]; step++) {
                if (
                    0 <= currX && currX < grid.length
                    && 0 <= currY && currY < grid.length
                ) {
                    sum += grid[currX][currY];
                    currX += dx[dir];
                    currY += dy[dir];
                } else {
                    return 0;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.

        int max = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {

                for (int k = 1; k < n - 1; k++) {
                    for (int l = 1; l < n - 1; l++) {
                        int sum = getSum(grid, i,j,k,l);
                        max = Math.max(max, sum);
                    }
                }
            }
        }

        System.out.println(max);
    }
}