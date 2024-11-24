import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int integerFromN;
        int i = 0;
        int integer = 0;
        while(true){
            if(N < 10){
                integer += N%10 * Math.pow(2,i);
                break;
            }
            integer += N%10 * Math.pow(2,i);
            N /= 10;
            i++;
        }       
        // System.out.println(integer);
        integer *= 17;

        List<Integer> numList = new ArrayList<>();
        while(true){
            if(integer<2){
                numList.add(integer);
                break;
            }
            numList.add(integer%2);
            integer /= 2;
        }
        for(i = numList.size();  i > 0;  i--){
            System.out.print(numList.get(i-1));
        }

    }
}