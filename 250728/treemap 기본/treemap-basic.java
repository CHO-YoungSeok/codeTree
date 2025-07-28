import java.util.Scanner;
import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        TreeMap<Integer, Integer> tree = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String cmd = sc.next();
            int n1 = 0, n2 = 0;

            switch (cmd) {
                case "add" :
                    n1 = sc.nextInt();
                    n2 = sc.nextInt();
                    tree.put(n1, n2);
                    break;
                case "find" :
                    n1 = sc.nextInt();
                    if (tree.containsKey(n1)) {
                        System.out.println(tree.get(n1));
                    } else {
                        System.out.println("None");
                    }
                    break;
                case "remove" :
                    n1 = sc.nextInt();
                    tree.remove(n1);
                    break;
                case "print_list" :
                    if (tree.isEmpty()) {
                        System.out.println("None");
                        continue;
                    }

                    for (Map.Entry<Integer, Integer> entry : tree.entrySet()) {
                        System.out.print(entry.getValue() + " ");
                    }
                    System.out.println();
                    break;
                default :     
            }


        }
        

    }
}