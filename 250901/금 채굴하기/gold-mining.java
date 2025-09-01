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

                for (int k = 1; k <= 2 * (n - 1); k++) {
                    int currX = i - k;
                    int currY = j;
                    for (int p = 0; p < 4; p++) {
                        for (int a = 0; a < k; a++) {
                            if (0 <= currX && currX < n
                                && 0 <= currY && currY < n
                            ) {
                                sum += grid[currX][currY];
                                // System.out.println(currX + ", "+ currY);
                            }
                            
                            currX += dx[p];
                            currY += dy[p];

                        }
                    }
                    if (sum * m >= Math.pow(k, 2) + Math.pow((k+1), 2)) {
                        max = Math.max(max, sum);
                    }    
                }
            }
        }

        System.out.println(max);
    }
}