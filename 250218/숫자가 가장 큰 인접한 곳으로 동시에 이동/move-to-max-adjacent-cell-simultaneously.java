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
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        boolean[] delPos = new boolean[m];
        boolean[] tempDelPos = new boolean[m];       

        for(int second = 0; second < t; second++){
            for(int i = 0;  i < m; i++){
                if(delPos[i] == true) continue;

                int x = posX[i];
                int y = posY[i];
                int big = Integer.MIN_VALUE;
                int dir = 0;

                for(int j = 0;  j < 4; j++){
                    if(0 <= x + dx[j] && x + dx[j] < n && 0 <= y + dy[j] && y+dy[j] < n){
                        if(big < grid[x + dx[j]][y+ dy[j]]) {
                            big = grid[x + dx[j]][y+ dy[j]];
                            dir = j;
                        }
                    }
                }
                posX[i] += dx[dir];
                posY[i] += dy[dir];
            }
     
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