import java.util.Scanner;

public class Main {
    static int n, m, maxXOR;
    static int[] A;

    static void choose(int currIdx, int size, int sumXOR) {
        if (size == m) {
            maxXOR = Math.max(maxXOR, sumXOR);
            return;
        }
        if (currIdx == n || m - size > n - currIdx) {
            return;
        }

        choose(currIdx + 1, size, sumXOR);
        choose(currIdx + 1, size + 1, sumXOR ^ A[currIdx]);
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
        choose(0, 0, 0);
        System.out.println(maxXOR);
    }
}