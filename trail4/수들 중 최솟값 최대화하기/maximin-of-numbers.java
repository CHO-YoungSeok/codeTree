import java.util.Scanner;

public class Main {
    static int max = 0;
    static boolean[] visitedCol;
    static int[][] grid;
    static int n;

    static void combine(int row, int currMin) {
        if (currMin <= max) return;
        if (row == n) {
            max = Math.max(max, currMin);
            return;
        }

        for (int c = 0; c < n; c++) {
            if (visitedCol[c]) continue;
            visitedCol[c] = true;
            combine(row + 1, Math.min(currMin, grid[row][c]));
            visitedCol[c] = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        grid = new int[n][n];
        visitedCol = new boolean[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = sc.nextInt();
            }
        }
        // Please write your code here.
        combine(0, Integer.MAX_VALUE);
        System.out.println(max);
        
    }
}