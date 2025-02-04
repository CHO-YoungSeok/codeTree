import java.util.*;

public class Main {
    static final int MAX_N = 20;
    static int n, m;
    static int[][] grid = new int[MAX_N][MAX_N];
    
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        int maxGold = 0;
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                grid[row][col] = sc.nextInt();
            }
        }

        for(int row = 0;  row < n; row++){
            for(int col = 0; col < n; col++){
                for(int k = 0; k <= 2*(n-1); k++){
                    int numOfGold = getNumOfGold(row, col, k);

                    if(numOfGold * m >= getArea(k))
                        maxGold = Math.max(maxGold, numOfGold);
                }
            }
        }

        System.out.print(maxGold);

    }

    static int getArea(int k){
        return k * k + (k+1)*(k+1);
    }

    static int getNumOfGold(int row, int col, int k){
        int numOfGold = 0;
        for(int i = 0;  i < n; i++){
            for(int j = 0; j < n ;j++){
                if(Math.abs(row-i) + Math.abs(col-j) <= k){
                    numOfGold += grid[i][j];
                }
            }
        }
        return numOfGold;
    }
}