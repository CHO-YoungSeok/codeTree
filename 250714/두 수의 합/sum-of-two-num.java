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
        for (int i = 0; i  < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int count = 0;
        
        for (int i = 0; i < n; i++) {
            int add = 0;
            if (map.containsKey(k - arr[i])) {
                add = (map.get(arr[i]) * map.get(k - arr[i]));
                if (k - arr[i] == arr[i]) {
                    int num = map.get(k - arr[i]);
                    add = num * (num - 1) / 2;
                }
                // System.out.println(arr[i]);    
                map.remove(arr[i]);
                map.remove(k - arr[i]);
            } else {}

            count += add;
        }

        System.out.println(count);        
    }
}