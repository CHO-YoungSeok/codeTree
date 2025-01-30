import java.util.*;

public class Main {
    static int n;
    static int m;
    static int[][] grid;
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        grid = new int[n][m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        int max = 0;
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m-2; j++){
                sum = grid[i][j] + grid[i][j+1] + grid[i][j+2];
                if(sum > max) max = sum;
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n -2; j++){
                sum = grid[j][i] + grid[j+1][i] + grid[j+2][i];
                if(sum > max) max = sum;
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i + 1 < n && j + 1 < m){
                    sum = grid[i][j] + grid[i+1][j] + grid[i+1][j+1];
                    if(sum > max) max = sum;
                    sum = grid[i][j] + grid[i][j+1] + grid[i+1][j];
                    if(sum > max) max = sum;
                    sum = grid[i][j+1] + grid[i+1][j] + grid[i+1][j+1];
                    if(sum > max) max = sum;
                    sum = grid[i][j] + grid[i][j+1] + grid[i+1][j+1];
                    if(sum > max) max = sum;
                }
            }
        }

        System.out.println(max);   



        
    }
}