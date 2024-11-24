import java.util.*;

public class Main {
    static int translateAtoInteger(int n, int a){
        int integer = 0;
        int digit= 0;
        while(true){
            if(n < 10){
                integer += n * Math.pow(a, digit);
                break;
            }
            integer += n%10 * Math.pow(a, digit);
            n /= 10;
            digit++;
        }
        return integer;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int a, b, n;
        a = scanner.nextInt();
        b = scanner.nextInt();
        n = scanner.nextInt();
        n = translateAtoInteger(n, a);
        // System.out.println(n);

        List<Integer> numList = new ArrayList<>();
        while(true){
            if(n<b){
                numList.add(n);
                break;
            }
            numList.add(n%b);
            n /= b;
        }
   
        Collections.reverse(numList);
        for(Integer  i : numList){
            System.out.print(i);
        }
    }
}