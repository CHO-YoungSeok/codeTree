import java.util.*;

public class Main {
    static int n, m;
    static List<Integer> list = new ArrayList<>();
    
    static void choose(int currNum, int size) {
        if (size == m) {
            for (int k : list) {
                System.out.print(k + " ");
            }
            System.out.println();
            return;
        }
        if (currNum > n || m - size > n - currNum) {
            return;
        }

        list.add(currNum + 1);
        choose(currNum + 1, size + 1);
        list.remove(list.size() - 1);

        choose(currNum + 1, size);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // Please write your code here.
        choose(0, 0);
    }
}