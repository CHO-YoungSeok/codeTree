import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int n;
    static int count = 0;
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // Please write your code here.
        choose(1);
        System.out.println(count);

    }
    
    static void choose(int position){
        if(n < position){
            if(n+1 == position) {
                count++;
            }
            return;
        }

        for(int  i = 1;  i <= 4; i++){
            for(int j = 0; j < i; j++){
                list.add(i);
            }
            choose(list.size() +1);
            for(int j = list.get(list.size() -1); 0 < j; j--){
                list.remove(list.size() -1);
            }
        }

    }
}