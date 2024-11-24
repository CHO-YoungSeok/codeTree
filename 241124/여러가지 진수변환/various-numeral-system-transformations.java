import java.util.*;

public class Main {

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int B = scanner.nextInt();
        List<Integer> changedNum = new ArrayList<>();
        while(true){
            if(N < B){
                changedNum.add(N);
                break;
            }
            changedNum.add(N%B);
            N /= B;
        }

        for(int i = changedNum.size();  i > 0; i--){
            System.out.print(changedNum.get(i-1));
        }


    }
}