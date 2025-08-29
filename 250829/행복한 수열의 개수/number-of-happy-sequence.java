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

        int result = 0;
        for (int i = 0; i < n; i++) {
            int pre = grid[i][0];
            int count = 1;
            for (int j = 1; j < n;j++) {
                if (pre == grid[i][j]) {
                    count++;
                    if (count >= m) {
                        result++;
                        break;
                    }
                } else {
                    pre = grid[i][j];
                    count = 1;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            int pre = grid[0][i];
            int count = 1;
            for (int j = 1; j < n;j++) {

                if (pre == grid[j][i]) {
                    count++;
                    if (count >= m) {
                        result++;
                        break;
                    }
                } else {
                    pre = grid[j][i];
                    count = 1;
                }
            }
        }

        if (m == 1) {
            result = n * 2;
        }
        System.out.println(result);
    }
}