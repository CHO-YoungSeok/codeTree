import java.util.*;

public class Main {

    static int n;
    static int[][] grid;

    static int getSum(int i, int j, int k, int l) {

        int sum = 0;
        int[] dx = {1, 1, -1, -1};
        int[] dy = {-1, 1, 1, -1};
        int[] moveStep = {k, l, k, l};

        int currX = i;
        int currY = j;

        for (int dir = 0; dir < 4; dir++) {
            for (int step = 0; step < moveStep[dir]; step++) {
                if (
                    0 <= currX && currX < n
                    && 0 <= currY && currY < n
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
        n = sc.nextInt();
        grid = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                grid[i][j] = sc.nextInt();
        // Please write your code here.

        int max = 0;        

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 1; k < n; k++) {
                    for (int l = 1; l < n; l++) {
                        int sum = getSum(i,j,k,l);
                        // if (sum > max) {
                        //     System.out.println(
                        //         i + " " + j + " " + k + " " + l
                        //     );
                        // }
                        max = Math.max(max, sum);             
                    }
                }                       
            }
        }

        System.out.println(max);        
    }
}