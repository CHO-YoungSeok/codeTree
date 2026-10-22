import java.util.Scanner;
public class Main {

    static int[] que;
    static int qHead = 0, qTail;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        que = new int[n*n];
        for (int i = 1;  i <= arr[0]; i++) {
            que[qTail++] = 0 * n + i;
        }
        count = 1;

        while (qHead < qTail) {
            int currQTail = qTail;
            while (qHead < currQTail) {
                int curr = que[qHead++];
                int cIdx = curr / n;
                int cStep = curr % n;
                if (cIdx + cStep == n -1) {
                    System.out.println(count);
                    return;
                }
                if (cIdx + cStep > n - 1) continue;
                for (int i = 1; i <= arr[cIdx + cStep]; i++) {
                    que[qTail++] = (cIdx + cStep) * n + i;
                }
            }
            count++;
        }

        System.out.println(-1);
    }
}
