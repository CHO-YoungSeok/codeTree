import java.util.*;

public class Main {

    static int n;
    static int[][] grid;

    static int getSum(int r1, int c1, int r2, int c2, int r3, int c3) {
        int r4 = r3 - (r2 - r1);
        int c4 = r4 - r1 + c1;
        int currX = r1;
        int currY = c1;
        int sum = 0;

        if (
            0 <= r1 && r1 < n
            && 0 <= r2 && r2 < n
            && 0 <= r3 && r3 < n
            && 0 <= r4 && r4 < n
            && 0 <= c1 && c1 < n
            && 0 <= c2 && c2 < n
            && 0 <= c3 && c3 < n
            && 0 <= c4 && c4 < n
        ) {
            for (int r = r1; r < r2; r++) {                
                sum += grid[currX][currY];
                currX++;
                currY--;
            }
            for (int r = r2; r < r3; r++) {
                sum += grid[currX][currY];
                currX++;
                currY++;
            }
            for (int r = r3; r4 < r; r--) {
                sum += grid[currX][currY];
                currX--;
                currY++;
            }
            for (int r = r4; r1 < r; r--) {
                sum += grid[currX][currY];
                currX--;
                currY--;
            }

            return sum;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.

        int max = 0;        

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                for (int c1 = j - 1; 0 <= c1; c1--) {
                    int r1 = j - c1 + i;

                    for (int c2 = c1 + 1; c2 < n - 1; c2++) {
                        int r2 = c2 - c1 + r1;
                        int sum = getSum(i, j, r1, c1, r2, c2);
                        // if (sum > max) {
                        //     System.out.println(i + " " + j + " " + r1 + " " + c1
                        //         + " " +  r2 + " " + c2);
                        // }
                        max = Math.max(max, sum);
                       

                    }
                }              
            }
        }

        System.out.println(max);        
    }
}