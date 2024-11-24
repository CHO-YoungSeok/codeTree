import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int binary = scanner.nextInt();
        int integer = 0;
        int extra, cnt = 0;
        while(true){
            if(binary == 0) break;
            extra  = binary % 10;
            binary /= 10;
            integer += extra * (Math.pow(2, cnt));
            cnt += 1;
        }
        System.out.println(integer);
    }
}