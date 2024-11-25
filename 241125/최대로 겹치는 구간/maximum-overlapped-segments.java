import java.util.*;

public class Main {
    
    static int findMax(int[] field){
        int max = field[0];
        for(int i = 1;  i < field.length; i++){
            if(max < field[i]){
                max = field[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] field = new int[201];
        final int OFF_SET = 100;
        for(int i = 0; i<n; i++){
            int start, end;
            start = scanner.nextInt();
            end = scanner.nextInt();
            start += OFF_SET;
            end += OFF_SET;
            for(int j = start; j < end; j++){
                field[j] += 1;
            }
        }

        int max = findMax(field);
        System.out.print(max);


    }
}