import java.util.Scanner;

public class Main {
    static int n;
    static int[][] grid;
    static boolean[] visitedCol;
    static int max = 0;
    
    static void pick(int curr, int currMin) {
        if (curr == n) {       
            if (currMin <= max) return;  
            max = Math.max(max, currMin);
            return;
        }

        for (int c = 0; c < n; c++) {
            if (visitedCol[c]) continue;
            visitedCol[c] = true;
            pick(curr + 1, Math.min(currMin, grid[curr][c]));
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
        pick(0, Integer.MAX_VALUE);
        System.out.println(max);
    }
}