import java.util.*;

public class Main {
    static int n, m;
    static List<Integer> list = new ArrayList<>();
    
    static void choose(int currNum, int size) {
        if (size == m) {
            for (int i = 0; i < m; i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
        if (currNum > n || m - size > n - currNum) {
            return;
        }
        for (int i = currNum + 1; i <= n; i++) {
            list.add(i);
            choose(i, size + 1);
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // Please write your code here.
        choose(0, 0);        

    }
}