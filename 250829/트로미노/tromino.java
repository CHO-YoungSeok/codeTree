import java.util.*;

public class Main {

    static int[][][] shapes = new int [][][] {
        {
            {1, 1, 0},
            {1, 0, 0},
            {0, 0, 0}
        },
        {
            {1, 1, 0},
            {0, 1, 0},
            {0, 0, 0}
        },
        {
            {0, 1, 0},
            {1, 1, 0},
            {0, 0, 0}
        },
        {
            {1, 0, 0},
            {1, 1, 0},
            {0, 0, 0}
        },
        {
            {1, 1, 1},
            {0, 0, 0},
            {0, 0, 0}
        },
        {
            {1, 0, 0},
            {1, 0, 0},
            {1, 0, 0}
        }
    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        // Please write your code here.
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                for (int s = 0; s < 6; s++) {
                    int sum = 0;
                    boolean isRight = true;

                    for (int x = 0; x < 3; x++) {
                        for (int y = 0; y < 3; y++) {
                            if (shapes[s][x][y] == 0) continue;
                            
                            // if (i + x < 0 || j + y < 0) {
                            //     System.out.println("hi: " + i + " " + x + " " 
                            //     + j + ' ' + y);
                            //     return;
                            // }
                            if (i + x < n && j + y < m) {
                                sum += grid[i + x][j + y];
                            } else {
                                isRight = false;
                            }
                        }
                    }
                    if (isRight)
                        max = Math.max(max, sum);
                }             
            }
        }

        System.out.println(max);

    }
}