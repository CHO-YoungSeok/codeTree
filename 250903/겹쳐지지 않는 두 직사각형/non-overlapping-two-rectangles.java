import java.util.Scanner;

public class Main {

    static int[][] grid;

    static int getSum(int i, int j, int k, int l) {

        int sum = 0;

        for (int a = i; a <= i + k; a++) {
            for (int b = j; b <= j+l; b++) {
                if (
                    0 <= a &&  a < grid.length
                    && 0 <= b && b < grid.length
                ) {
                    sum += grid[a][b];
                }
                else {
                    return Integer.MIN_VALUE;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = sc.nextInt();
            }
        }

        // Please write your code here.
        int max = grid[0][0];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int k = 0; k < n; k++) {
                    for (int l = 0; l < m; l++) {

                        for (int i2 = 0; i2 < n; i2++) {
                            for (int j2 = 0; j2 < m; j2++) {
                                for (int k2 = 0; k2 < n; k2++) {
                                    for (int l2 = 0; l2 < m; l2++) {
                                        if (
                                            i + k < i2 || j + l < j2
                                        ) {
                                            int sum1 = getSum(i, j, k, l);
                                            int sum2 = getSum(i2, j2, k2, l2);
                                            if (
                                                sum1 != Integer.MIN_VALUE && sum2 != Integer.MIN_VALUE
                                            ) {
                                                max = Math.max(max, sum1 + sum2);
                                            }
                                        }                                                                              
                                        
                                    }
                                }
                            }
                        }

                    }
                }
            }
        }

        System.out.println(max);
    }
}