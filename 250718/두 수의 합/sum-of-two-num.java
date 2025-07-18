import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        // map.forEach((key, value) -> {
        //     System.out.println(key + " " + value);
        // });

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(k - arr[i])) {
                if (k - arr[i] == arr[i]) {
                    count += (map.get(arr[i]) * map.get(k - arr[i])) / 2;
                } else {
                    count += (map.get(arr[i]) * map.get(k - arr[i]));
                }
            } else {continue; }
            map.remove(arr[i]);
            map.remove(k - arr[i]);

            // System.out.println(count);
        }

        System.out.println(count);
    }
}