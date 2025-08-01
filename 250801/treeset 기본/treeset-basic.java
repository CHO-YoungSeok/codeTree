import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.

        TreeSet<Integer> ts = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String cmd = sc.next();
            int num = 0;
            if (cmd.equals("add")) {
                num = sc.nextInt();
                ts.add(num);
            } else if (cmd.equals("remove")) {
                num = sc.nextInt();
                ts.remove(num);
            } else if (cmd.equals("find")) {
                num = sc.nextInt();
                System.out.println(ts.contains(num) ? "true" : "false");
            } else if (cmd.equals("lower_bound")) {
                num = sc.nextInt();
                Integer lower_bound = new Integer(0);
                lower_bound = ts.ceiling(num);
                System.out.println(lower_bound == null ? "None" : lower_bound);
            } else if (cmd.equals("upper_bound")) {
                num = sc.nextInt();
                Integer higher = new Integer(0);
                higher = ts.higher(num);
                System.out.println(higher == null ? "None" : higher);
            } else if (cmd.equals("largest")) {
                Integer last = new Integer(0);
                last = ts.last();
                System.out.pritnln(last == null ? "None" : last);
            } else if (cmd.equals("smallest")) {
                Integer first = new Integer(0);
                first = ts.first();
                System.out.println(first == null ? "None" : first);
            } else {}
        }



    }
}