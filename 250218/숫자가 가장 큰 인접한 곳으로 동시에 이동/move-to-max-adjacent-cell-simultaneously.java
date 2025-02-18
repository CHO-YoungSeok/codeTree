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
            posX[i] = sc.nextInt();
            posY[i] = sc.nextInt();
        }
        
        // it help to make clean code.
        int[] dx = {0, 0, -1, 1};
        int[] dy = {1, -1, 0, 0};

        boolean[] delPos = new boolean[m];
        for(int second = 0; second < t; second++){
            for(int i = 0;  i < m && delPos[i] != true; i++){
                int x = posX[i];
                int y = posY[i];
                int big = 0;
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
            boolean[] tempDelPos = new boolean[m];
            for(int i = 0; i < m-1 && delPos[i] != true; i++){
                for(int j = i+1; j < m && delPos[j] != true; j++){
                    if(posX[i] == posX[j] && posY[i] == posY[j]){
                        tempDelPos[i] = true;
                        tempDelPos[j] = true;         
                    }
                }
            }
            for(int i = 0; i < m; i++) {
                if(tempDelPos[i] == true) {
                    delPos[i] = tempDelPos[i];
                }
            }

        }

        int result = 0;
        for(int i = 0;  i < m; i++){
            if(delPos[i] != true){
                result++;
            }
        }
        System.out.println(result);


    }
}