import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;


class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return x + " " + y;
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

        PriorityQueue<Point> pq = new PriorityQueue<>(
            Comparator.comparingInt((Point d) -> d.x + d.y)
            .thenComparingInt(d -> d.x)
            .thenComparingInt(d -> d.y)
        );

        for (int i = 0; i < n; i++) {
            pq.add(new Point(points[i][0], points[i][1]));
        }

        for (int i = 0; i < m; i++) {
            Point p = pq.poll();
            pq.add(new Point(p.x + 2, p.y + 2));
        }

        System.out.println(pq.poll());
        
    }
}