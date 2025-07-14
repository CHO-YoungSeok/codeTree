import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] words = new String[n + 1];
        for (int i = 1; i <= n; i++) {
            words[i] = sc.next();
        }
        // Please write your code here.

        HashMap<Integer, String> mapItoS = new HashMap<>();
        HashMap<String, Integer> mapStoI = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            mapItoS.put(i, words[i]);
            mapStoI.put(words[i], i);
        }
        for (int i = 0; i < m; i++) {
            String str = sc.next();
            if (str.charAt(0) <= '9' && 0 <= str.charAt(0)) {
                System.out.println(mapItoS.get(Integer.parseInt(str)));
            } else {
                System.out.println(mapStoI.get(str));
            }
        }

    }
}