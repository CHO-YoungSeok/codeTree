import java.util.Scanner;
import java.util.*;

public class Main {
    static int N, M;
    static Deque<Integer> stack = new ArrayDeque<>();
    static List<List<Integer>> answer = new ArrayList<>();

    public static void choose(int size) {
        if (size == M) {
            answer.add(new ArrayList<>(stack));
            return;
        }

        for (int k = 1; k < N +1; k++) {
            if (stack.isEmpty()
                    || (!stack.isEmpty() && k > stack.peek())) {
                stack.push(k);
                // System.out.println("log: " + k);
                choose(size+1);
                stack.pop();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.

        N = n; M = m;
        choose(0);
        for (int i = 0;  i < answer.size(); i++) {
            for (int k = answer.get(i).size() - 1; 0 <= k; k--) {
                System.out.print(answer.get(i).get(k) + " ");
            }
            System.out.println();
        }
    }
}