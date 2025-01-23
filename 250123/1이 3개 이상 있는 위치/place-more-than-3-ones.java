import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [][] grid= new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                grid[i][j] = scanner.nextInt();
            }
        }

        int result = 0;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int nx, ny;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int count = 0;
                for(int k = 0; k < 4; k++){
                    nx = i + dx[k];
                    ny = j + dy[k];
                    if(0 <= nx && nx < n && 0<= ny && ny < n) {
                        if(grid[nx][ny] == 1){
                            ++count;
                        }
                    }
                }
                if(count >= 3) ++result;
            }
        }

        System.out.print(result);


    }
}