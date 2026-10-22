import java.util.*;

public class Main {

    static int[][] points;
    static int[] picked;
    static int n, m;
    static double minDis = 200001;

    static void pick(int curr, int start) {
        if (curr == m) {
            double maxDis = 0;
            for (int i = 0; i < m-1; i++) {
                for (int j = i+1; j < m; j++) {
                    double dis = Math.pow((points[picked[i]][0] - points[picked[j]][0]), 2)
                                + Math.pow((points[picked[i]][1] - points[picked[j]][1]), 2);
                    maxDis = Math.max(maxDis, dis);
                    if (maxDis >= minDis) return;
                }
            }
            minDis = Math.min(minDis, maxDis);
            return;
        }

        for (int i = start; i < n; i++) {
            picked[curr] = i;
            pick(curr + 1, i + 1);
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

        pick(0, 0);
        System.out.println(String.format("%.0f", minDis));
    }
}