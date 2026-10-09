import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0;  i < n; i++) {
            if (countMap.containsKey(arr[i])) {
                countMap.put(arr[i], countMap.get(arr[i]) + 1);
            } else {
                countMap.put(arr[i], 1);
            }
        }

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            // Please write your code here.
            int ans = 0;
            if (countMap.containsKey(x))
                ans = countMap.get(x);
            
            System.out.println(ans);

        }
    }
}