import java.util.*;
import java.util.stream.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] top = new int[n];
        int[] bottom = new int[n];
        for (int i = 0; i < n; i++) {
            top[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            bottom[i] = sc.nextInt();
        }
        // Please write your code here.

        int[] arr = IntStream.concat(Arrays.stream(top), Arrays.stream(bottom)).toArray();

        int len = 2 * n;
        int shiftCount = t % len;

        int[] rotated = IntStream.range(0, 2 * n)
            .map(i -> arr[(len - shiftCount + i) % len])
            .toArray();

        IntStream.range(0, n)
            .map(i -> rotated[i])
            .forEach(e -> System.out.print(e + " "));
        
        System.out.println();

        IntStream.range(n, len)
            .map(i -> rotated[i])
            .forEach(e -> System.out.print(e + " "));



    }
}