import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> jenga = new ArrayList<>();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            jenga.add(sc.nextInt());
        }
        int s1 = sc.nextInt();
        int e1 = sc.nextInt();
        int s2 = sc.nextInt();
        int e2 = sc.nextInt();

        ArrayList<Integer> temp = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(s1 <= i+1 && i+1 <= e1) continue;
            temp.add(jenga.get(i));
        }
        jenga = temp;

        temp = new ArrayList<>();
        for(int i = 0; i < n + s1 - e1 -1; i++){
            if(s2 <= i+1 && i+1 <= e2) continue;
            temp.add(jenga.get(i));
        }
        jenga = temp;

        System.out.println(jenga.size());
        
        Iterator<Integer> iterator = jenga.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        



    }
}