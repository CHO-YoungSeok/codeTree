import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 명령 개수
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String cmd = sc.next();
            int x;

            switch (cmd) {
                case "add":
                    x = sc.nextInt();
                    treeSet.add(x);
                    break;
                case "remove":
                    x = sc.nextInt();
                    treeSet.remove(x);
                    break;
                case "find":
                    x = sc.nextInt();
                    System.out.println(treeSet.contains(x) ? "true" : "false");
                    break;
                case "lower_bound":
                    x = sc.nextInt();
                    Integer lower = treeSet.ceiling(x);
                    System.out.println(lower == null ? "None" : lower);
                    break;
                case "upper_bound":
                    x = sc.nextInt();
                    Integer upper = treeSet.higher(x);
                    System.out.println(upper == null ? "None" : upper);
                    break;
                case "largest":
                    if (treeSet.isEmpty()) {
                        System.out.println("None");
                    } else {
                        System.out.println(treeSet.last());
                    }
                    break;
                case "smallest":
                    if (treeSet.isEmpty()) {
                        System.out.println("None");
                    } else {
                        System.out.println(treeSet.first());
                    }
                    break;
                default:
                    // 잘못된 명령어 무시
            }
        }
    }
}
