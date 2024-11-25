import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] field = new int[2000];
        int location = 1000;
        for(int i = 0; i < n; i++){ 
            int stride;
            char arrow;
            stride = scanner.nextInt();
            arrow  = scanner.next().charAt(0);
            
            if(arrow == 'R'){
                for(int j = 0; j < stride; j++){                   
                    field[location] += 1;
                    location++;
                }
            } else {
                for(int j = 0; j < stride; j++){
                    location--;
                    field[location] += 1;
                }
            }
        }

        int count = 0;
        for(int i =0 ; i < 2000; i++){
            if(field[i] >= 2){
                count++;
            }
        }
            
        System.out.println(count);

    }
}