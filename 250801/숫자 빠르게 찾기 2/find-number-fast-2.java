import java.util.Scanner;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] queries = new int[m];
        for (int i = 0; i < m; i++)
            queries[i] = sc.nextInt();
        // Please write your code here.

        TreeSet<Integer> treeSet = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            treeSet.add(arr[i]);
        }

        for (int i = 0; i < m; i++) {
            Integer ceiling = new Integer(0);
            ceiling = treeSet.ceiling(queries[i]);
            System.out.println(ceiling == null ? -1 : ceiling);



            
            
        }
    }
}