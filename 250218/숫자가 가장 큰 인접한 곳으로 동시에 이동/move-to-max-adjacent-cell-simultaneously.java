import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();

        int[][] grid = new int[n][n];
        for(int i = 0;  i < n; i++){
            for(int j = 0 ;  j < n; j++){
                grid[i][j] = sc.nextInt();
            }
        }

        int[] posX = new int[m];
        int[] posY = new int[m];

        for(int i = 0; i < m; i++){
            posX[i] = sc.nextInt() -1;
            posY[i] = sc.nextInt() -1;
        }
        
        // it help to make clean code.
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        boolean[] delPos = new boolean[m];

        for(int second = 0; second < t; second++){
            for(int i = 0;  i < m; i++){
                if(delPos[i] == true) continue;

                int big = Integer.MIN_VALUE;
                int dir = 0;
                for(int j = 0;  j < 4; j++){
                    if(0 <= posX[i] + dx[j] && posX[i] + dx[j] < n && 0 <= posY[i] + dy[j] && posY[i] + dy[j] < n){
                        if(big < grid[posX[i] + dx[j]][posY[i] + dy[j]]) {
                            big = grid[posX[i] + dx[j]][posY[i] + dy[j]];
                            dir = j;
                        }
                    }
                }
                posX[i] += dx[dir];
                posY[i] += dy[dir];
            }

            boolean[] tempDelPos = new boolean[m];
     
            for(int i = 0; i < m; i++){
                if(delPos[i] == true) continue;

                for(int j = i+1; j < m; j++){
                    if(delPos[j] == true) continue;

                    if(posX[i] == posX[j] && posY[i] == posY[j]){
                        tempDelPos[i] = true;
                        tempDelPos[j] = true;         
                    }
                }
            }

            for(int i = 0; i < m; i++) {
                if(tempDelPos[i] == true)
                    delPos[i] = tempDelPos[i];
            }
        }

        int count = 0;
        for(int  i = 0; i < m; i++){
            if(delPos[i] == false) count++;
        }
        System.out.println(count);


    }
}
