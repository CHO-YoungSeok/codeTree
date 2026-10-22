import java.util.*;

public class Main {

    static int[][] points;
    static int[] picked;
    static int n, m;
    static double minDis = 200001;

    static void pick(int curr) {
        if (curr == m) {
            double maxDis = 0;
            for (int i = 0; i < m-1; i++) {
                for (int j = i+1; j < m; j++) {
                    double dis = (points[picked[i]][0] - points[picked[j]][0]) * (points[picked[i]][0] - points[picked[j]][0])
                                + (points[picked[i]][1] - points[picked[j]][1]) * (points[picked[i]][1] - points[picked[j]][1]);
                    maxDis = Math.max(maxDis, dis);
                }
            }
            minDis = Math.min(minDis, maxDis);
            return;
        }

        for (int i = 0; i < n; i++) {
            if (curr != 0 && !(picked[curr - 1] < i)) continue;
            picked[curr] = i;
            pick(curr + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        points = new int[n][2];
        picked = new int[m];
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
        }
        // Please write your code here.

        pick(0);
        System.out.println(String.format("%.0f", minDis));
    }
}