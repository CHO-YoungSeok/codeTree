import java.util.*;

public class Main {
    static int findMax(int[] field){
        int max = field[0];
        for(int i = 1;  i < field.length; i++){
            if(max < field[i]) max = field[i];
        }
        return max;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int n, k;
        n = scanner.nextInt();
        k = scanner.nextInt();
        int[] field = new int[n];
        for(int i = 0; i < k; i++){
            int a, b;
            a = scanner.nextInt();
            b = scanner.nextInt();
            for(int j = a; j <=b; j++){
                field[j-1]++;
            }
        }
        int max = findMax(field);
        System.out.println(max);

    }
}