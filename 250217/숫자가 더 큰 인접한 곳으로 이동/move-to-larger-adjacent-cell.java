import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt() -1;
        int c = sc.nextInt() -1;

        int[][] grid = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int  j = 0; j < n; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        while(true){
            System.out.print(grid[r][c]);
            System.out.print(' ');
            if(0 <= r-1 && grid[r][c] < grid[r-1][c]) {
                r--;
            } else if(r+1 < n && grid[r][c] < grid[r+1][c]){
                r++;
            } else if(0 <= c-1 && grid[r][c] < grid[r][c-1]) {
                c--;
            } else if(c+1 < n && grid[r][c] < grid[r][c+1]){
                c++;
            } else break;            
        }
    }
}