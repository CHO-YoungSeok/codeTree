import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        LinkedList<Integer> leftBelt = new LinkedList<>();
        LinkedList<Integer> rightBelt = new LinkedList<>();
        LinkedList<Integer> bottomBelt = new LinkedList<>();

        for(int i = 0; i < n; i++){
            leftBelt.addLast(sc.nextInt());
        }
        for(int i = 0; i < n; i++){
            rightBelt.addLast(sc.nextInt());
        }
        for(int i = 0; i < n; i++){
            bottomBelt.addLast(sc.nextInt());
        }

        for(int i = 0; i < t; i++){
            leftBelt.addFirst(bottomBelt.pollLast());
            rightBelt.addFirst(leftBelt.pollLast());
            bottomBelt.addFirst(rightBelt.pollLast());
        }

        Iterator<Integer> iterator = leftBelt.iterator();
        while(iterator.hasNext()){
            System.out.print(String.format("%d ", iterator.next()));
        }
        System.out.println();
        
        iterator = rightBelt.iterator();
        while(iterator.hasNext()){
            System.out.print(String.format("%d ", iterator.next()));
        }
        System.out.println();
        
        iterator = bottomBelt.iterator();
        while(iterator.hasNext()){
            System.out.print(String.format("%d ", iterator.next()));
        }
        System.out.println();

        
    }
}