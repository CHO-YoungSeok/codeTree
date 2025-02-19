import java.util.*;

public class Main {
    static ArrayList<Integer> list = new ArrayList<>();
    static int k, n;
    
    static void choose(int digit){
        if(digit == n+1) {
            for(int i = 0; i < list.size(); i++){
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
            return;
        }

        for(int select = 1; select <= k; select++){
            list.add(select);
            choose(digit+1);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        n = sc.nextInt();

        choose(1);
    }
}