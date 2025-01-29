import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] grid = new int[n][n];
        for(int  i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                grid[i][j] = scanner.nextInt();
            }
        }
        int answer = 0;
        for(int row = 0; row < n; row++){
            int count = 1;
            int preNum = grid[row][0];
            for(int col = 1; col < n; col++){
                if(preNum == grid[row][col]) {
                    ++count;
                    // System.out.println(grid[row][col]);
                }
                preNum = grid[row][col];
            }
            if(count >= m) ++answer;
        }
        for(int col = 0; col < n; col++){
            int count = 1;
            int preNum = grid[0][col];
            for(int row = 1; row < n; row++){
                if(preNum == grid[row][col]) {
                    ++count;
                    // System.out.println(grid[row][col]);
                }
                preNum = grid[row][col];
            }
            if(count >= m) ++answer;
        }

        System.out.print(answer);


    }
}