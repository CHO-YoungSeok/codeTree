import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] l = new int[n];
        int[] r = new int[n];
        int[] d = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }
        // Please write your code here.

        int len = 3 * n;
        int shift = t % len;

        int[] arr = IntStream.concat(Arrays.stream(l), 
            IntStream.concat(Arrays.stream(r), Arrays.stream(d)))
            .toArray();

        // Arrays.stream(arr)
        //     .forEach(e -> System.out.print(e + " "));

        int[] rotated = IntStream.range(0, len)
            .map(i -> arr[(len - shift + i) % len])
            .toArray();

        IntStream.range(0, len).forEach(i -> {
            System.out.print(rotated[i] + " ");

            if (i % n == n - 1) {
                System.out.println();
            }
        });







    }
}