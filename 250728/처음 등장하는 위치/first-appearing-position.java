import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }
        // Please write your code here.
        
        TreeMap<Integer, Integer> tree = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            if (tree.containsKey(numbers[i])) {
                continue;
            }

            tree.put(numbers[i], i + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : tree.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
    }
}