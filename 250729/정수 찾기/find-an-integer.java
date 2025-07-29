import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] B = new int[m];
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }
        // Please write your code here.

        HashSet<Integer> setA = new HashSet<>();
        
        for (int a : A) {
            setA.add(a);
        }

        StringBuilder sb = new StringBuilder();
        for (int b : B) {
            if (setA.contains(b)) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);


    }
}