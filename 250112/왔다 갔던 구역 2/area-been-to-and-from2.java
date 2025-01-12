import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int x = 0;
        char direct;
        int head = 1000;
        int[] feild = new int[2000 + 1];

        for(int i = 0 ; i < n; i++){
            x = scanner.nextInt();
            direct = scanner.next().charAt(0);

            if(direct == 'R'){
                for(int j = 1; j <= x; j++){
                    head ++;
                    feild[head]++;
                }
            }
            else if(direct == 'L'){
                for(int j = 1; j <= x; j++){
                    feild[head]++;
                    head--;
                }
            }
        }
        int answer = 0;
        for(int i = 0; i <  2001; i++){
            if(feild[i] >= 2){
                answer++;
            }
        }
        System.out.println(answer);
    }
}