import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] grid = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                grid[i][j] = scanner.nextInt();
            }
        }
        int[] dx = {-1, 0, 1, -1, 0, 1, -1, 0, 1};
        int[] dy = {1, 1, 1, 0, 0, 0, -1, -1, -1};
        int max = 0;
        for(int i = 1; i < n-1; i++){
            for(int j = 1; j < n-1; j++){
                int count = 0;
                for(int k = 0; k < 9; k++){
                    if(grid[i + dy[k]][j + dx[k]] == 1){
                        ++count;
                    }
                }
                if(count > max) max = count;
            }
        }
        System.out.print(max);
    }
}