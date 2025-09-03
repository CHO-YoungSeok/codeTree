import java.util.Scanner;

public class Main {
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

        int max = grid[0][0] + grid[0][1];

        for (int r1 = 0; r1 < n; r1++) {
            for (int c1 = 0; c1 < m; c1++) {
                for (int r2 = r1; r2 < n; r2++) {
                    for (int c2 = c1; c2 < m; c2++) {

                        for (int r3 = 0; r3 < n; r3++) {
                            for (int c3 = 0; c3 < m; c3++) {
                                for (int r4 = r3; r4 < n; r4++) {
                                    for (int c4 = c3; c4 < m; c4++) {
                                        if (r2 < r3 || c2 < c4) {
                                            int sum = 0;

                                            for (int a = r1; a <= r2; a++) {
                                                for (int b = c1; b <= c2; b++) {
                                                    sum += grid[a][b];
                                                }
                                            }
                                            for (int a = r3; a <= r4; a++) {
                                                for (int b = c3; b <= c4; b++) {
                                                    sum += grid[a][b];
                                                }
                                            }
                                            max = Math.max(max, sum);                             
                                        } else {
                                            break;
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