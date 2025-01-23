import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        String strCommand = scanner.next();
        int n = strCommand.length();
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        int intDir = 4;
        char charCommand;
        int nx = 0, ny = 0;

        for(int i = 0; i < n; i++) {
            charCommand = strCommand.charAt(i);
            if(charCommand == 'L'){
                intDir = (intDir-1) % 4;
            } else if(charCommand == 'R') {
                intDir = (intDir+1) % 4;
            } else if(charCommand == 'F') {
                nx += dx[intDir];
                ny += dy[intDir];
            }
        }
        System.out.print(nx);
        System.out.print(' ');
        System.out.print(ny);
    }
}