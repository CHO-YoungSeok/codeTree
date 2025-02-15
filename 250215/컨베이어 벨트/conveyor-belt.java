import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        LinkedList<Integer> topBelt = new LinkedList<>();
        LinkedList<Integer> bottomBelt = new LinkedList<>();

        for(int i = 0; i < n; i++){
            topBelt.addLast(sc.nextInt());
        }
        for(int  i= 0; i < n; i++) {
            bottomBelt.addLast(sc.nextInt());
        }

        for(int i = 0; i < t; i++){
            int lastTop = topBelt.pollLast();
            int lastBottom = bottomBelt.pollLast();

            topBelt.addFirst(lastBottom);
            bottomBelt.addFirst(lastTop);
        }

        Iterator<Integer> iterator = topBelt.iterator();
        while(iterator.hasNext()){
            System.out.print(String.format("%d ", iterator.next()));
        }
        System.out.println();

        iterator = bottomBelt.iterator();
        while(iterator.hasNext()){
            System.out.print(String.format("%d ", iterator.next()));
        }

    }
}