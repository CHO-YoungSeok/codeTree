import java.util.*;

public class Main {
    static int n, m, maxXOR;
    static boolean[] visited;
    static int[] A;

    public static int calcXOR() {
        int val = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                val ^= A[i];
            }
        }
        return val;
    }

    public static void choose(int currIdx, int size) {
        if (size == m) {
            maxXOR = Math.max(maxXOR, calcXOR());
            return;
        }

        if (currIdx == n) {
            return;
        }

        choose(currIdx + 1, size);
        visited[currIdx] = true;
        choose(currIdx + 1, size + 1);
        visited[currIdx] = false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        // Please write your code here.
        visited = new boolean[n];
        choose(0, 0);
        System.out.println(maxXOR);
    }
}