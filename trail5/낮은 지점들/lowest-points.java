import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, Integer> map = new HashMap<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (map.containsKey(x)) {
                map.put(x, Math.min(map.get(x), y));
            } else {
                map.put(x, y);
            }
        }
        long sum = 0;
        for (int v : map.values()) {
            sum += v;
        }
        System.out.print(sum);

    }
}