import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner  = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        while(true) {
            if(n < 2){
                arr.add(n);
                break;
            }

            int k = n % 2;
            n /= 2;
            arr.add(k);
        }
        // System.out.println(arr.size());
        for(int i = arr.size(); i > 0; i--){
            System.out.print(arr.get(i-1));
        }



    }
}
