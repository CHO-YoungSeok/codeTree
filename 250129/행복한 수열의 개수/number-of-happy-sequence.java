import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m =  scanner.nextInt();
        int[][] grid = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0;  j < n; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        // if(n == 1){
        //     if(grid[0][0] == 1){
        //         System.out.print(2);
        //     }
        //     else {
        //         System.out.print(0);
        //     }
        //     return;
        // }


        int answer = 0;
        for(int i = 0; i < n; i++){
            int primeNum;
            int preNum;
            preNum = primeNum = grid[i][0];
            int count = 1;
            for(int j = 1; j < n; j++){
                if(preNum == grid[i][j]){
                    if(primeNum == preNum){
                        ++count;
                    } else {
                        primeNum = preNum;
                        count = 2;
                    }
                } else {
                    preNum = grid[i][j];
                    count = 1;
                }
                if(count >= m) {
                    break;
                }
            }    
            if(count >= m) ++answer;
        }

        for(int i = 0; i < n; i++){
            int primeNum;
            int preNum;
            preNum = primeNum = grid[0][i];
            int count = 0;
            for(int j = 0; j < n; j++){
                if(preNum == grid[j][i]){
                    if(primeNum == preNum){
                        ++count;
                    } else {
                        primeNum = preNum;
                        count = 2;
                    }
                } else {
                    preNum = grid[j][i];
                    count = 1;    
                }
                if(count >= m) {
                    break;
                }
            } 
            if(count >= m){
                ++answer;
            }
        }        

        System.out.print(answer);


    }
}