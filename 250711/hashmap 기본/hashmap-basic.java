import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        StringBuilder sb = new StringBuilder();
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String dir = sc.next();
            if (dir.equals("add")) {
                map.put(sc.next(), sc.next());
            } else if (dir.equals("remove")) {
                map.remove(sc.next());
            } else {
                sb.append(map.getOrDefault(sc.next(), "None")).append('\n');
            }
        }
        System.out.println(sb);

        
    }
}