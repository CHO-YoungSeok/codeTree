import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] dx = {1, -1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        int nx = 0, ny = 0;
        char dir;
        int dis;
        for(int i = 0; i < n; i++){
            dir = scanner.next().charAt(0);
            dis = scanner.nextInt();
            for(int j =  0; j < dis; j++){
                if(dir == 'E') {
                    nx += dx[0];
                    ny += dy[0];
                } else if(dir == 'W') {
                    nx += dx[1];
                    ny += dy[1];
                } else if (dir == 'S') {
                    nx += dx[2];
                    ny += dy[2];
                } else if(dir == 'N'){
                    nx += dx[3];
                    ny += dy[3];
                }
            }
        }
        System.out.print(nx);
        System.out.print(' ');
        System.out.print(ny);
        

    }
}