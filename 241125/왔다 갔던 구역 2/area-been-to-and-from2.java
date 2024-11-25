import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] field = new int[2001];
        int location = 1000;
        for(int i = 0; i < n; i++){ 
            int stride;
            char arrow;
            stride = scanner.nextInt();
            arrow  = scanner.next().charAt(0);
            
            if(arrow == 'R'){
                for(int j = 0; j < stride; j++){
                    if(location == 1000){
                        j--;
                        location++;
                        continue;
                    }                      
                    location++;
                    field[location] += 1;
                }
            } else {
                for(int j = 0; j < stride; j++){
                    if(location == 1000){
                        j--;
                        location--;
                        continue;
                    }                      
                    location--;
                    field[location] += 1;
                }
            }
        }

        int count = 0;
        for(int i =0 ; i < 2001; i++){
            if(field[i] >= 2){
                count++;
            }
        }
            
        System.out.println(count);

    }
}