import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;

class Dot {
    int x, y, distance;

    Dot(int x, int y) {
        this.x = x;
        this.y = y;
        this.distance = x + y;
    }

    void printDot() {
        System.out.print(x + " " + y);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        // Please write your code here.

        PriorityQueue<Dot> pq = new PriorityQueue<>((a, b) -> 
            (a.x + a.y) - (b.x + b.y)
        );

        for (int i = 0; i < n; i++) {
            pq.add(new Dot(points[i][0], points[i][1]));
        }

        for (int i = 0; i < m; i++) {
            Dot dot = pq.poll();
            pq.add(new Dot(dot.x + 2, dot.y + 2));
            // System.out.println(dot.x + " " + dot.y);
        }

        pq.poll().printDot();        
    }
}