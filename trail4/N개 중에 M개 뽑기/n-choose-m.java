import java.util.*;

public class Main {
    static int n, m;
    static List<Integer> list = new ArrayList<>();
    static List<List<Integer>> answers  = new ArrayList<>();
    
    static void choose(int currNum, int size) {
        if (size == m) {
            answers.add(new ArrayList<>(list));
            return;
        }
        if (currNum > n || m - size > n - currNum) {
            return;
        }

        choose(currNum + 1, size);

        list.add(currNum + 1);
        choose(currNum + 1, size + 1);
        list.remove(list.size() - 1);
        // for (int i = currNum + 1; i <= n; i++) {
        //     list.add(i);
        //     choose(i,currNums size + 1);
        //     list.remove(list.size() - 1);
        // }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        // Please write your code here.
        choose(0, 0);
        for (int k = answers.size() - 1; 0 <= k; k--) {
            List<Integer> answer = answers.get(k);
            for (int i = 0; i < m; i++) {
                System.out.print(answer.get(i) + " ");
            }
            System.out.println();
        }

    }
}