import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        // Please write your code here.

        TreeMap<String, Integer> tree = new TreeMap<>();
        for (int i = 0;i < n; i++) {
            if (tree.containsKey(arr[i])) {
                tree.put(arr[i], tree.get(arr[i]) + 1);
            } else {
                tree.put(arr[i], 1);
            }
        }

        for (Map.Entry<String, Integer> entry : tree.entrySet()) {
            System.out.println(String.format("%s %.4f", entry.getKey(), entry.getValue() * 100 / (double)n ));
        }
    }
}