import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] grid = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j  =0; j < n; j++){
                grid[i][j] = sc.nextInt();
            }
        }
        int r = sc.nextInt() -1;
        int c = sc.nextInt() -1;

        int num = grid[r][c];

        for(int i = 0;  i < num; i++){
            if(0 <= c-i)
                grid[r][c-i] = 0;
        }
        for(int i = 0;  i < num; i++){
            if(c+i < n) grid[r][c+i] = 0;
        }
        for(int i = 0;  i < num; i++){
            if(0 <= r-i) grid[r-i][c] = 0;
        }
        for(int i = 0;  i < num; i++){
            if(r+i < n) grid[r+i][c] = 0;
        }

        // for(int row = 0; row < n; row++){
        //     for(int col = 0; col < n; col++){
        //         System.out.print(grid[row][col]);
        //         System.out.print(' ');
        //     }
        //     System.out.println();
        // }        


        for(int col = 0; col < n; col++){
            int[] temp = new int[n];
            for(int i = 0; i < n; i++){
                temp[i] = 0;
            }

            int rowHead = n-1;
            for(int row = n-1; 0 <= row; row--){
                if(grid[row][col] == 0) continue;
                
                temp[rowHead] = grid[row][col];
                rowHead--;
            }
            rowHead = n -1;
            for(int row = n-1; 0 <= row; row--){
                grid[row][col] = temp[rowHead];
                rowHead--;
            }
        }

        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                System.out.print(grid[row][col]);
                System.out.print(' ');
            }
            System.out.println();
        }

    }
}