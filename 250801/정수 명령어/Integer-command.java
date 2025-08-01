import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int tc = 0; tc < t; tc++) {
            TreeSet<Integer> treeSet = new TreeSet<>();
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                char command = sc.next().charAt(0);
                int num = sc.nextInt();
                // Please write your code here.
                if (command == 'I') {
                    treeSet.add(num);
                } else { // command == 'D';
                    if (treeSet.isEmpty()) continue;

                    if (num == 1) {
                        treeSet.pollLast();
                    } else { // num == -1
                        treeSet.pollFirst();
                    }
                }                         
            }
            System.out.println(treeSet.isEmpty() ? "EMPTY" :
            treeSet.last() + " " + treeSet.first());
            treeSet.clear();
        }
    }
}